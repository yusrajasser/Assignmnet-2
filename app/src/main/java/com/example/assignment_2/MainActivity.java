package com.example.assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.ContactsContract;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void Create(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
    }

    private boolean flag = false;
    private textPersonName name;
    private textEmailAddress email;
    private textPersonName hobbies;
    private button save;

    public void btnSaveOnClick(View view){
        information[] inf= new information[2];
        inf[0] = new information("yusra","yusra.jasser96@gmail.com","drawing","female");
        inf[1] = new information("naden","naden.j765@gmail.com","dancing","female");


        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson= new Gson();
        String infString = gson.toJson(inf);
        editor.putString(DATA, infString);
        editor.commit();
        Toast.makeText(this,"Data Saved: \n"+infString,
                Toast.LENGTH_SHORT).show();


    }
    public void btnLoadOnClick(View view) {
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences()
        Gson gson = new Gson();
        String str= pref.getString(DATA,"");
        if(!str.equals("")){
            information[] inf = gson.formJson(str,information[].class);
            Toast.makeText(this, inf.length, Toast.LENGTH_SHORT).show();}

        else{
            Toast.makeText(this,"Data not found",Toast.LENGTH_SHORT.show();
            }
        }
    }

}