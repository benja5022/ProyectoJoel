/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidatura;

import java.util.ArrayList;

public class ColeccionPresidente {


    private ArrayList<Presidente> presidentes;
    
    
    public ColeccionPresidente() {
        this.presidentes = new ArrayList();
    }
    
    public Presidente obtenerPresidente(int index){
        return this.presidentes.get(index);   
    }
    
    public Presidente obtenerPresidente(String nombre){

        for (int i = 0; i < presidentes.size(); i++) {
            if (nombre.equals(presidentes.get(i).getNombre())) {
                return presidentes.get(i);
            }
        }
        return null;           
    }
    
    public boolean agregarPresidente(Presidente presidenteNuevo){
        return this.presidentes.add(presidenteNuevo);
    }
    
    public boolean eliminarPresidente(String nombre){
        for (int i = 0; i < presidentes.size(); i++) {
            if (nombre.equals(presidentes.get(i).getNombre())) {
                this.presidentes.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public int SizeArray(){
       return this.presidentes.size();
    }
    
    
    
}
