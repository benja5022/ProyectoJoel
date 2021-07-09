package candidatura;
import candidatura.Modelos.*;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class ColeccionAnios {
    
    private ArrayList<AnosCandidatura> fechas;

    public ColeccionAnios(){
        
        this.fechas = new ArrayList();
    }
    
    public void rellenarHard(AnosCandidatura anioCero) throws IOException{
        fechas.add(anioCero);
        anioCero.rellenar0(anioCero);
        
    }
    
    public void leerData(AnosCandidatura anioNuevo) throws IOException{
        fechas.add(anioNuevo);
        anioNuevo.leerDatos(anioNuevo);
        
    }   
    
    public AnosCandidatura obtenerAnioIndice(int index) {
        return this.fechas.get(index);
    }
    
    public AnosCandidatura obtenerAnioC(int ano){

        for (int i = 0; i < fechas.size(); i++) {
            if (ano == (fechas.get(i).getAnio())) {
                return fechas.get(i);
            }
        }
        return null;           
    }
    
    public boolean agregarAnio(AnosCandidatura nuevoAnio){
        return this.fechas.add(nuevoAnio);
    }
    
    public boolean eliminarAnioC(int ano){
        for (int i = 0; i < fechas.size(); i++) {
            if (ano == (fechas.get(i).getAnio())) {
                this.fechas.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public int tamanioArreglo() {
        return this.fechas.size();
    }
   
    public AnosCandidatura consulta (ColeccionAnios registro){
        
    int anoConsulta =   Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Elija el año a consultar\n",
                        JOptionPane.QUESTION_MESSAGE));
                        AnosCandidatura num3 = registro.obtenerAnioC(anoConsulta);
                        return num3;
    }                 
    
    public void mostrarAnios (ColeccionAnios lista){
        
        if (lista.tamanioArreglo()<=1){
            JOptionPane.showMessageDialog(null, "No hay años disponibles para consultar, la base de datos está vacía\n");
            return;
        }
        String mostrar = "Los años a consultar son: \n";
        int num;       
        for(int i=0; i < lista.tamanioArreglo();i++){
            if ((lista.fechas.get(i))!= null){ 
                num= lista.fechas.get(i).getAnio();
                mostrar+= num+ "\n";
                
            }           
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }
    
    public void reporteAnidado(ColeccionAnios reg){
        int num;
        for(int i=0; i < reg.tamanioArreglo();i++){
            if ((reg.fechas.get(i))!= null){ 
                num= reg.fechas.get(i).getAnio();
                
            }           
        }
        //fullReportes()
    }
 
}
