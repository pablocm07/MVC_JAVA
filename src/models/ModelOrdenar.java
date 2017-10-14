package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.DefaultListModel;


public class ModelOrdenar {
    DefaultListModel model = new DefaultListModel();
    List<Integer> lista = new ArrayList<Integer>();
    int num;
    int cont;
    String a;
    
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }              
    public DefaultListModel modelList(){              
       return model;
    }
    public void addModel(){        
        model.addElement(num+"");
    }
    public List list(){
        return lista;
    }
    public void addList(){
        lista.add(num);
    }
    public void ordenar(){
        Collections.sort(lista);
        for (int i=0; i<list().size();i++){
            Integer val = (Integer) list().get(i);
            modelList().addElement(val);
        }        
    }
}
