package com.example.agizdov.bentleycampusmap;

/**
 * Created by agizdov on 4/11/2017.
 */

// class for creating and handling listitem objects (use objects instead of lists since we can store many data points inside objects

public class ListItem {
    int _id;
    String _content;

    //Empty constructor

    public ListItem () {

    }

    // constructor
    public ListItem (int id, String content){
        this._id = id;
        this._content = content;
    }

    // constructor
    public ListItem (String content){
        this._content = content;
    }

    // get ID
    public int getID(){
        return this._id;
    }

    // set ID
    public void setID (int id){
        this._id = id;
    }

    // get content

    public String getListItem () {
        return this._content;
    }

    //set list content

    public void setListItem (String content) {
        this._content = content;
    }




}
