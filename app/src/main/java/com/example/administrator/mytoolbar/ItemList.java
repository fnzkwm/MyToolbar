package com.example.administrator.mytoolbar;

public class ItemList {

    public int item_image;
    public String Item_title;
    public String item_subTitle;


    public ItemList(int item_image, String item_title, String item_subTitle) {
        this.item_image = item_image;
        Item_title = item_title;
        this.item_subTitle = item_subTitle;
    }

    public int getItem_image() {
        return item_image;
    }

    public void setItem_image(int item_image) {
        this.item_image = item_image;
    }

    public String getItem_title() {
        return Item_title;
    }

    public void setItem_title(String item_title) {
        Item_title = item_title;
    }

    public String getItem_subTitle() {
        return item_subTitle;
    }

    public void setItem_subTitle(String item_subTitle) {
        this.item_subTitle = item_subTitle;
    }
}
