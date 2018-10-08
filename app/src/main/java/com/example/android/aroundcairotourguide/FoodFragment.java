package com.example.android.aroundcairotourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.items_list, container,false);
        /** TODO: Insert all the code from the NumberActivity’s onCreate() method after the setContentView method call */
        // Create a list of Food Items
        final ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(getString(R.string.Koshary),null, getString(R.string.kosharyDetails)));
        items.add(new Item(getString(R.string.fool),null, getString(R.string.foulDetails) ));
        items.add(new Item(getString(R.string.kofta),null,getString(R.string.koftaDetails)));
        items.add(new Item(getString(R.string.shawrma),null, getString(R.string.shawrmaDetails)));

        // Create a ItemAdapter, whose data source is a list of items. The
        // adapter knows how to create list items for each item in the list.
        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called mainListView, which is declared in the
        // items_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);
        // Make the ListView use the ItemAdapter we created above, so that the ListView
        // will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
