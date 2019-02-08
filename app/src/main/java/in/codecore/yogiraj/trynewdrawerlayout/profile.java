package in.codecore.yogiraj.trynewdrawerlayout;

import android.content.Intent;
import android.support.design.button.MaterialButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import in.codecore.yogiraj.trynewdrawerlayout.attendence.Attendence;
import in.codecore.yogiraj.trynewdrawerlayout.toolbars.IconNavigationClickListener;


public class profile extends AppCompatActivity {


    MaterialButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btn = (MaterialButton)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profile.this,Attendence.class));
            }
        });

        toolbar.setNavigationOnClickListener(new IconNavigationClickListener(this,findViewById(R.id.constraint_view_product_grid),
                new AccelerateDecelerateInterpolator(),this.getResources().getDrawable(R.drawable.icon),
                this.getResources().getDrawable(R.drawable.icon)));


    }





}
