package essths.li3.chouflidar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    // Handle user sign-in logic
    public void signInUser(View view) {
        EditText emailField = findViewById(R.id.signInEmail);
        EditText passwordField = findViewById(R.id.signInPassword);

        String email = emailField.getText().toString();
        String password = passwordField.getText().toString();

        // Add authentication logic here (e.g., check email/password against saved data)
        // Redirect to the home page if login is successful
    }

    // Navigate to the Sign-Up page
    public void goToSignUp(View view) {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }
}

