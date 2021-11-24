package com.lab02.lab9;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {
private Button btn;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        btn=(Button)view.findViewById(R.id.comunicacion);
        btn.setOnClickListener( new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),Comunication.class);
                startActivity(intent);
            }
        });
        return view;
    }
}