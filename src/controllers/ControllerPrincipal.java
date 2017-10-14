package controllers;
import models.ModelPrincipal;
import views.ViewBlocNotas;
import views.ViewMayor;
import views.ViewOrdenar;
import views.ViewOperaciones;
import views.ViewPrincipal;

public class ControllerPrincipal {
    private ModelPrincipal mp;
    private ViewPrincipal vp;
    private ViewMayor vm;
    private ViewOrdenar vo;
    private ViewOperaciones vo2;
    private ViewBlocNotas bn;
    private ControllerPrincipal cp;
    
    public ControllerPrincipal(ModelPrincipal mp, Object views[]){
        this.mp=mp;
        this.vp=(ViewPrincipal)views[4];
        this.vm=(ViewMayor)views[0];
        this.vo=(ViewOrdenar)views[1];
        this.vo2=(ViewOperaciones)views[2];
        this.bn=(ViewBlocNotas)views[3];
        this.vp.jmi_mayor.addActionListener(e->jmi_mayor_clic());
        this.vp.jmi_operaciones.addActionListener(e->jmi_ordenar_clic());
        this.vp.jmi_ordenar.addActionListener(e->jmi_ordenar2_clic());
        this.vp.jmi_bloc_notas.addActionListener(e->jmi_bloc_notas_clic());        
        this.vp.jmi_salir.addActionListener(e->jmi_salir_clic());        
        initView();
    }
    private void initView(){
        this.vp.setTitle("Remedial");
        this.vp.setLocationRelativeTo(null);
        this.vp.setVisible(true);
    }
    public void jmi_mayor_clic(){
        this.vp.setContentPane(vm);
        this.vp.revalidate();
        this.vp.repaint();
    }
    public void jmi_ordenar_clic(){
        this.vp.setContentPane(vo);
        this.vp.revalidate();
        this.vp.repaint();
    }
    public void jmi_ordenar2_clic(){
        this.vp.setContentPane(vo2);
        this.vp.revalidate();
        this.vp.repaint();
    }
    public void jmi_bloc_notas_clic(){
        this.vp.setContentPane(bn);
        this.vp.revalidate();
        this.vp.repaint();
    }    
    public void jmi_salir_clic(){
        System.exit(0);
    }
}
