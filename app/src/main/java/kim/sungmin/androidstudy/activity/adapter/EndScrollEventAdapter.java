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
public class EndScrollEventAdapter extends RecyclerView.Adapter<EndScrollEventAdapter.ViewHolder> {
    private ArrayList<String> strings;

    //아이템 클릭 콜백 등록
    private ItemClick itemClick;



    public interface ItemClick {
        public void onClick(String str, int position);
    }

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

    // Provide a suitable constructor (depends on the kind of dataset)
    public EndScrollEventAdapter(ArrayList<String> strings) {
        this.strings = strings;
    }


    // Create new views (invoked by the layout manager)
    @Override
    public EndScrollEventAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                               int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_items, null);
//                .inflate(R.layout.my_text_view, parent, false);
        ViewHolder vh = new ViewHolder(v);

        return vh;
    }



    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
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

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return strings.size();
//        return Integer.MAX_VALUE;
    }


    @Override
    public long getItemId(int position){
        return position;
//        return position%strings.size();
    }
}

