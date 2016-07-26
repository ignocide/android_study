package kim.sungmin.androidstudy.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import kim.sungmin.androidstudy.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btnRecycle);
        Button btn2 = (Button) findViewById(R.id.btnChat);
        Button btn3 = (Button) findViewById(R.id.btnScroll);
        Button btn4 = (Button) findViewById(R.id.btnTab);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity(RecyclerActivity.class);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity(ChatActivity.class);
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity(ScrollingActivity.class);
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity(EndScrollEventActivity.class);
            }
        });

    }



    private void changeActivity(Class _class){
        Intent intent = new Intent(this, _class);

        startActivity(intent);
        finish();
    }

}
