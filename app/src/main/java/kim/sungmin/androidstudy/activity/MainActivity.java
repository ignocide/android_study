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

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity();
            }
        });
    }



    private void changeActivity(){
        Class _community = RecyclerActivity.class;
        Intent intent = new Intent(this, RecyclerActivity.class);

        startActivity(intent);
        finish();
    }

}
