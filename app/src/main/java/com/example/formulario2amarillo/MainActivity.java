package com.example.formulario2amarillo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements AdapterView.OnItemSelectedListener {

    Spinner sp_combo1 = null;
    TextView txt_item_seleccionado = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp_combo1 = (Spinner) findViewById(R.id.sp_combo1);
        txt_item_seleccionado = (TextView) findViewById(R.id.txt_item_seleccionado);

        //----------------------------------------------------
        sp_combo1.setOnItemSelectedListener(this);
        //cargar el combo con los datos

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this, R.array.frutas, R.layout.casilladesplegable);
        adaptador.setDropDownViewResource(R.layout.casilladesplegable);
        sp_combo1.setAdapter(adaptador);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String valorItem = String.valueOf(sp_combo1.getItemAtPosition(position));
        txt_item_seleccionado.setText(valorItem);
        Toast.makeText( parent.getContext(), "has elegido "+valorItem, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}