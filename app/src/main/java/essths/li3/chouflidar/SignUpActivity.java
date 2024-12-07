package essths.li3.chouflidar;


import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class SignUpActivity extends AppCompatActivity {

    private EditText birthdayField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        birthdayField = findViewById(R.id.birthday);
    }

    // Show a date picker dialog when the birthday field is clicked
    public void showDatePicker(View view) {
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        String date = String.format("%02d/%02d/%04d", dayOfMonth, month + 1, year);
                        birthdayField.setText(date);
                    }
                },
                year, month, day
        );
        datePickerDialog.show();
    }

    // Handle registration logic
    public void registerUser(View view) {
        // Collect user input from EditText fields and RadioGroup
        EditText fullName = findViewById(R.id.fullName);
        EditText cin = findViewById(R.id.cin);
        EditText email = findViewById(R.id.email);
        EditText password = findViewById(R.id.password);

        String name = fullName.getText().toString();
        String cinValue = cin.getText().toString();
        String emailValue = email.getText().toString();
        String passwordValue = password.getText().toString();

        // Add validation logic here (e.g., check for empty fields, valid email, CIN length)
        // Redirect to another activity or save the user data
    }

    // Navigate to the Sign-In page
    public void goToSignIn(View view) {
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
    }
}
