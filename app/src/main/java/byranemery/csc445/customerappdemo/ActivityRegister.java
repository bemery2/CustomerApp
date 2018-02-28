package byranemery.csc445.customerappdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

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
    }

    @Override
    public void onClick(View v) {

    }
}
