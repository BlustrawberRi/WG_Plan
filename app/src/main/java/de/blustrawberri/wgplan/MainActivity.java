package de.blustrawberri.wgplan;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity { //Todo: just Activity

    private Button btn_newtask, btn_newmate;
    List<Task> tasks = new ArrayList<Task>();
    private ListView list_tasks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_newtask = (Button)findViewById(R.id.btnNewTask);
        list_tasks = (ListView)findViewById(R.id.listViewTasks);
        TabHost tabhost = (TabHost)findViewById(R.id.tabHost);

        //Tabhost setup
        tabhost.setup();

        //add task tab
        TabHost.TabSpec tabspec = tabhost.newTabSpec("task"); //create new Tab (any tag name is ok)
        tabspec.setContent(R.id.tabTask); //content of the Tab
        tabspec.setIndicator("Aufgabe"); //name of the tab
        tabhost.addTab(tabspec); //add tab to tabhost

        //add member tab
        tabspec = tabhost.newTabSpec("member"); //create new Tab (any tag name is ok)
        tabspec.setContent(R.id.tabMember); //content of the Tab
        tabspec.setIndicator("Mitbewohner"); //name of the tab
        tabhost.addTab(tabspec); //add tab to tabhost

        //TODO: custom Adapter erstellen (extends BaseAdapter, besser ArrayAdapter)
        //TODO: list_tasks.setAdapter(...) //Daten einpflegen

        btn_newtask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Click!", Toast.LENGTH_SHORT).show();
                //TODO: Popup Formular
                //TODO:
            }
        });
    }

    private class TaskListAdapter extends ArrayAdapter<Task> {
        public TaskListAdapter(){
            super(MainActivity.this, R.layout.listviewtasks_item, (List<Task>) list_tasks);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
