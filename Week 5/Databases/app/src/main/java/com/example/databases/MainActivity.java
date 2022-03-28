package com.example.databases;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBAdapter db = new DBAdapter(this);
        //---add a contact---
        db.open();
        long _id = db.insertContact("Jennifer Ann", "jenniferann@jfdimarzio.com");
        _id = db.insertContact("Oscar Diggs", "oscar@oscardiggs.com");
        db.close();
        db.open();
        /*Cursor c = db.getAllContacts();
        if (c.moveToFirst())
        {
            do {
                DisplayContact(c);
            } while (c.moveToNext());
        }
        db.close();

        //---get a contact---
        db.open();
        Cursor a = db.getContact(2);
        if (a.moveToFirst()){
            DisplayContact(a);
        }
        Toast.makeText(this, "No contact found", Toast.LENGTH_LONG).show();
        db.close();*/

        //---update contact---
        /*db.open();
        if (db.updateContact(2, "Oscar Diggs", "oscar@oscardiggs.com")) {
            Toast.makeText(this, "Update successful.", Toast.LENGTH_LONG).show();
        }
        Toast.makeText(this, "Update failed.", Toast.LENGTH_LONG).show();
        db.close();
        }*/

        //---delete a contact---
        /*db.open();
        if (db.deleteContact(2)){
            Toast.makeText(this, "Delete successful.", Toast.LENGTH_LONG).show();
        }
            Toast.makeText(this, "Delete failed.", Toast.LENGTH_LONG).show();
        db.close();
        }

        /*public void DisplayContact(Cursor a)
        {
            Toast.makeText(this, "id: " + a.getString(0) + "\n" + "Name: " + a.getString(1) + "\n" + "Email: " + a.getString(2), Toast.LENGTH_LONG).show();
        }*/

    }
}