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
    
    public ColeccionAlcaldes(){
        this.alcaldes = new ArrayList();
    }

    public Alcalde obtenerAlcaldeIndice(int index) {
        return this.alcaldes.get(index);

    }
    
    public boolean agregarAlcalde(Alcalde alcaldeNuevo){
        return this.alcaldes.add(alcaldeNuevo);
    }

    public int SizeArray() {
        return this.alcaldes.size();
    }
}
