package byranemery.csc445.customerappdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.spothero.emailvalidator.EmailValidationResult;
import com.spothero.emailvalidator.EmailValidator;

public class ActivityRegister extends AppCompatActivity implements View.OnClickListener {
    private EditText fName, lName, address, aptNum, stateAbb, zipCode, phoneNum, email, password, cpassword;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        fName = findViewById(R.id.firstNameInput);
        lName = findViewById(R.id.lastNameInput);
        address = findViewById(R.id.addressInput);
        aptNum = findViewById(R.id.apartmentNumInput);
        stateAbb = findViewById(R.id.stateAbbrev);
        zipCode = findViewById(R.id.zipCodeInput);
        phoneNum = findViewById(R.id.phoneNumberInput);
        email = findViewById(R.id.emailInput);
        password = findViewById(R.id.passwordInput);
        cpassword = findViewById(R.id.cpasswordInput);
    }

    public boolean validateEmail(){
        EmailValidationResult.ValidationError error = EmailValidator.validateSyntax(email.getText().toString());
        if (error != null) {
            email.setError(error.toString());
            return false;
        } else
            return true;
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.submit_button){
            if (validateEmail() && password.getText().toString().equals(cpassword.getText().toString())){
                Toast.makeText(this, "successful", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
