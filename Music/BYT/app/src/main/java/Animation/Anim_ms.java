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

import com.example.test.sms.MainActivity;
import com.example.test.sms.R;

public class Anim_ms extends AppCompatActivity {
    Animation topAnim,bottomAnim;
    ImageView im1;
    TextView txt1,txt2,txt3;
    private static int SPLASH_SCREEN = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim_ms);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        topAnim = AnimationUtils.loadAnimation(this, R.anim.topanimation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottomanimation);

        im1 = (ImageView) findViewById(R.id.im1);
        txt1 = (TextView) findViewById(R.id.txt1);
        im1.setAnimation(bottomAnim);
        txt1.setAnimation(topAnim);
        txt3 = (TextView) findViewById(R.id.txt3);
        txt2 = (TextView) findViewById(R.id.txt2);
        txt3.setAnimation(topAnim);
        txt2.setAnimation(topAnim);

        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {
                                          Intent intent = new Intent(Anim_ms.this, MainActivity.class);
                                          startActivity(intent);
                                          finish();
                                      }
                                  }, SPLASH_SCREEN
        );
    }
    }
