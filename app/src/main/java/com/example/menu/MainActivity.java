package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Toast.makeText(this, "Started", Toast.LENGTH_LONG).show();
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.Opcion1) {
            Toast.makeText(this, "SELECCIONO LA OPCION 1", Toast.LENGTH_LONG).show();
            return true;
        }
        if (id == R.id.Opcion2) {
            Toast.makeText(this, "SELECCIONO LA OPCION 2",
                    Toast.LENGTH_LONG).show();
            return true;
        }
        if (id == R.id.Opcion3) {
            Toast.makeText(this, "SELECCIONO LA OPCION 3",
                    Toast.LENGTH_LONG).show();
            return true;
        }
        if (id == R.id.Opcion4) {
            Toast.makeText(this, "SELECCIONO LA OPCION 4",
                    Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
