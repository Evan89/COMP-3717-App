package a00911800.comp3717.bcit.ca.comp3717_fuego;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView addressField;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addressField = (TextView)findViewById(R.id.userAddress);
    }


    protected void getLocation(final View view) {
        Intent intent = new Intent(this, MapsActivity.class);


        intent.putExtra("userAddress", addressField.getText().toString());
        startActivity(intent);
    }

    protected void getSchoolList(final View view) {
        Intent intent = new Intent(this, SchoolList.class);

        startActivity(intent);
    }

}
