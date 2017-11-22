package com.example.flias.appcarnaval;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;


public class InicioFragment extends Fragment {
    View view;
    private FragmentActivity myContext;
    ImageButton ponencia , sitios;

    public InicioFragment() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(Activity activity) {
        myContext=(FragmentActivity) activity;
        super.onAttach(activity);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_inicio, container, false);
        ponencia = (ImageButton) view.findViewById(R.id.btnmapa);


        ponencia.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent miIntent = new Intent(myContext, MapsFragment.class);
                startActivity(miIntent);
            }


        });


        sitios = (ImageButton) view.findViewById(R.id.btnsitios);


        sitios.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent miIntent = new Intent(myContext, MapsFragment.class);
                startActivity(miIntent);
            }


        });

        return view;
    }










}

