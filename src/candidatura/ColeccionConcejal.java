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

    public Concejal obtenerConcejalIndice(int index) {
        return this.concejales.get(index);
    }
    
    public boolean agregarConcejal(Concejal consejalNuevo){
        return this.concejales.add(consejalNuevo);
    }

    public int SizeArray() {
        return this.concejales.size();
    }

}
