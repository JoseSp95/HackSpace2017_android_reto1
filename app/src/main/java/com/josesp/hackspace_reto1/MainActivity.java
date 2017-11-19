package com.josesp.hackspace_reto1;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements LoginDialog.OnDialogListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onButtonSingUpclick(View view){

        FragmentManager fragmentManager = getSupportFragmentManager();
        DialogFragment dialogFragment = (DialogFragment)fragmentManager.findFragmentByTag(LoginDialog.TAG);

        if(dialogFragment == null){
            dialogFragment = new LoginDialog();

            Bundle bundle = new Bundle();
            bundle.putString("message",LoginDialog.MESSAGE);
            dialogFragment.setArguments(bundle);
        }

        //DialogFragment dialogFragment =  new LoginDialog();
        dialogFragment.show(getSupportFragmentManager(),LoginDialog.TAG);
    }

    @Override
    public void onLoginButtonClick() {
        Toast.makeText(this,"ingresando",Toast.LENGTH_LONG).show();
    }
}

