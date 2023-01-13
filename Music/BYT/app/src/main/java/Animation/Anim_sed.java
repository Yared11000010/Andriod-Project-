package Animation;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.test.sms.R;
import Seduction.Seduction;

public class Anim_sed extends AppCompatActivity {
    Animation topAnim,bottomAnim;
    ImageView img1,img2;
    TextView txt1,txt2,txt3,txt4;
    private static int SPLASH_SCREEN = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim_sed);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        topAnim= AnimationUtils.loadAnimation(this,R.anim.topanimation);
        bottomAnim= AnimationUtils.loadAnimation(this,R.anim.bottomanimation);

        img2=findViewById(R.id.img1);
        img1=findViewById(R.id.eimg2);
        txt2=findViewById(R.id.txt1);
        txt1=findViewById(R.id.etxt2);
       txt3=findViewById(R.id.etxt3);
        txt4=findViewById(R.id.etxt4);

        img1.setAnimation(bottomAnim);
        txt1.setAnimation(topAnim);
        img2.setAnimation(topAnim);
        txt2.setAnimation(bottomAnim);
      txt3.setAnimation(bottomAnim);
      txt4.setAnimation(topAnim);


 new Handler().postDelayed(new Runnable() {
     @Override
     public void run() {
         Intent intent = new Intent(Anim_sed.this, Seduction.class);
         startActivity(intent);
         finish();
     }
 },SPLASH_SCREEN
 );




    }
}