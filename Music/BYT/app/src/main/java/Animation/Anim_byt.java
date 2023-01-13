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

public class Anim_byt extends AppCompatActivity {
    Animation topAnim,bottomAnim;
    ImageView img1;
    TextView txt1,txt2;
    private static int SPLASH_SCREEN = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim_byt);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        topAnim= AnimationUtils.loadAnimation(this,R.anim.topanimation);
        bottomAnim= AnimationUtils.loadAnimation(this,R.anim.bottomanimation);


img1=(ImageView)findViewById(R.id.img1) ;
txt1=(TextView)findViewById(R.id.txt1);
txt2=(TextView)findViewById(R.id.txt2);

        img1.setAnimation(bottomAnim);
        txt1.setAnimation(topAnim);
        txt2.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {
                                          Intent intent = new Intent(Anim_byt.this, Onboard.class);
                                          startActivity(intent);
                                          finish();
                                      }
                                  },SPLASH_SCREEN
        );

    }
}