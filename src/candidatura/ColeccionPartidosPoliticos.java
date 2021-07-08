/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidatura;

import java.util.ArrayList;


public class ColeccionPartidosPoliticos {
    private ArrayList<String> coleccionPartidos;
    public ColeccionPartidosPoliticos(){
        this.coleccionPartidos = new ArrayList();
    }
    
    public void agregarPartido(String nombrePartido){
        if(!existenciaPartido(nombrePartido)){
            coleccionPartidos.add(nombrePartido);
            //System.out.println("Partido agregado");
        }
            //System.out.println("El partido ya existe");

    }
    
    public boolean existenciaPartido(String nombre){
        for(int i = 0; i < this.coleccionPartidos.size(); i++){
            if(nombre.equals(this.coleccionPartidos.get(i))){
                return true;
            }
        }
        return false;
    }
    
    public String[] retornarListadoPartidos() {
        String[] coleccionDePartidos = new String[this.coleccionPartidos.size()];
        
        for(int i = 0; i < this.coleccionPartidos.size(); i++){
            coleccionDePartidos[i] = this.coleccionPartidos.get(i);
        }        
        
        return coleccionDePartidos;
    }
    
}
