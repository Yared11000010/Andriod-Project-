package Seduction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.test.sms.R;
import com.example.test.sms.byt_home;

public class Seduction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seduction);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.colorWhite));

        getSupportActionBar().setTitle("ART OF SEDUCTION");



        Button btn_amh=findViewById(R.id.btn_amh);
         Button btn_eng=findViewById(R.id.btn_eng);
         btn_eng.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i2=new Intent(Seduction.this, byt_home.class);
                 startActivity(i2);
             }
         });
btn_amh.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(Seduction.this, grid_amh.class);
        startActivity(i);

    }
});
btn_eng.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(Seduction.this, grid_eng.class);
        startActivity(intent);
    }
});

}
}


