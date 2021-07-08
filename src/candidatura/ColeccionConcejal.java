/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidatura;

import java.util.ArrayList;

/**
 *
 * @author Benjamín
 */
public class ColeccionConcejal {

    private ArrayList<Concejal> concejales;
    
    public ColeccionConcejal(){
        this.concejales = new ArrayList();
    }

    public Concejal obtenerConcejal(int index) {
        return this.concejales.get(index);
    }

    public Persona obtenerConcejal(String nombre){

        for (int i = 0; i < concejales.size(); i++) {
            if (nombre.equals(concejales.get(i).getNombre())) {
                return concejales.get(i);
            }
        }
        return null;           
    }
    
    public boolean agregarConcejal(Concejal consejalNuevo){
        return this.concejales.add(consejalNuevo);
    }
    
    public boolean eliminarConcejal(Concejal nombre){
        for (int i = 0; i < concejales.size(); i++) {
            if (nombre.equals(concejales.get(i).getNombre())) {
                this.concejales.remove(i);
                return true;
            }
        }
        return false;
    }

    public int SizeArray() {
        return this.concejales.size();
    }

}
