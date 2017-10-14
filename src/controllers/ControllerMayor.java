package controllers;

import models.ModelMayor;
import views.ViewMayor;


public class ControllerMayor {
    ModelMayor model_mayor;
    ViewMayor view_mayor;
    
    public ControllerMayor(ModelMayor model_mayor, ViewMayor view_mayor){
        this.model_mayor = model_mayor;
        this.view_mayor = view_mayor;   
        view_mayor.jbtn_mayor.addActionListener(e->jbtn_mayor_clic());
        initView();
    }
    public void initView(){
        view_mayor.jtf_num1.setText(String.valueOf(model_mayor.getNum1()));
        view_mayor.jtf_num2.setText(String.valueOf(model_mayor.getNum2()));
        view_mayor.jtf_num3.setText(String.valueOf(model_mayor.getNum3()));
        view_mayor.jtf_resultado.setText(String.valueOf(model_mayor.getRes()));
        view_mayor.setVisible(true);
    }
    public void jbtn_mayor_clic(){
        model_mayor.setNum1(Integer.parseInt(view_mayor.jtf_num1.getText()));
        model_mayor.setNum2(Integer.parseInt(view_mayor.jtf_num2.getText()));
        model_mayor.setNum3(Integer.parseInt(view_mayor.jtf_num3.getText()));
        model_mayor.mayor();
        view_mayor.jtf_resultado.setText(String.valueOf(model_mayor.getRes()));
    }
}
