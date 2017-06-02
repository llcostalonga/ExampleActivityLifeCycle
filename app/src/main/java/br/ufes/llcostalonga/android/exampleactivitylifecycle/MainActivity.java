package br.ufes.llcostalonga.android.exampleactivitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends TracerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Carrega por código o valor do array (note que mesmo indo para outra atividade esse valor é restaurado)
        /*Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String[] values = getResources().getStringArray(R.array.operating_systems);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        spinner.setAdapter(adapter);*/

    }

    public void onClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
