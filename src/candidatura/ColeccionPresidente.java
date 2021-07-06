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
public class ColeccionPresidente {


    private ArrayList<Presidente> presidentes;
    
    
    public ColeccionPresidente() {
        this.presidentes = new ArrayList();
    }
    
    public Presidente obtenerPresidenteIndice(int index){
        return this.presidentes.get(index);
        
    }
    
    public boolean agregarPresidente(Presidente presidenteNuevo){
        return this.presidentes.add(presidenteNuevo);
    }
    
    public int SizeArray(){
       return this.presidentes.size();
    }
    
    
    
}
