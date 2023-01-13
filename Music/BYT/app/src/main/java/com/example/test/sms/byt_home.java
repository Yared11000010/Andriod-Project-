package com.example.test.sms;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import Animation.Anim_ms;
import Animation.Anim_note;
import Animation.Anim_sed;
import Item.About;
import Item.Contact_Us;

public class byt_home extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_byt_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.colorWhite));
        getSupportActionBar().setTitle("BYT APP's");



        ImageView btn_sms = findViewById(R.id.btn_sms);
        ImageView btn_note = findViewById(R.id.btn_note);
        ImageView btn_sed = findViewById(R.id.btn_sed);
        Button sch = findViewById(R.id.sch);
        Button note = findViewById(R.id.note);
        Button art = findViewById(R.id.art);

        sch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sch = new Intent(byt_home.this, Anim_ms.class);
                startActivity(sch);
            }
        });

        note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent note = new Intent(byt_home.this, Anim_note.class);
                startActivity(note);
            }
        });

        art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent art = new Intent(byt_home.this, Anim_sed.class);
                startActivity(art);
            }
        });


        btn_sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(byt_home.this, Anim_ms.class);
                startActivity(intent);
            }
        });
        btn_note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(byt_home.this, Anim_note.class);
                startActivity(intent1);
            }
        });
        btn_sed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(byt_home.this, Anim_sed.class);
                startActivity(intent2);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int item_id=item.getItemId();

        if (item_id==R.id.share){
            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,"Check out This Cool Application");
            intent.putExtra(Intent.EXTRA_TEXT,"Application Link");
            startActivity(Intent.createChooser(intent,"Share Via"));
        }
        else if(item_id==R.id.about){
            Intent intent=new Intent(this, About.class);
            startActivity(intent);
        }
        else if(item_id==R.id.contact){
            Intent intent=new Intent(this, Contact_Us.class);
            startActivity(intent);
        }
        else if(item_id==R.id.exit) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Are you sure you want to exit?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            byt_home.this.finish();
                        }
                    });
            builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int id) {
                    dialog.cancel();
                }
            });
            AlertDialog alert = builder.create();
            alert.show();


        }
        return true;
    }

}




