package com.example.michelle.driverbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class insurance_edit_profile extends AppCompatActivity {

   public Button but4;

   public void init()
   {
       but4=(Button)findViewById(R.id.edit_done);
       but4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent d=new Intent(insurance_edit_profile.this,insurance_profile.class);
           }
       });
   }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insurance_edit_profile);
        init();
    }

    public static class insurance_popwindow {
    }
}
