package com.keller23.android.easynets;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Refs {

    static Activity actMain;
    static Bundle bunMain;
    static Context conMain;

    static Button btnGenerate;

    static EditText etHostsRequired, etNetID, etUsableHosts;

    static Spinner spCIDR;
    static final String[] strCIDRs = {"", "/24", "/25", "/26", "/27", "/28", "/29", "/30"};
    static String strCIDRPick;

    /**
     * intCIDRClassC - CIDR table for Class C networks.
     *
     *  { {"CIDR", "#Nets", "SizeNets", "UsableHosts"} }
     */
    static final String[][] intCIDRClassC = { {"24", "1",  "256", "254"},
                                              {"25", "2",  "128", "126"},
                                              {"26", "4",  "64",  "62"},
                                              {"27", "8",  "32",  "30"},
                                              {"28", "16", "16",  "14"},
                                              {"29", "32", "8",   "6"},
                                              {"30", "64", "4",   "2"} };


    static void initMain(Activity _act, Bundle _bun, Context _con) {
        actMain = _act;
        bunMain = _bun;
        conMain = _con;

        btnGenerate = (Button) actMain.findViewById(R.id.btnGenerate);

        etHostsRequired = (EditText) actMain.findViewById(R.id.etHostsRequired);
        etNetID = (EditText) actMain.findViewById(R.id.etNetID);
        etUsableHosts = (EditText) actMain.findViewById(R.id.etUsableHosts);

        spCIDR = (Spinner) actMain.findViewById(R.id.spCIDR);
        // ArrayAdapter is a BaseAdapter that is backed by an array of arbitrary objects
        ArrayAdapter<String> spin_adapter = new ArrayAdapter<String>(actMain, android.R.layout.simple_spinner_item, Refs.strCIDRs);
        // setting adapters to spinners
        spCIDR.setAdapter(spin_adapter);
    }
}
