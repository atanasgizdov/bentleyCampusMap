package com.example.agizdov.bentleycampusmap;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by agizdov on 4/11/2017.
 */



public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button btn;
    private ListView list;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> arrayList;
    private List<ListItem> listitem;
    private Integer currentlyselectedindex;
    private String currentlyselectedvalue;
    private TextToSpeech mtts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        //example of grabbing all values from DB and storing them in an array
        // and sending them to a listview adapter for display


        // initialize DB

       /* DatabaseHandler db = new DatabaseHandler(this);


        // Reading all contacts to display on start up
       /* Log.d("Reading: ", "Reading all contacts..");
        listitem = db.getAllContacts();

        // loop through and write to log to display table data
        for (ListItem cn : listitem) {

            String log = "Id: "+cn.getID()+" ,Name: " + cn.getListItem();
            // Writing Contacts to log
            Log.d("Name: ", log);
        }

        for (ListItem cn : listitem) {
            String entry = cn.getListItem();
            // grab entry and add to list
            arrayList.add(entry.toString());
            // notify UI of change
            adapter.notifyDataSetChanged();
        }

        //handle button insertion to list - "Add button"
        btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                addRecord();
            }
        });

    }

    // add record
    public void addRecord (){
        // grab entry and add to array list of strings
        arrayList.add(editText.getText().toString());
        //create new object of type listitem
        ListItem item = new ListItem(editText.getText().toString());
        // add to object array so we can track equal object
        listitem.add(item);
        //add to DB
        DatabaseHandler db = new DatabaseHandler(this);
        db.addRecord(item);
        // notify UI of change
        adapter.notifyDataSetChanged();
    }
    // method to edit from DB
    public void editRecordFromDB(ListItem listItem){
        DatabaseHandler db = new DatabaseHandler(this);
        db.updateContact(listItem);
    }

    // method to delete from DB
    public void deleteRecordFromDB(ListItem listItem){
        DatabaseHandler db = new DatabaseHandler(this);
        db.deleteContact(listItem);
    }
}  */

    }
}