package in.codecore.yogiraj.trynewdrawerlayout.attendence;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import in.codecore.yogiraj.trynewdrawerlayout.R;

import java.util.ArrayList;

public class Main_item_Adapter extends RecyclerView.Adapter<Main_item_Adapter.Main_view_Holder> {
    private ArrayList<Main_item> main_items;
    public Context context;

    public Main_item_Adapter(ArrayList<Main_item> main_items,Context context){
        this.main_items = main_items;
        this.context = context;
    }

    @NonNull
    @Override
    public Main_view_Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.main_recycler_view,viewGroup,false);
        return new Main_view_Holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final Main_view_Holder main_view_holder, int i) {
        final Main_item main_item = main_items.get(i);
        final int recycler_position = i;
        main_view_holder.year.setText(main_item.getYear_titel());
        ArrayAdapter adapter = new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,main_item.getList_title());
        main_view_holder.listView.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
        main_view_holder.listView.setAdapter(adapter);
        main_view_holder.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(context,"Position:"+position+"\nID:"+id+"\nRecycler Position:"+recycler_position,Toast.LENGTH_SHORT).show();
                Toast.makeText(context,"Clicked on:"+main_item.getYear_titel()+"\n"+((TextView)view).getText(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return main_items.size();
    }

    ///////////////////////////////////////////////////////////////
    //////////View Holder Class
    ///////////////////////////////////////////////////////////////

    public static class Main_view_Holder extends RecyclerView.ViewHolder{

        public TextView year;
        public ListView listView;

        public Main_view_Holder(@NonNull View itemView) {
            super(itemView);
            year = itemView.findViewById(R.id.text_year);
            listView = itemView.findViewById(R.id.listView1);
        }
    }
}
