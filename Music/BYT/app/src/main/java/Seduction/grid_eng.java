package Seduction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.test.sms.R;

import Seduction.English.Eng_Eight;
import Seduction.English.Eng_Eleven;
import Seduction.English.Eng_Five;
import Seduction.English.Eng_Four;
import Seduction.English.Eng_Nine;
import Seduction.English.Eng_One;
import Seduction.English.Eng_Seven;
import Seduction.English.Eng_Six;
import Seduction.English.Eng_Ten;
import Seduction.English.Eng_Three;
import Seduction.English.Eng_Twelve;
import Seduction.English.Eng_Two;


public class grid_eng extends AppCompatActivity implements View.OnClickListener {
    GridLayout mainGrid;
    CardView ecv1,ecv2,ecv3,ecv4,ecv5,ecv6,ecv7,ecv8,ecv9,ecv10,ecv11,ecv12;
    TextView etxt1,etxt2,etxt3,etxt4,etxt5,etxt6,etxt7,etxt8,etxt9,etxt10,etxt11,etxt12;
    ImageView eimg1,eimg2,eimg3,eimg4,eimg5,eimg6,eimg7,eimg8,eimg9,eimg10,eimg11,eimg12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_eng);
        mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        //**************************************************************************************************
        //TextView Hooks
        etxt1=(TextView)findViewById(R.id.etxt1);
        etxt2=(TextView)findViewById(R.id.etxt2);
        etxt3=(TextView)findViewById(R.id.etxt3);
        etxt4=(TextView)findViewById(R.id.etxt4);
        etxt5=(TextView)findViewById(R.id.etxt5);
        etxt6=(TextView)findViewById(R.id.etxt6);
        etxt7=(TextView)findViewById(R.id.etxt7);
        etxt8=(TextView)findViewById(R.id.etxt8);
        etxt9=(TextView)findViewById(R.id.etxt9);
        etxt10=(TextView)findViewById(R.id.etxt10);
        etxt11=(TextView)findViewById(R.id.etxt11);
        etxt12=(TextView)findViewById(R.id.etxt12);
        // TextView OnClick Listener
        etxt1.setOnClickListener(this);
        etxt2.setOnClickListener(this);
        etxt3.setOnClickListener(this);
        etxt4.setOnClickListener(this);
        etxt5.setOnClickListener(this);
        etxt6.setOnClickListener(this);
        etxt7.setOnClickListener(this);
        etxt8.setOnClickListener(this);
        etxt9.setOnClickListener(this);
        etxt10.setOnClickListener(this);
        etxt11.setOnClickListener(this);
        etxt12.setOnClickListener(this);
        // **********************************************************************************************************

        //Cardview Hooks
        ecv1=(CardView) findViewById(R.id.ecv1);
        ecv2=(CardView)findViewById(R.id.ecv2);
        ecv3=(CardView)findViewById(R.id.ecv3);
        ecv4=(CardView)findViewById(R.id.ecv4);
        ecv5=(CardView)findViewById(R.id.ecv5);
        ecv6=(CardView)findViewById(R.id.ecv6);
        ecv7=(CardView)findViewById(R.id.ecv7);
        ecv8=(CardView)findViewById(R.id.ecv8);
        ecv9=(CardView)findViewById(R.id.ecv9);
        ecv10=(CardView)findViewById(R.id.ecv10);
        ecv11=(CardView)findViewById(R.id.ecv11);
        ecv12=(CardView)findViewById(R.id.ecv12);

        ecv1.setOnClickListener(this);
        ecv2.setOnClickListener(this);
        ecv3.setOnClickListener(this);
        ecv4.setOnClickListener(this);
        ecv5.setOnClickListener(this);
        ecv6.setOnClickListener(this);
        ecv7.setOnClickListener(this);
        ecv8.setOnClickListener(this);
        ecv9.setOnClickListener(this);
        ecv10.setOnClickListener(this);
        ecv11.setOnClickListener(this);
        ecv12.setOnClickListener(this);

        //Imageview Hooks
        eimg1=(ImageView) findViewById(R.id.eimg1);
        eimg2=(ImageView)findViewById(R.id.eimg2);
        eimg3=(ImageView)findViewById(R.id.eimg3);
        eimg4=(ImageView)findViewById(R.id.eimg4);
        eimg5=(ImageView)findViewById(R.id.eimg5);
        eimg6=(ImageView)findViewById(R.id.eimg6);
        eimg7=(ImageView)findViewById(R.id.eimg7);
        eimg8=(ImageView)findViewById(R.id.eimg8);
        eimg9=(ImageView)findViewById(R.id.eimg9);
        eimg10=(ImageView)findViewById(R.id.eimg10);
        eimg11=(ImageView)findViewById(R.id.eimg11);
        eimg12=(ImageView)findViewById(R.id.eimg12);

        eimg1.setOnClickListener(this);
        eimg2.setOnClickListener(this);
        eimg3.setOnClickListener(this);
        eimg4.setOnClickListener(this);
        eimg5.setOnClickListener(this);
        eimg6.setOnClickListener(this);
        eimg7.setOnClickListener(this);
        eimg8.setOnClickListener(this);
        eimg9.setOnClickListener(this);
        eimg10.setOnClickListener(this);
        eimg11.setOnClickListener(this);
        eimg12.setOnClickListener(this);



    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.etxt1:
            case R.id.ecv1:
            case R.id.eimg1:
                Intent i1=new Intent(this, Eng_One.class);
                startActivity(i1);
                break;

            case R.id.etxt2 :
            case R.id.ecv2 :
            case R.id.eimg2 :
                Intent i2=new Intent(this, Eng_Two.class);
                startActivity(i2);
                break;

            case R.id.etxt3:
            case R.id.ecv3:
            case R.id.eimg3:
                Intent i3=new Intent(this, Eng_Three.class);
                startActivity(i3);
                break;
            case R.id.etxt4:
            case R.id.ecv4:
            case R.id.eimg4:
                Intent i4=new Intent(this, Eng_Four.class);
                startActivity(i4);
                break;
            case R.id.etxt5:
            case R.id.ecv5:
            case R.id.eimg5:
                Intent i5=new Intent(this, Eng_Five.class);
                startActivity(i5);
                break;

            case R.id.etxt6:
            case R.id.ecv6:
            case R.id.eimg6:
                Intent i6=new Intent(this, Eng_Six.class);
                startActivity(i6);
                break;

            case R.id.etxt7:
            case R.id.ecv7:
            case R.id.eimg7:
                Intent i7=new Intent(this, Eng_Seven.class);
                startActivity(i7);
                break;

            case R.id.etxt8 :
            case R.id.ecv8 :
            case R.id.eimg8 :
                Intent i8=new Intent(this, Eng_Eight.class);
                startActivity(i8);
                break;

            case R.id.etxt9:
            case R.id.ecv9:
            case R.id.eimg9:
                Intent i9=new Intent(this, Eng_Nine.class);
                startActivity(i9);
                break;

            case R.id.etxt10:
            case R.id.ecv10:
            case R.id.eimg10:
                Intent i10=new Intent(this, Eng_Ten.class);
                startActivity(i10);
                break;

            case R.id.etxt11:
            case R.id.ecv11:
            case R.id.eimg11:
                Intent i11=new Intent(this, Eng_Eleven.class);
                startActivity(i11);
                break;

            case R.id.etxt12 :
            case R.id.ecv12:
            case R.id.eimg12:
                Intent i12=new Intent(this, Eng_Twelve.class);
                startActivity(i12);
                break;


        }

    }
}