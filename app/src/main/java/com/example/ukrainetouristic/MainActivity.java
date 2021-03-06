package com.example.ukrainetouristic;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_activity);

    }

    public void process(View view) {
        Intent intent = null;
        if (view.getId() == R.id.LaunchMap) {
            intent = new Intent(this, MapActivity.class);

            startActivity(intent);
        }
        if (view.getId() == R.id.LaunchCategory) {
            intent = new Intent(this, Category_menu.class);

            startActivity(intent);
        }
        if (view.getId() == R.id.LaunchAbout) {
            intent = new Intent(this, Place_info_activity.class);

            startActivity(intent);
        }
        /*if (view.getId() == R.id.LaunchAbout) {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:50.418683, 30.633565"));
            startActivity(intent);
        }*/

    }

}
