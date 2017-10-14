/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.ModelBlocNotas;
import views.ViewBlocNotas;

/**
 *
 * @author tazaz
 */
public class ControllerBlocNotas {
    ModelBlocNotas model_blocnotas;
    ViewBlocNotas view_blocnotas;
    
    public ControllerBlocNotas(ModelBlocNotas model_blocnotas, ViewBlocNotas view_blocnotas){
        this.model_blocnotas = model_blocnotas;
        this.view_blocnotas = view_blocnotas;           
        initView();
    }
    public void initView(){
        view_blocnotas.setVisible(true);
    }
    
}
