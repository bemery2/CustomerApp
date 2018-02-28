package byranemery.csc445.customerappdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Siren10 on 19-Feb-18.
 */

public class ActivitySplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread t = new Thread();
        try {
            Thread.sleep(5000);
            startActivity(new Intent(this, ActivityLogIn.class));
        } catch (InterruptedException e) {

        }
    }
}
