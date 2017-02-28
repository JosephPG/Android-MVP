package com.example.one_x_ub.pruebamvp.Presentador;

import android.support.v7.app.AlertDialog;
import android.view.View;

import com.example.one_x_ub.pruebamvp.Interfaces.IMainView;
import com.example.one_x_ub.pruebamvp.Interfaces.IMainPresenter;
import com.example.one_x_ub.pruebamvp.Objetos.Temas;
import com.example.one_x_ub.pruebamvp.Recursos.ViewDialog;

import java.util.ArrayList;
import java.util.List;

public class PresentadorMain implements IMainPresenter {

    private IMainView view_interface;
    private List<Temas> temas;
    private int contador;
    private ViewDialog viewDialog;
    private AlertDialog.Builder alertDialog;
    private AlertDialog dialog;
    private View vista;

    @Override
    public void onCreate(IMainView view){
        this.view_interface = view;
    }

    @Override
    public Object[] onClickedTema(String texto){
        onCreateListaTema(texto);
        getAlertDialog();
        Object[] data_dialog = new Object[2];
        data_dialog[0] = dialog;
        data_dialog[1] = vista;
        return data_dialog;
    }

    @Override
    public void getAlertDialog(){
        viewDialog = view_interface.initAlertDialog();
        alertDialog = viewDialog.getAlertDialog();
        vista = viewDialog.getVista();
        dialog = alertDialog.create();
    }

    @Override
    public void onClickSubTema(String txt){
        temas.get(contador-1).addElementList(txt);
        view_interface.showResult(temas.get(contador-1).getTema_nombre(),
                                  temas.get(contador-1).getTema(0).getTema_nombre(),
                                  String.valueOf(contador).toString());
    }

    @Override
    public void onCreateListaTema(String texto){
        if(temas == null){
            temas = new ArrayList<>();
        }
        temas.add(new Temas(texto));
        contador++;
    }



}
