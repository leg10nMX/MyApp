package com.mezcaldev.myportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Index extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_index, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void showMessage(String message) {
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context,message,Toast.LENGTH_LONG);
        toast.show();

    }

    public void openSpotify(View sender) {
        showMessage("This button will launch Spotify");
    }

    public void openScores(View sender) {
        showMessage("This button will launch Scores");
    }

    public void openBuildItBigger(View sender) {
        showMessage("This button will launch Build it Bigger");

    }

    public void openLibrary(View sender) {
        showMessage("This button will launch Library");
    }

    public void openXYZReader(View sender) {
        showMessage("This button will launch XYZ Reader");

    }

    public void openMyApp(View sender) {
        showMessage("This button will launch MyApp");
    }
}
