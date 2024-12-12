package essths.li3.chouflidar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Your layout with the FAB

        // Initialize the FAB
        FloatingActionButton addHouseButton = findViewById(R.id.add_house_button);

        // Set an OnClickListener to navigate to the new page
        addHouseButton.setOnClickListener(v -> {
            // Create an Intent to start a new activity (e.g., AddHouseActivity)
            Intent intent = new Intent(MainActivity.this, HomesteadActivity.class);
            startActivity(intent); // Start the new activity
        });
    }
    public void dialPhoneNumber(View view) {
        // Replace with the actual phone number
        String phoneNumber = "20xxxxxx";
        Intent phoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));

        // Start the activity to dial the number
        startActivity(phoneIntent);
    }
}
