package com.example.one_x_ub.pruebamvp.Interfaces;

public interface IMainPresenter {

    public void onCreate(IMainView view);

    public Object[] onClickedTema(String texto);

    public void getAlertDialog();

    public void onCreateListaTema(String texto);

    public void onClickSubTema(String txt);

}
