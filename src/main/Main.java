package main;

import controllers.ControllerBlocNotas;
import controllers.ControllerMayor;
import controllers.ControllerOrdenar;
import controllers.ControllerOperaciones;
import controllers.ControllerPrincipal;
import models.ModelBlocNotas;
import models.ModelMayor;
import models.ModelOrdenar;
import models.ModelOperaciones;
import models.ModelPrincipal;
import views.ViewBlocNotas;
import views.ViewMayor;
import views.ViewOrdenar;
import views.ViewOperaciones;
import views.ViewPrincipal;

public class Main {
    
    public static void main(String pcm[]){
        ModelMayor model_mayor = new ModelMayor();
        ViewMayor view_mayor = new ViewMayor();
        ControllerMayor controller_mayor = new ControllerMayor(model_mayor,view_mayor);
        
        ModelOrdenar model_ordenar = new ModelOrdenar();
        ViewOrdenar view_ordenar = new ViewOrdenar();
        ControllerOrdenar controller_ordenar = new ControllerOrdenar(model_ordenar,view_ordenar);
        
        ModelOperaciones model_operaciones = new ModelOperaciones();
        ViewOperaciones view_operaciones = new ViewOperaciones();
        ControllerOperaciones controller_operaciones = new ControllerOperaciones(model_operaciones,view_operaciones);
        
        ModelBlocNotas model_blocnotas = new ModelBlocNotas();
        ViewBlocNotas view_blocnotas = new ViewBlocNotas();
        ControllerBlocNotas controller_blocnotas = new ControllerBlocNotas(model_blocnotas,view_blocnotas);
        
        ModelPrincipal model_principal = new ModelPrincipal();
        ViewPrincipal view_principal = new ViewPrincipal();
        Object views[] = new Object[5];
        views[0]=view_mayor;
        views[1]=view_ordenar;
        views[2]=view_operaciones;
        views[3]=view_blocnotas;
        views[4]=view_principal;
        ControllerPrincipal controller_principal = new ControllerPrincipal(model_principal,views);
    }
}
