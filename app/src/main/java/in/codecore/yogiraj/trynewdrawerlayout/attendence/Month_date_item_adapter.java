package in.codecore.yogiraj.trynewdrawerlayout.attendence;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import in.codecore.yogiraj.trynewdrawerlayout.R;

import java.util.ArrayList;

public class Month_date_item_adapter extends RecyclerView.Adapter<Month_date_item_adapter.Month_view_holder>  {
    private ArrayList<Month_date_item> month_date_items;
    public Context ctx;

    public Month_date_item_adapter(ArrayList<Month_date_item> month_date_items, Context ctx) {
        this.month_date_items = month_date_items;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public Month_view_holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.month_cardview,viewGroup,false);
        return new Month_view_holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Month_view_holder month_view_holder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class Month_view_holder extends RecyclerView.ViewHolder{
        public TextView text_date;
        public TextView text_data;

        public Month_view_holder(@NonNull View itemView) {
            super(itemView);

            text_data = itemView.findViewById(R.id.days_comment);
            text_date = itemView.findViewById(R.id.date_title);
        }
    }
}
