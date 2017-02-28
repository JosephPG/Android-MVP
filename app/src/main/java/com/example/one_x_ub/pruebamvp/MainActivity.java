package com.example.one_x_ub.pruebamvp;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.one_x_ub.pruebamvp.Interfaces.IMainView;
import com.example.one_x_ub.pruebamvp.Presentador.PresentadorMain;
import com.example.one_x_ub.pruebamvp.Recursos.ViewDialog;

public class MainActivity extends AppCompatActivity implements IMainView{

    EditText editText, editText1;
    Button bton;
    PresentadorMain presentadorMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.edtView);
        presentadorMain = new PresentadorMain();
        presentadorMain.onCreate(this);
    }

    @Override
    public void onClickTema(View view){
        showDialog();
    }

    @Override
    public ViewDialog initAlertDialog(){
        return new ViewDialog(this);
    }

    @Override
    public void showDialog(){
        Object[] data_dialog = presentadorMain.onClickedTema(editText.getText().toString());
        final AlertDialog dialog = (AlertDialog)data_dialog[0];
        View vista = (View)data_dialog[1];
        editText1 = (EditText) vista.findViewById(R.id.editText);
        bton = (Button) vista.findViewById(R.id.dialog_main_button);
        onClickSubTema(dialog);
    }

    @Override
    public void onClickSubTema(final AlertDialog dialog){
        bton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presentadorMain.onClickSubTema(editText1.getText().toString());
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    @Override
    public void showResult(String mensaje, String mnj, String mn){
        Toast.makeText(this, mensaje + " " + mnj + " " + mn, Toast.LENGTH_LONG).show();
    }



}
