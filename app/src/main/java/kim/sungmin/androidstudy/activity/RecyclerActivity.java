package kim.sungmin.androidstudy.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

import kim.sungmin.androidstudy.R;
import kim.sungmin.androidstudy.activity.adapter.RecyclerAdapter;


public class RecyclerActivity extends AppCompatActivity {

    RecyclerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        ArrayList<String> arraylist = new ArrayList<String>();


        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
//        mRecyclerView.setHasFixedSize(true);
//        Scroll.setSmoothScrollingEnabled(false);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new RecyclerAdapter(arraylist);
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setItemClick(new RecyclerAdapter.ItemClick() {
            @Override
            public void onClick(String str, int position) {
                Toast.makeText(getApplicationContext(),position+" "+str,Toast.LENGTH_SHORT).show();;
            }
        });
        mRecyclerView.getLayoutManager().scrollToPosition(mAdapter.getItemCount()/2);

        arraylist.add("안드로이드");
        arraylist.add("아이폰");
        arraylist.add("맥");
        arraylist.add("노트북");


    }





}
