package ru.mirea.shcherbakov.dialog;

import android.app.ProgressDialog;
import android.content.Context;

import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment {
    Context context;
    public MyProgressDialogFragment(Context context){
        this.context = context;
    }

    public void show(){
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("Идёт загрузка, подождите.");
        progressDialog.setCancelable(false);
        progressDialog.show();
    }
}
