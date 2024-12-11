package essths.li3.chouflidar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomesteadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homestead);

        // Initialize views
        EditText editTextCIN = findViewById(R.id.editTextCIN);
        EditText editTextPrice = findViewById(R.id.editTextPrice);
        EditText editTextSurface = findViewById(R.id.editTextSurface);
        EditText editTextDescription = findViewById(R.id.editTextDescription);
        EditText editTextPostulationDate = findViewById(R.id.editTextPostulationDate);
        EditText editTextPhoneNumber = findViewById(R.id.editTextPhoneNumber);
        EditText editTextCity = findViewById(R.id.editTextCity);
        RadioGroup radioGroupRooms = findViewById(R.id.radioGroupRooms);
        Button buttonSubmit = findViewById(R.id.buttonSubmit);

        // Handle submit button click
        buttonSubmit.setOnClickListener(v -> {
            String cin = editTextCIN.getText().toString();
            String price = editTextPrice.getText().toString();
            String surface = editTextSurface.getText().toString();
            String description = editTextDescription.getText().toString();
            String postulationDate = editTextPostulationDate.getText().toString();
            String phoneNumber = editTextPhoneNumber.getText().toString();
            String city = editTextCity.getText().toString();

            int selectedRoomId = radioGroupRooms.getCheckedRadioButtonId();
            String rooms = (selectedRoomId == R.id.radioRoom1) ? "1" :
                    (selectedRoomId == R.id.radioRoom2) ? "2" :
                            (selectedRoomId == R.id.radioRoom3) ? "3" : "4";

            // Validate fields (e.g., CIN, price, etc.)
            if (cin.isEmpty() || price.isEmpty() || surface.isEmpty() || description.isEmpty() || postulationDate.isEmpty() || phoneNumber.isEmpty() || city.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                return;
            }

            // Show a confirmation
            Toast.makeText(this, "Submitted: " + cin + ", " + price + ", " + surface + ", Rooms: " + rooms, Toast.LENGTH_SHORT).show();
        });
    }
}

