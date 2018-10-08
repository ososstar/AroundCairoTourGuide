package com.example.android.aroundcairotourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {


    /**
     * Create a new {@link ItemAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param items is the list of {@link Item}s to be displayed.
     */
    public ItemAdapter(Context context, ArrayList<Item> items) {
        super(context,0, items);
    }


    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent){

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Item currentItem = getItem(position);

        TextView ItemTextView = convertView.findViewById(R.id.item_name);
        ItemTextView.setText(currentItem.getItemName());

        ImageView ItemImageView = convertView.findViewById(R.id.item_image);
        ItemImageView.setImageResource(currentItem.getImageResourceId());

        TextView ItemLocationTextView = convertView.findViewById(R.id.item_location);
        ItemLocationTextView.setText(currentItem.getItemLocation());

        TextView ItemDetailsTextView = convertView.findViewById(R.id.item_details);
        ItemDetailsTextView.setText(currentItem.getItemsDetails());

        return convertView;
    }

}
