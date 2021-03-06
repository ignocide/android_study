package kim.sungmin.androidstudy.activity.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import kim.sungmin.androidstudy.R;

/**
 * Created by Administrator on 2016-07-20.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{
    private ArrayList<String> strings;

    //아이템 클릭 시 실행될 함수
    private ItemClick itemClick;
    public interface ItemClick {
        public void onClick(String str,int position);
    }

    //아이템 클릭 시 실행될 함수
    public void setItemClick(ItemClick itemClick) {
        this.itemClick = itemClick;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        View view;
        public ViewHolder(View view) {
            super(view);
            this.view = view;
            textView = (TextView) view.findViewById(R.id.tVString);
        }
    }

    public RecyclerAdapter(ArrayList<String> strings) {
        this.strings = strings;
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_items, null);
        ViewHolder vh = new ViewHolder(v);

        return vh;
    }



    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        position = position%strings.size();
        final String str = strings.get(position);
        holder.textView.setText(str);

        final int finalPosition = position;
        final int finalPosition1 = position;
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(itemClick != null){
                    itemClick.onClick(str, finalPosition1);
                }
            }
        });
    }

    //무한 순회 하는 방법
    @Override
    public int getItemCount() {
//        return locations.size();
        return Integer.MAX_VALUE;
    }


    //무한 순회 하는 방법
    @Override
    public long getItemId(int position){

        return position%strings.size();
    }
}

