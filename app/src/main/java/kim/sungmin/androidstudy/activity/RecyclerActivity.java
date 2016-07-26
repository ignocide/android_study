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

        final ArrayList<String> arraylist = new ArrayList<String>();


        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new RecyclerAdapter(arraylist);
        mRecyclerView.setAdapter(mAdapter);
        //아이템 클릭 리스너
        mAdapter.setItemClick(new RecyclerAdapter.ItemClick() {
            @Override
            public void onClick(String str, int position) {
                Toast.makeText(getApplicationContext(),position+" "+str,Toast.LENGTH_SHORT).show();;
            }
        });
        mRecyclerView.getLayoutManager().scrollToPosition(mAdapter.getItemCount()/2);

        //첫 아이템이 격자에 맞도록 이동
        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                if (RecyclerView.SCROLL_STATE_IDLE == newState) {
                    int scrollDistance = getMoveHeight(recyclerView);
                    recyclerView.smoothScrollBy(0,scrollDistance);
                }
//                super.onScrollStateChanged(recyclerView, newState);
            }
        });

        arraylist.add("안드로이드");
        arraylist.add("아이폰");
        arraylist.add("맥");
        arraylist.add("노트북");


    }

    //이동해야 할 높이 계산 함수
    private int getMoveHeight(final RecyclerView recyclerView) {
        LinearLayoutManager manager = (LinearLayoutManager) recyclerView.getLayoutManager();
        RecyclerView.ViewHolder firstVisibleColumnViewHolder = recyclerView.findViewHolderForAdapterPosition(manager.findFirstVisibleItemPosition());
        if (firstVisibleColumnViewHolder == null) {
            return 0;
        }
        int columnHeight = firstVisibleColumnViewHolder.itemView.getMeasuredHeight();
        int top = firstVisibleColumnViewHolder.itemView.getTop();
//
//        final int columnWidth = firstVisibleColumnViewHolder.itemView.getMeasuredWidth();
//        final int left = firstVisibleColumnViewHolder.itemView.getLeft();
        int absHeight = Math.abs(top);
        int ret = absHeight <= (columnHeight / 2) ? top : columnHeight - absHeight;
        return ret;
    }



}
