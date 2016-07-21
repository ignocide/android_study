package kim.sungmin.androidstudy.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import kim.sungmin.androidstudy.R;
import kim.sungmin.androidstudy.activity.adapter.ChatAadapter;
import kim.sungmin.androidstudy.model.Chat;

public class chatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        ListView lv = (ListView) findViewById(R.id.list);

        ChatAadapter adapter = new ChatAadapter(this);
        lv.setAdapter(adapter);

        adapter.addItem(new Chat("Message","Sender"));
        adapter.addItem(new Chat("메세지를 보냅니다","보낸이"));
        adapter.addItem(new Chat("Message","Sender"));
        adapter.addItem(new Chat("메세지를 보냅니다.","보낸이2"));
        adapter.addItem(new Chat("Message","Sender"));
        adapter.addItem(new Chat("메세지를 보냅니다.","보낸이2"));
        adapter.addItem(new Chat("Message","Sender"));
        adapter.addItem(new Chat("메세지를 보냅니다","보낸이"));
        adapter.addItem(new Chat("Message","Sender"));
        adapter.addItem(new Chat("메세지를 보냅니다.","보낸이2"));
        adapter.addItem(new Chat("Message","Sender"));
        adapter.addItem(new Chat("메세지를 보냅니다.","보낸이2"));
        adapter.addItem(new Chat("Message","Sender"));
        adapter.addItem(new Chat("메세지를 보냅니다","보낸이"));
        adapter.addItem(new Chat("Message","Sender"));
        adapter.addItem(new Chat("메세지를 보냅니다.","보낸이2"));
        adapter.addItem(new Chat("Message","Sender"));
        adapter.addItem(new Chat("메세지를 보냅니다.","보낸이2"));
    }
}
