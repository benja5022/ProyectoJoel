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
    
    public ColeccionGore()
    {
        this.gores = new ArrayList();
    }  
       
    
    public Gore obtenerGoreIndice(int index){
        return this.gores.get(index);
        
    }
    
    public boolean agregarGore(Gore goreNuevo){
        return this.gores.add(goreNuevo);
    }
    
    public int SizeArray(){
       return this.gores.size();
    }
    
}
