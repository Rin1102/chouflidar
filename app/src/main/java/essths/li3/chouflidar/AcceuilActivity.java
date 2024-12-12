package essths.li3.chouflidar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class AcceuilActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);

        // Initialize DrawerLayout and NavigationView
        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.navigation_view);

        // Initialize and handle the Homestead button click
        Button buttonHomestead = findViewById(R.id.buttonHomestead);
        buttonHomestead.setOnClickListener(v -> {
            // Navigate to HomesteadActivity
            Intent intent = new Intent(AcceuilActivity.this, HomesteadActivity.class);
            startActivity(intent);
        });

        // Initialize and handle the Binome button click
        Button buttonBinome = findViewById(R.id.buttonBinome);
        buttonBinome.setOnClickListener(v -> {
            // Navigate to BinomeActivity
            Intent intent = new Intent(AcceuilActivity.this, Binome.class);
            startActivity(intent);
        });

        // Initialize and handle the Rent button click
        Button buttonRent = findViewById(R.id.buttonRent);
        buttonRent.setOnClickListener(v -> {
            // Navigate to MainActivity
            Intent intent = new Intent(AcceuilActivity.this, MainActivity.class);
            startActivity(intent);
        });

        // Set Navigation Item Selected Listener
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();

                if (id == R.id.navrent) {
                    // Navigate to MainActivity from the menu
                    Intent intent = new Intent(AcceuilActivity.this, MainActivity.class);
                    startActivity(intent);
                } else if (id == R.id.navbinome) {
                    // Navigate to BinomeActivity from the menu
                    Intent intent = new Intent(AcceuilActivity.this, Binome.class);
                    startActivity(intent);
                } else if (id == R.id.navhomesteads) {
                    // Navigate to HomesteadActivity from the menu
                    Intent intent = new Intent(AcceuilActivity.this, HomesteadActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(AcceuilActivity.this, "Unknown selection", Toast.LENGTH_SHORT).show();
                }

                // Close the drawer after handling the click
                drawerLayout.closeDrawers();
                return true;
            }
        });
    }
}
