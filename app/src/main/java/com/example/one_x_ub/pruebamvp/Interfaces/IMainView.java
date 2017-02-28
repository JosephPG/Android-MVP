package com.example.one_x_ub.pruebamvp.Interfaces;

import android.support.v7.app.AlertDialog;
import android.view.View;

import com.example.one_x_ub.pruebamvp.Recursos.ViewDialog;

public interface IMainView {

    public void onClickTema(View view);

    public ViewDialog initAlertDialog();

    public void showResult(String mensaje, String mnj, String mn);

    public void showDialog();

    public void onClickSubTema(final AlertDialog dialog);

}
