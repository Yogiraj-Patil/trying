package in.codecore.yogiraj.trynewdrawerlayout.attendence;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.animation.BounceInterpolator;
import in.codecore.yogiraj.trynewdrawerlayout.R;
import in.codecore.yogiraj.trynewdrawerlayout.toolbars.IconNavigationClickListener;

import java.util.ArrayList;

public class Attendence extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendence);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbars);
        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new IconNavigationClickListener(this,findViewById(R.id.nested_view_scroll)
        ,new BounceInterpolator(),this.getResources().getDrawable(R.drawable.icon),
                this.getResources().getDrawable(R.drawable.arrow_down)));

        ArrayList list = new ArrayList<String>();
        list.add("Jan");list.add("Feb");list.add("Mar");list.add("Apr");list.add("May");list.add("Jun");list.add("Jul");
        list.add("Aug");list.add("Sept");list.add("Oct");list.add("Nov");list.add("Dec");


         //String[] list ={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        ArrayList<Main_item> main_items = new ArrayList<>();
        main_items.add(new Main_item("2018",list));
        main_items.add(new Main_item("2017",list));
        main_items.add(new Main_item("2016",list));
        main_items.add(new Main_item("2015",list));
       /* main_items.add(new Main_item("2022",list));
        main_items.add(new Main_item("2023",list));
        main_items.add(new Main_item("2024",list));
        main_items.add(new Main_item("2025",list));
        main_items.add(new Main_item("2026",list));
        main_items.add(new Main_item("2027",list));
        main_items.add(new Main_item("2028",list));
        main_items.add(new Main_item("2029",list));
        main_items.add(new Main_item("2030",list));
        main_items.add(new Main_item("2031",list));*/

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        RecyclerView.Adapter  adapter = new Main_item_Adapter(main_items,this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
