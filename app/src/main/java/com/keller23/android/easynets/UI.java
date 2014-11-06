package com.keller23.android.easynets;


import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class UI {

    static void initUI() {
        ClickListeners();
    }

    private static void ClickListeners() {
        Refs.btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean result = Generate();
                if(!result) Toast.makeText(Refs.actMain, "Error in options.", Toast.LENGTH_LONG).show();
            }
        });

        Refs.spCIDR.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Refs.strCIDRPick = Refs.strCIDRs[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Refs.strCIDRPick = "";
            }
        });
    }

    private static boolean Generate() {
        if (Refs.etHostsRequired.getText().toString().contentEquals("")) {
            Toast.makeText(Refs.actMain, "Please enter number of required hosts.", Toast.LENGTH_LONG).show();
            return false;
        }
        else {
            // switches dont work with strings in 1.6.
            /*switch(Refs.strCIDRPick) {
                case Refs.strCIDRs[0][0]:

            }*/
        }
        return true;
    }
}