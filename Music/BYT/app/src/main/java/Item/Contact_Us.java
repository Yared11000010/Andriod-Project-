package Item;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.test.sms.R;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class Contact_Us extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact__us);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.colorWhite));

        getSupportActionBar().setTitle("Contact Us");


        Element adsElement = new Element();
        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setDescription(" BYT SOFTWARE DEVELOPERS \n You can Contact us Using The Following Platforms")
                .addItem(new Element().setTitle("Version 1.0"))
                .addGroup("CONNECT WITH US!")
                .addEmail("Your mail id ")
                .addWebsite("Your website/")
                .addYoutube("UCbekhhidkzkGryM7mi5Ys_w")   //Enter your youtube link here (replace with my channel link)
                .addPlayStore("com.example.yourprojectname")   //Replace all this with your package name
                .addInstagram("jarves.usaram")    //Your instagram id
                .addItem(createCopyright())
                .create();
        setContentView(aboutPage);
    }
    private Element createCopyright()
    {
        Element copyright = new Element();
        @SuppressLint("DefaultLocale") final String copyrightString = String.format("Copyright %d by BYT DEVELOPER's", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyrightString);
        // copyright.setIcon(R.mipmap.ic_launcher);
        copyright.setGravity(Gravity.CENTER);
        copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Contact_Us.this,copyrightString,Toast.LENGTH_SHORT).show();
            }
        });
        return copyright;
    }
}