package Note;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.sms.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class Main extends AppCompatActivity {


    RecyclerView recyclerView;
    FloatingActionButton floatingActionButton;
    Adapter adapter;
    List<Note> notes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.colorWhite));

        getSupportActionBar().setTitle("BYT NOTE");

        SimpleDatabase db = new SimpleDatabase(this);
        notes = db.getAllNotes();
        List<Note> allNotes = notes;
        floatingActionButton=findViewById(R.id.fab);

        recyclerView = findViewById(R.id.listOfNotes);
floatingActionButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(Main.this, AddNote.class);
        startActivity(i);
    }
});

        displayList(allNotes);

    }

    private void displayList(List<Note> allNotes) {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this,allNotes);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.add_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.add){
            Toast.makeText(this, "Add New Note", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this,AddNote.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }




    }


