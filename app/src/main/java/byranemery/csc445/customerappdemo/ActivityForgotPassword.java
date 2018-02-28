package byranemery.csc445.customerappdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Siren10 on 19-Feb-18.
 */

public class ActivityForgotPassword extends AppCompatActivity implements View.OnClickListener {

    private String username = "bemery2";
    private EditText usernameEntered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);
        usernameEntered = findViewById(R.id.username_or_email);
    }

    @Override
    public void onClick(View v) {
        Intent newIntent = null;
        if (v.getId() == R.id.forgot_password) {
            if (username.equals(usernameEntered.getText().toString())) {
                Toast.makeText(this, "Password(Demo only): password", Toast.LENGTH_SHORT).show();
                newIntent = new Intent(this, ActivityLogIn.class);
            } else {
                Toast.makeText(this, "Invalid username", Toast.LENGTH_SHORT).show();
            }
        } else if (v.getId() == R.id.sign_up1) {
            newIntent = new Intent(this, ActivityRegister.class);
        }
        if (newIntent != null) {
            startActivity(newIntent);
        }
    }
}