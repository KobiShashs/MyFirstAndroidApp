package johnbryce.com.myapp.ui;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import johnbryce.com.myapp.R;
import johnbryce.com.myapp.adpater.CustomRecyclerAdapter;
import johnbryce.com.myapp.model.Person;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    List<Person> people = new ArrayList<>();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadDummyData();
        setViews();
        Log.d("moshe","123");
        Toast.makeText(this, "Moshe", Toast.LENGTH_SHORT).show();
    }

    private void loadDummyData() {
        people.add(new Person(10,"Kobi",32.5f));
        people.add(new Person(20,"Gil",31.8f));
        people.add(new Person(30,"Tal",25f));
        people.add(new Person(10,"Kobi",32.5f));
        people.add(new Person(20,"Gil",31.8f));
        people.add(new Person(30,"Tal",25f));
        people.add(new Person(10,"Kobi",32.5f));
        people.add(new Person(20,"Gil",31.8f));
        people.add(new Person(30,"Tal",25f));
        people.add(new Person(10,"Kobi",32.5f));
        people.add(new Person(20,"Gil",31.8f));
        people.add(new Person(30,"Tal",25f));
        people.add(new Person(10,"Kobi",32.5f));
        people.add(new Person(20,"Gil",31.8f));
        people.add(new Person(30,"Tal",25f));
        people.add(new Person(10,"Kobi",32.5f));
        people.add(new Person(20,"Gil",31.8f));
        people.add(new Person(30,"Tal",25f));
        people.add(new Person(10,"Kobi",32.5f));
        people.add(new Person(20,"Gil",31.8f));
        people.add(new Person(30,"Tal",25f));
        people.add(new Person(10,"Kobi",32.5f));
        people.add(new Person(20,"Gil",31.8f));
        people.add(new Person(30,"Tal",25f));
        people.add(new Person(10,"Kobi",32.5f));
        people.add(new Person(20,"Gil",31.8f));
        people.add(new Person(30,"Tal",25f));
        people.add(new Person(10,"Kobi",32.5f));
        people.add(new Person(20,"Gil",31.8f));
        people.add(new Person(30,"Tal",25f));
        people.add(new Person(10,"Kobi",32.5f));
        people.add(new Person(20,"Gil",31.8f));
        people.add(new Person(30,"Tal",25f));
        people.add(new Person(10,"Kobi",32.5f));
        people.add(new Person(20,"Gil",31.8f));
        people.add(new Person(30,"Tal",25f));
        people.add(new Person(10,"Kobi",32.5f));
        people.add(new Person(20,"Gil",31.8f));
        people.add(new Person(30,"Tal",25f));
    }

    private void setViews() {
        recyclerView=(RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new CustomRecyclerAdapter(this, people);

        recyclerView.setAdapter(mAdapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.VERTICAL));
    }


    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle(getString(R.string.closing))
                .setMessage(getString(R.string.are_you_sure))
                .setPositiveButton(getString(android.R.string.yes), new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                })
                .setNegativeButton(getString(android.R.string.no), null)
                .show();
    }
}
