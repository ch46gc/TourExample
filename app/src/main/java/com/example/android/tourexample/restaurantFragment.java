package com.example.android.tourexample;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class restaurantFragment extends Fragment {
    //Fragment's Context Variable
    private Context mContext;

    //Create instance of Fragment
    public restaurantFragment() {
    }

    //The Fragments are created in the getContext method
    public Context context() {
        mContext = this.getContext();
        return mContext;
    }

    //Create view and perform additional tasks
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        //Create RecyclerView, set FixedSize property, and LayoutManager
        RecyclerView recycle = (RecyclerView) view.findViewById(R.id.recycler_view);
        recycle.setHasFixedSize(true);
        recycle.setLayoutManager(new LinearLayoutManager(getActivity()));
        //Create ArrayList of cards, and cards for this Fragment's category
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(getString(R.string.restaurant_1_name), getString(R.string.restaurant_1_about), R.drawable.al_labeeb));
        cards.add(new Card(getString(R.string.restaurant_2_name), getString(R.string.site_2_about), R.drawable.al_fanar));
        cards.add(new Card(getString(R.string.restaurant_3_name), getString(R.string.site_3_about), R.drawable.al_marhabani));
        //Create RecyclerView adapter and set it to the RecyclerView
        CustomCardAdapter historicalAdapter = new CustomCardAdapter(context(), cards);
        recycle.setAdapter(historicalAdapter);


        return view;
    }
}