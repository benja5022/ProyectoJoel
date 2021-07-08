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
public class ColeccionGore {

    private ArrayList<Gore> gores;

    public ColeccionGore() {
        this.gores = new ArrayList();
    }

    public Gore obtenerGore(int index) {
        return this.gores.get(index);

    }

    public Persona obtenerGore(String nombre) {

        for (int i = 0; i < gores.size(); i++) {
            if (nombre.equals(gores.get(i).getNombre())) {
                return gores.get(i);
            }
        }
        return null;
    }

    public boolean agregarGore(Gore goreNuevo) {
        return this.gores.add(goreNuevo);
    }
   
    
    public boolean eliminarGore(Gore nombre){
        for (int i = 0; i < gores.size(); i++) {
            if (nombre.equals(gores.get(i).getNombre())) {
                this.gores.remove(i);
                return true;
            }
        }
        return false;
    }

    public int SizeArray() {
        return this.gores.size();
    }

}
