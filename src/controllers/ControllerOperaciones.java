package controllers;

import models.ModelOperaciones;
import views.ViewOperaciones;

public class ControllerOperaciones {
    ModelOperaciones modelOperaciones;
    ViewOperaciones viewOperaciones;    

    public ControllerOperaciones(ModelOperaciones modelOperaciones, ViewOperaciones viewOperaciones) {
        this.modelOperaciones = modelOperaciones;
        this.viewOperaciones = viewOperaciones;
        viewOperaciones.jbtn_sum.addActionListener(e->jbtn_sum_click());
        viewOperaciones.jbtn_res.addActionListener(e->jbtn_res_click());
        viewOperaciones.jbtn_mul.addActionListener(e->jbtn_mul_click());
        viewOperaciones.jbtn_div.addActionListener(e->jbtn_div_click());
        viewOperaciones.jbtn_mod.addActionListener(e->jbtn_mod_click());
        initView();
    }
    public void initView(){
        viewOperaciones.jtf_n1.setText(String.valueOf(modelOperaciones.getN1()));
        viewOperaciones.jtf_n2.setText(String.valueOf(modelOperaciones.getN2()));
        viewOperaciones.jtf_r.setText(String.valueOf(modelOperaciones.getR()));
        viewOperaciones.setVisible(true);
    }
    public void jbtn_sum_click(){
        modelOperaciones.setN1(Integer.parseInt(viewOperaciones.jtf_n1.getText()));
        modelOperaciones.setN2(Integer.parseInt(viewOperaciones.jtf_n2.getText()));       
        modelOperaciones.suma();
        viewOperaciones.jtf_r.setText(String.valueOf(modelOperaciones.getR()));
    }
    public void jbtn_res_click(){
        modelOperaciones.setN1(Integer.parseInt(viewOperaciones.jtf_n1.getText()));
        modelOperaciones.setN2(Integer.parseInt(viewOperaciones.jtf_n2.getText()));       
        modelOperaciones.resta();
        viewOperaciones.jtf_r.setText(String.valueOf(modelOperaciones.getR()));
    }
    public void jbtn_mul_click(){
        modelOperaciones.setN1(Integer.parseInt(viewOperaciones.jtf_n1.getText()));
        modelOperaciones.setN2(Integer.parseInt(viewOperaciones.jtf_n2.getText()));       
        modelOperaciones.multi();
        viewOperaciones.jtf_r.setText(String.valueOf(modelOperaciones.getR()));
    }
    public void jbtn_div_click(){
        modelOperaciones.setN1(Integer.parseInt(viewOperaciones.jtf_n1.getText()));
        modelOperaciones.setN2(Integer.parseInt(viewOperaciones.jtf_n2.getText()));       
        modelOperaciones.divi();
        viewOperaciones.jtf_r.setText(String.valueOf(modelOperaciones.getR()));
    }
    public void jbtn_mod_click(){
        modelOperaciones.setN1(Integer.parseInt(viewOperaciones.jtf_n1.getText()));
        modelOperaciones.setN2(Integer.parseInt(viewOperaciones.jtf_n2.getText()));       
        modelOperaciones.modl();
        viewOperaciones.jtf_r.setText(String.valueOf(modelOperaciones.getR()));
    }
}
    