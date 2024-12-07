package essths.li3.chouflidar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
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

        String email = emailField.getText().toString().trim();
        String password = passwordField.getText().toString().trim();

        // Check for valid credentials
        if (email.equals("admin") && password.equals("admin")) {
            // Show a welcome toast
            Toast.makeText(this, "Welcome!", Toast.LENGTH_SHORT).show();

            // Redirect to another activity (e.g., home page)
            Intent intent = new Intent(this, WelcomeActivity.class);
            startActivity(intent);
        } else {
            // Show an error toast
            Toast.makeText(this, "Please verify your entries!", Toast.LENGTH_SHORT).show();
        }
    }

    // Navigate to the Sign-Up page
    public void goToSignUp(View view) {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }
}
