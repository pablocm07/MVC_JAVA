package controllers;

import models.ModelOrdenar;
import views.ViewOrdenar;


public class ControllerOrdenar {
    ModelOrdenar model_ordenar;
    ViewOrdenar view_ordenar;
    
    public ControllerOrdenar(ModelOrdenar model_ordenar, ViewOrdenar view_ordenar){
        this.model_ordenar = model_ordenar;
        this.view_ordenar = view_ordenar;   
        view_ordenar.jbtn_agregar.addActionListener(e->jbtn_agregar_click());
        view_ordenar.jbtn_asc.addActionListener(e->jbtn_asc_click());        
        initView();
    }
    public void initView(){
        view_ordenar.setVisible(true);
    }                    
    public void jbtn_agregar_click(){
        model_ordenar.setNum(Integer.parseInt(view_ordenar.jtf_num.getText()));
        model_ordenar.addModel();  
        model_ordenar.addList();          
        view_ordenar.jtf_num.setText("");
        view_ordenar.jl_lista.setModel(model_ordenar.modelList());
    }
    public void jbtn_asc_click(){
        model_ordenar.modelList().removeAllElements();
        model_ordenar.ordenar();                        
    }    
}
