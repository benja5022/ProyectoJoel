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
public class ColeccionAlcaldes {

    private ArrayList<Alcalde> alcaldes;

    public ColeccionAlcaldes() {
        this.alcaldes = new ArrayList();
    }

    public Alcalde obtenerAlcalde(int index) {
        return this.alcaldes.get(index);

    }

    public Persona obtenerAlcalde(String nombre) {

        for (int i = 0; i < alcaldes.size(); i++) {
            if (nombre.equals(alcaldes.get(i).getNombre())) {
                return alcaldes.get(i);
            }
        }
        return null;
    }

    public boolean agregarAlcalde(Alcalde alcaldeNuevo) {
        return this.alcaldes.add(alcaldeNuevo);
    }
    
     public boolean eliminarAlcalde(Alcalde nombre){
        for (int i = 0; i < alcaldes.size(); i++) {
            if (nombre.equals(alcaldes.get(i).getNombre())) {
                this.alcaldes.remove(i);
                return true;
            }
        }
        return false;
    }
     
    public int SizeArray() {
        return this.alcaldes.size();
    }
}
