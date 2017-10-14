package controllers;

import models.ModelOrdenar2;
import views.ViewOrdenar2;

public class ControllerOrdenar2 {
    ModelOrdenar2 model_ordenar2;
    ViewOrdenar2 view_ordenar2;
    
    public ControllerOrdenar2(ModelOrdenar2 model_ordenar2, ViewOrdenar2 view_ordenar2){
        this.model_ordenar2 = model_ordenar2;
        this.view_ordenar2 = view_ordenar2;   
        initView();
    }
    public void initView(){
        view_ordenar2.setVisible(true);
    }
}