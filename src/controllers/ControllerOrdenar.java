package controllers;

import models.ModelOrdenar;
import views.ViewOrdenar;


public class ControllerOrdenar {
    ModelOrdenar model_ordenar;
    ViewOrdenar view_ordenar;
    
    public ControllerOrdenar(ModelOrdenar model_ordenar, ViewOrdenar view_ordenar){
        this.model_ordenar = model_ordenar;
        this.view_ordenar = view_ordenar;   
        initView();
    }
    public void initView(){
        view_ordenar.setVisible(true);
    }
}
