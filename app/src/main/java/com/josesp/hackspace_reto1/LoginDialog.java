package com.josesp.hackspace_reto1;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginDialog extends DialogFragment {

    public static String TAG = "sign_up_message";
    public static String MESSAGE = "Hola Jose Suarez";

    public interface OnDialogListener{
        void onLoginButtonClick();
    }

    private OnDialogListener onDialogListener;
    private String message;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        onDialogListener = (OnDialogListener) getActivity();
        message = getArguments().getString("message");
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        View view = getActivity().getLayoutInflater().inflate(R.layout.login_modal, null);
        Button btnAccept = view.findViewById(R.id.button_login);
        TextView txtClose = view.findViewById(R.id.close_dialog_sing_up);

        btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "hice un click", Toast.LENGTH_LONG).show( );
            }
        });

        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });



        builder.setView(view);
        return builder.create();

    }

    /*
    public void onLoginButtonClick(){
        onDialogListener.onLoginButtonClick();
    }
*/
}