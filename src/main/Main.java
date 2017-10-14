package main;

import controllers.ControllerMayor;
import controllers.ControllerOrdenar;
import controllers.ControllerOrdenar2;
import controllers.ControllerPrincipal;
import models.ModelMayor;
import models.ModelOrdenar;
import models.ModelOrdenar2;
import models.ModelPrincipal;
import views.ViewMayor;
import views.ViewOrdenar;
import views.ViewOrdenar2;
import views.ViewPrincipal;

public class Main {
    
    public static void main(String pcm[]){
        ModelMayor model_mayor = new ModelMayor();
        ViewMayor view_mayor = new ViewMayor();
        ControllerMayor controller_mayor = new ControllerMayor(model_mayor,view_mayor);
        ModelOrdenar model_ordenar = new ModelOrdenar();
        ViewOrdenar view_ordenar = new ViewOrdenar();
        ControllerOrdenar controller_ordenar = new ControllerOrdenar(model_ordenar,view_ordenar);
        ModelOrdenar2 model_ordenar2 = new ModelOrdenar2();
        ViewOrdenar2 view_ordenar2 = new ViewOrdenar2();
        ControllerOrdenar2 controller_ordenar2 = new ControllerOrdenar2(model_ordenar2,view_ordenar2);
        ModelPrincipal model_principal = new ModelPrincipal();
        ViewPrincipal view_principal = new ViewPrincipal();
        Object views[] = new Object[4];
        views[0]=view_mayor;
        views[1]=view_ordenar;
        views[2]=view_ordenar2;
        views[3]=view_principal;
        ControllerPrincipal controller_principal = new ControllerPrincipal(model_principal,views);
    }
}
