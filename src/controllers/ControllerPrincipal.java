package controllers;
import models.ModelPrincipal;
import views.ViewMayor;
import views.ViewOrdenar;
import views.ViewOrdenar2;
import views.ViewPrincipal;

public class ControllerPrincipal {
    private ModelPrincipal mp;
    private ViewPrincipal vp;
    private ViewMayor vm;
    private ViewOrdenar vo;
    private ViewOrdenar2 vo2;
    private ControllerPrincipal cp;
    
    public ControllerPrincipal(ModelPrincipal mp, Object views[]){
        this.mp=mp;
        this.vp=(ViewPrincipal)views[3];
        this.vm=(ViewMayor)views[0];
        this.vo=(ViewOrdenar)views[1];
        this.vo2=(ViewOrdenar2)views[2];
        this.vp.jmi_mayor.addActionListener(e->jmi_mayor_clic());
        this.vp.jmi_ordenar.addActionListener(e->jmi_ordenar_clic());
        this.vp.jmi_ordenar2.addActionListener(e->jmi_ordenar2_clic());
        initView();
    }
    private void initView(){
        this.vp.setTitle("Views with arrays");
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
}
