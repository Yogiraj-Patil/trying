package in.codecore.yogiraj.trynewdrawerlayout.attendence;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.animation.BounceInterpolator;
import in.codecore.yogiraj.trynewdrawerlayout.R;
import in.codecore.yogiraj.trynewdrawerlayout.toolbars.IconNavigationClickListener;

import java.util.ArrayList;

public class GridMonthDay_Present extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_month_day__present);

        Toolbar toolbar = (Toolbar)findViewById(R.id. month_toolbar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new IconNavigationClickListener(this,findViewById(R.id.nested_view_scroll)
                ,new BounceInterpolator(),this.getResources().getDrawable(R.drawable.icon),
                this.getResources().getDrawable(R.drawable.arrow_down)));

        ArrayList list = new ArrayList<String>();
        list.add("1");list.add("2");list.add("3");list.add("4");list.add("5");list.add("6");list.add("7");
        list.add("8");list.add("9");list.add("10");list.add("11");list.add("12");list.add("13");list.add("14");
        list.add("15");list.add("16");list.add("17");list.add("18");list.add("19");list.add("20");list.add("21");
        list.add("22");list.add("23");list.add("24");list.add("25");list.add("26");list.add("27");list.add("28");
        list.add("29");list.add("30");

        ArrayList list1 = new ArrayList<String>();
        list1.add("pass");

        ArrayList<Month_date_item> arrayList = new ArrayList<>();


    }
}
