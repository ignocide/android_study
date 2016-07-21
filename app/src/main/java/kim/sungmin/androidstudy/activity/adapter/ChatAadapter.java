package kim.sungmin.androidstudy.activity.adapter;

/**
 * Created by Administrator on 2016-07-21.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import kim.sungmin.androidstudy.R;
import kim.sungmin.androidstudy.model.Chat;

public class ChatAadapter extends BaseAdapter {
    private static final int TYPE_UNSUPPORTED = 0;
    private static final int TYPE_MESSAGE = 1;
    private static final int TYPE_SYSTEM_MESSAGE = 2;
    private static final int TYPE_FILELINK = 3;
    private static final int TYPE_BROADCAST_MESSAGE = 4;

    private final Context mContext;
    private final LayoutInflater mInflater;
    private final ArrayList<Chat> mItemList;
    private long mMaxMessageTimestamp = Long.MIN_VALUE;
    private long mMinMessageTimestamp = Long.MAX_VALUE;

    public ChatAadapter(Context context) {
        mContext = context;
        mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mItemList = new ArrayList<Chat>();
    }

    @Override
    public int getCount() {
        return mItemList.size();
    }

    @Override
    public Chat getItem(int position) {
        return mItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void addItem(Chat chat){
        mItemList.add(chat);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Chat chat = getItem(position);

        TextView tvMessage;
        TextView tvSender;
        convertView = mInflater.inflate(R.layout.view_message_you_item, parent, false);
        tvMessage = (TextView) convertView.findViewById(R.id.txt_message);
        tvSender = (TextView) convertView.findViewById(R.id.txt_nickname);
        tvMessage.setText(chat.getMessage());
        tvSender.setText(chat.getSender());

        return convertView;
    }


}
