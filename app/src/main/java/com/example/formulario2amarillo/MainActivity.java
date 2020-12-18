package com.example.formulario2amarillo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements AdapterView.OnItemSelectedListener {

    Spinner sp_combo1 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp_combo1 = (Spinner) findViewById(R.id.sp_combo1);

        //----------------------------------------------------
        //cargar el combo con los datos

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this, R.array.frutas, android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_combo1.setAdapter(adaptador);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String valorItem = String.valueOf(sp_combo1.getItemAtPosition(position));
        //Toast.makeText(parent.getContext(), this, "has elegido "+valorItem, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}