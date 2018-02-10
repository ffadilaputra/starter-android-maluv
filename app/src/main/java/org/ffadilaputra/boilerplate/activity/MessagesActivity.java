package org.ffadilaputra.boilerplate.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.TextView;

import org.ffadilaputra.boilerplate.R;
import org.ffadilaputra.boilerplate.adapter.MessageAdapter;
import org.ffadilaputra.boilerplate.model.Message;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by akm on 2/10/18.
 */

public class MessagesActivity extends AppCompatActivity {

    @BindView(R.id.label)
    TextView label;
    @BindView(R.id.label2)
    TextView label2;
    @BindView(R.id.messageList)
    RecyclerView messageList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
        ButterKnife.bind(this);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        MessageAdapter adapter = new MessageAdapter(this, getData());
        messageList.setAdapter(adapter);
        messageList.setHasFixedSize(true);
        messageList.setItemAnimator(new DefaultItemAnimator());
        messageList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        messageList.setAdapter(adapter);
    }

    public static List<Message> getData() {
        List<Message> data = new ArrayList<>();
        String[] titles = {"Tes", "Coba", "Gile"};
        for (int i = 0; i < titles.length; i++) {
            Message current = new Message();
            current.setText(titles[i]);
            data.add(current);
        }
        return data;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            super.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
