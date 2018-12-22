package com.example.twtech.sellmyobject.login;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import com.example.twtech.sellmyobject.R;

import static com.example.twtech.sellmyobject.sharedpreference.SharedPreference.Email;
import static com.example.twtech.sellmyobject.sharedpreference.SharedPreference.mypreference;

public class Login extends AppCompatActivity {

    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedpreferences = getApplication().getSharedPreferences(mypreference, Context.MODE_PRIVATE);



    }


    public void setDataSharedPreference()
    {
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString("Password", "shivi");
        editor.putString("Email", "shivi");
        editor.commit();
    }

public void getDataSharedPreference()
{
    sharedpreferences.contains(Email);
    String email = sharedpreferences.getString(Email, "");
}

}
