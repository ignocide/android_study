package kim.sungmin.androidstudy.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

import kim.sungmin.androidstudy.R;
import kim.sungmin.androidstudy.activity.adapter.EndScrollEventAdapter;


public class EndScrollEventActivity extends AppCompatActivity {

    EndScrollEventAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        final ArrayList<String> arraylist = new ArrayList<String>();


        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new EndScrollEventAdapter(arraylist);
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setItemClick(new EndScrollEventAdapter.ItemClick() {
            @Override
            public void onClick(String str, int position) {
                Toast.makeText(getApplicationContext(),position+" "+str,Toast.LENGTH_SHORT).show();
            }
        });
        mRecyclerView.getLayoutManager().scrollToPosition(mAdapter.getItemCount()/2);


        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                switch (newState){
                    //스크롤상태가 idle일 경우
                    case RecyclerView.SCROLL_STATE_IDLE : {
                        int lastPosition = ((LinearLayoutManager)recyclerView.getLayoutManager()).findLastVisibleItemPosition();
                        if(lastPosition == arraylist.size()-1){
                            Toast.makeText(getApplicationContext(),"last item shown",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
                super.onScrollStateChanged(recyclerView, newState);
            }
        });


        arraylist.add("안드로이드");
        arraylist.add("아이폰");
        arraylist.add("맥");
        arraylist.add("노트북");
        arraylist.add("안드로이드");
        arraylist.add("아이폰");
        arraylist.add("맥");
        arraylist.add("노트북");
        arraylist.add("안드로이드");
        arraylist.add("아이폰");
        arraylist.add("맥");
        arraylist.add("노트북");
        arraylist.add("안드로이드");
        arraylist.add("아이폰");
        arraylist.add("맥");
        arraylist.add("노트북");
        arraylist.add("안드로이드");
        arraylist.add("아이폰");
        arraylist.add("맥");
        arraylist.add("노트북");


    }

}
