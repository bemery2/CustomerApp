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

public class ActivityLogIn extends AppCompatActivity implements View.OnClickListener {

    private String username = "bemery2";
    private String password = "password";
    private EditText usernameEntered;
    private EditText passwordEntered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usernameEntered = findViewById(R.id.username);
        passwordEntered = findViewById(R.id.password);
    }

    @Override
    public void onClick(View view) {
        Intent newIntent = null;
        if (view.getId() == R.id.login_button) {
            if (username.equals(usernameEntered.getText().toString()) && password.equals(passwordEntered.getText().toString())) {
                Toast.makeText(this, "Successfully Logged In", Toast.LENGTH_LONG).show();
                newIntent = new Intent();
            } else {
                Toast.makeText(this, "Failed to Log In", Toast.LENGTH_LONG).show();
            }
        } else if (view.getId() == R.id.forgot_password) {
            newIntent = new Intent();
        } else if (view.getId() == R.id.sign_up) {
            setContentView(R.layout.activity_register);
        }
        if (newIntent != null) {
            startActivity(newIntent);
        }
    }
}
