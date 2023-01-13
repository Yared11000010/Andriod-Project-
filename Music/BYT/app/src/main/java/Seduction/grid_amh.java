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

import Seduction.Amharic.*;


public class grid_amh extends AppCompatActivity implements View.OnClickListener {

    GridLayout mainGrid;
    CardView cv1,cv2,cv3,cv4,cv5,cv6,cv7,cv8,cv9,cv10,cv11,cv12;
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt12;
    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_amh);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        //**************************************************************************************************
        //TextView Hooks
        txt1=(TextView)findViewById(R.id.txt1);
        txt2=(TextView)findViewById(R.id.txt2);
        txt3=(TextView)findViewById(R.id.txt3);
        txt4=(TextView)findViewById(R.id.txt4);
        txt5=(TextView)findViewById(R.id.txt5);
        txt6=(TextView)findViewById(R.id.txt6);
        txt7=(TextView)findViewById(R.id.txt7);
        txt8=(TextView)findViewById(R.id.txt8);
        txt9=(TextView)findViewById(R.id.txt9);
        txt10=(TextView)findViewById(R.id.txt10);
        txt11=(TextView)findViewById(R.id.txt11);
        txt12=(TextView)findViewById(R.id.txt12);
        // TextView OnClick Listener
        txt1.setOnClickListener(this);
        txt2.setOnClickListener(this);
        txt3.setOnClickListener(this);
        txt4.setOnClickListener(this);
        txt5.setOnClickListener(this);
        txt6.setOnClickListener(this);
        txt7.setOnClickListener(this);
        txt8.setOnClickListener(this);
        txt9.setOnClickListener(this);
        txt10.setOnClickListener(this);
        txt11.setOnClickListener(this);
        txt12.setOnClickListener(this);
        // **********************************************************************************************************

        //Cardview Hooks
        cv1=(CardView) findViewById(R.id.cv1);
        cv2=(CardView)findViewById(R.id.cv2);
        cv3=(CardView)findViewById(R.id.cv3);
        cv4=(CardView)findViewById(R.id.cv4);
        cv5=(CardView)findViewById(R.id.cv5);
        cv6=(CardView)findViewById(R.id.cv6);
        cv7=(CardView)findViewById(R.id.cv7);
        cv8=(CardView)findViewById(R.id.cv8);
        cv9=(CardView)findViewById(R.id.cv9);
        cv10=(CardView)findViewById(R.id.cv10);
        cv11=(CardView)findViewById(R.id.cv11);
        cv12=(CardView)findViewById(R.id.cv12);

        cv1.setOnClickListener(this);
        cv2.setOnClickListener(this);
        cv3.setOnClickListener(this);
        cv4.setOnClickListener(this);
        cv5.setOnClickListener(this);
        cv6.setOnClickListener(this);
        cv7.setOnClickListener(this);
        cv8.setOnClickListener(this);
        cv9.setOnClickListener(this);
        cv10.setOnClickListener(this);
        cv11.setOnClickListener(this);
        cv12.setOnClickListener(this);

        //Imageview Hooks
        img1=(ImageView) findViewById(R.id.img1);
        img2=(ImageView)findViewById(R.id.img2);
        img3=(ImageView)findViewById(R.id.img3);
        img4=(ImageView)findViewById(R.id.img4);
        img5=(ImageView)findViewById(R.id.img5);
        img6=(ImageView)findViewById(R.id.img6);
        img7=(ImageView)findViewById(R.id.img7);
        img8=(ImageView)findViewById(R.id.img8);
        img9=(ImageView)findViewById(R.id.img9);
        img10=(ImageView)findViewById(R.id.img10);
        img11=(ImageView)findViewById(R.id.img11);
        img12=(ImageView)findViewById(R.id.img12);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        img8.setOnClickListener(this);
        img9.setOnClickListener(this);
        img10.setOnClickListener(this);
        img11.setOnClickListener(this);
        img12.setOnClickListener(this);



    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.txt1:
            case R.id.cv1:
            case R.id.img1:
                Intent i1=new Intent(this, One.class);
                startActivity(i1);
                break;

            case R.id.txt2 :
            case R.id.cv2 :
            case R.id.img2 :
                Intent i2=new Intent(this, two.class);
                startActivity(i2);
                break;

            case R.id.txt3:
            case R.id.cv3:
            case R.id.img3:
                Intent i3=new Intent(this, Three.class);
                startActivity(i3);
                break;
            case R.id.txt4:
            case R.id.cv4:
            case R.id.img4:
                Intent i4=new Intent(this, Four.class);
                startActivity(i4);
                break;
            case R.id.txt5:
            case R.id.cv5:
            case R.id.img5:
                Intent i5=new Intent(this, Five.class);
                startActivity(i5);
                break;

            case R.id.txt6:
            case R.id.cv6:
            case R.id.img6:
                Intent i6=new Intent(this, Six.class);
                startActivity(i6);
                break;

            case R.id.txt7:
            case R.id.cv7:
            case R.id.img7:
                Intent i7=new Intent(this, Seven.class);
                startActivity(i7);
                break;

            case R.id.txt8 :
            case R.id.cv8 :
            case R.id.img8 :
                Intent i8=new Intent(this, Eight.class);
                startActivity(i8);
                break;

            case R.id.txt9:
            case R.id.cv9:
            case R.id.img9:
                Intent i9=new Intent(this, Nine.class);
                startActivity(i9);
                break;

            case R.id.txt10:
            case R.id.cv10:
            case R.id.img10:
                Intent i10=new Intent(this, Ten.class);
                startActivity(i10);
                break;

            case R.id.txt11:
            case R.id.cv11:
            case R.id.img11:
                Intent i11=new Intent(this, Eleven.class);
                startActivity(i11);
                break;

            case R.id.txt12 :
            case R.id.cv12:
            case R.id.img12:
                Intent i12=new Intent(this, amharic_twelve.class);
                startActivity(i12);
                break;


        }

    }
}


