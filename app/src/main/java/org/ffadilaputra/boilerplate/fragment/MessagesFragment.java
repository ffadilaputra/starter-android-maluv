package org.ffadilaputra.boilerplate.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.ffadilaputra.boilerplate.R;
import org.ffadilaputra.boilerplate.adapter.MessageAdapter;
import org.ffadilaputra.boilerplate.model.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ravi on 29/07/15.
 */
public class MessagesFragment extends Fragment {

    private RecyclerView recyclerView;
    private MessageAdapter adapter;

    public MessagesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_messages, container, false);

        recyclerView = (RecyclerView) rootView.findViewById(R.id.messageList);
        adapter = new MessageAdapter(getActivity(),getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        // Inflate the layout for this fragment
        return rootView;
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
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
