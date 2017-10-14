package controllers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import models.ModelBlocNotas;
import views.ViewBlocNotas;

/**
 *
 * @author tazaz
 */
public class ControllerBlocNotas {        
    private FileReader fr = null;
    private final JFileChooser jfc = new JFileChooser();
    private FileWriter writer;
    ModelBlocNotas model_blocnotas;
    ViewBlocNotas view_blocnotas;
    
    public ControllerBlocNotas(ModelBlocNotas model_blocnotas, ViewBlocNotas view_blocnotas){
        this.model_blocnotas = model_blocnotas;
        this.view_blocnotas = view_blocnotas;           
        view_blocnotas.jbtn_abrir.addActionListener(e->jbtn_abrir());
        view_blocnotas.jbtn_guardar.addActionListener(e->jbtn_guardar());        
        initView();
    }
    public void initView(){
        view_blocnotas.setVisible(true);
    }               
    private void jbtn_abrir(){
        try{
            jfc.showOpenDialog(view_blocnotas);
            model_blocnotas.setArchivo(jfc.getSelectedFile());
            fr = new FileReader (model_blocnotas.getArchivo());
            int character = 0;
            String texto = "";
            while((character=fr.read())!=-1){
                texto+= (char) character;
            }
            fr.close();
            view_blocnotas.jta_archivo.setText(texto);            
        }
        catch(FileNotFoundException e){
            System.err.println("Archivo no encontrado");
        }
        catch(IOException e){
            System.err.println("Error en el archivo");
        }
        finally{
            try{
                fr.close();
            }
            catch(IOException e){
                System.err.println("Error al cerrar");
            }
        }
        
    }
    private void jbtn_guardar(){
        try {
            jfc.showSaveDialog(view_blocnotas);
            model_blocnotas.setArchivo(jfc.getSelectedFile());
            writer = new FileWriter(model_blocnotas.archivo,false);          
            writer.write(view_blocnotas.jta_archivo.getText());
            System.out.println("Se guardo el archivo "+ model_blocnotas.archivo.getName());
            writer.close();
        }catch(FileNotFoundException e){
            System.err.println("Archivo no guardado");
        }
        catch(IOException e){
            System.err.println("Error en el archivo");
        }
        finally{
            try{
                fr.close();
            }
            catch(IOException e){
                System.err.println("Error al cerrar");
            }
        }
    }        
}
