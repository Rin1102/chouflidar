package essths.li3.chouflidar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button rentButton, binomeButton, homesteadButton, helpButton, loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rentButton = findViewById(R.id.rent_button);
        binomeButton = findViewById(R.id.binome_button);
        homesteadButton = findViewById(R.id.homestead_button);
        helpButton = findViewById(R.id.help_button);
        loginButton = findViewById(R.id.login_button);

        rentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPage("Rent");
            }
        });

        binomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPage("Binome");
            }
        });

        homesteadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPage("Homestead");
            }
        });

        helpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPage("Help");
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPage("Login");
            }
        });
    }

    private void openPage(String pageName) {
        Intent intent = new Intent(MainActivity.this, PageActivity.class);
        intent.putExtra("page", pageName);
        startActivity(intent);
    }
}
