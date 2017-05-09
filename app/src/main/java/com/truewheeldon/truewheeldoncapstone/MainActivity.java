package com.truewheeldon.truewheeldoncapstone;


/*
    Author: True Wheeldon
    Date: 5/8/2017

    This app is an incredibly bare-bones prototype; this is essentially the floor model for what it would look like.
    Building the necessary back end to get a fully functional version of Haven was far beyond the scope of this project,
    especially given the amount of psychology research I had to do before I could even begin designing and coding.
    As such, the backend was faked similarly to how it would have been faked for a Software Engineering project.
    The code for the listview was written by referencing the Android Studio website ran by Google,
    but I also utilized an open source tutorial (http://www.androidinterview.com/android-custom-listview-with-image-and-text-using-arrayadapter/ ) to finish it.


*/

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;



public class MainActivity extends Activity{

    ListView list;

    //hard code the titles of each corresponding image
    String[] itemname ={"So true!", "I'd let him deliver my mail!", "I never thought of it that way...",
            "Wow. So right.", "So precious.", "Pie is all you need~", "This dog knows what's up!",
    };

    // these are all memes from facebook.
    Integer[] imgid={
            R.drawable.one, R.drawable.two, R.drawable.three,
            R.drawable.four, R.drawable.five, R.drawable.six,
            R.drawable.seven
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //link to the about page
        ImageButton btn = (ImageButton)findViewById(R.id.aboutButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AboutActivity.class));
            }
        });

        //use the listadapter code to populate the listview with stuff
        ListAdapter adapter=new ListAdapter(this, itemname, imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        }


}