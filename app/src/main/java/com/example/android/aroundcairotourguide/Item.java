package com.example.android.aroundcairotourguide;

import android.content.Intent;

public class Item {

    /**
     * the Item name
     */
    private String mItemName;
    /**
     * Image Source ID of the Item
     */
    private int mImageResourceId;

    /**
     * Item Location
     */
    private String mItemLocation;

    /**
     * Item Details
     */
    private String mItemDetails;

    /**
     * Create an Item object
     *
     * @param itemName of the object
     * @param imageResourceId that will show in background
     */
    public Item(String itemName, int imageResourceId){
        mItemName = itemName;
        mImageResourceId = imageResourceId;
    }

    /**
     * Create an Item object
     *
     * @param itemName of the object
     * @param
     * @param itemDetails of the item
     */
    public Item(String itemName, String itemLocation, String itemDetails){
        mItemName = itemName;
        mItemLocation = itemLocation;
        mItemDetails = itemDetails;
    }

    /**
     * Get the Item Name
     */
    public String getItemName(){
        return mItemName;
    }

    /**
     * Get the Item Image Source ID
     */
    public int getImageResourceId(){
        return mImageResourceId;
    }

    /**
     * Get the Item Location
     */
    public String getItemLocation(){
        return mItemLocation;
    }

    /**
     * Get the Item Details
     */
    public String getItemsDetails(){
        return mItemDetails;
    }

}
