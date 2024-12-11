package essths.li3.chouflidar;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.binome);
        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();

                if (id == R.id.navrent) {
                    Toast.makeText(MainActivity.this, "Rent selected", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.navbinome) {
                    Toast.makeText(MainActivity.this, "Binome selected", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.navhomesteads) {
                    // Navigate to HomesteadActivity from the menu
                    Intent intent = new Intent(MainActivity.this, HomesteadActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Unknown selection", Toast.LENGTH_SHORT).show();
                }

                // Close the drawer after handling the click
                drawerLayout.closeDrawers();
                return true;
            }
        });

    }

    ;

    public void dialPhoneNumber(View view) {
        // Replace with the actual phone number
        String phoneNumber = "20xxxxxx";
        Intent phoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));

        // Start the activity to dial the number
        startActivity(phoneIntent);
    }
}







            // Set Navigation Item Selected Listener

    }
}