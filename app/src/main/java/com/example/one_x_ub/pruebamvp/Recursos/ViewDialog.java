package com.example.one_x_ub.pruebamvp.Recursos;

import android.app.Activity;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;

import com.example.one_x_ub.pruebamvp.R;

public class ViewDialog {

    private Activity act;
    private View vista;
    private AlertDialog.Builder alertDialog;

    public ViewDialog(Activity act){
        this.act = act;
        getDialog();
    }

    public void getDialog(){
        AlertDialog.Builder adbuilder = new AlertDialog.Builder(this.act);
        LayoutInflater layoutInflater = this.act.getLayoutInflater();
        this.vista = layoutInflater.inflate(R.layout.dialog_main, null);
        adbuilder.setView(this.vista);
        this.alertDialog = adbuilder;
    }

    public View getVista(){
        return this.vista;
    }

    public AlertDialog.Builder getAlertDialog(){
        return this.alertDialog;
    }

}
