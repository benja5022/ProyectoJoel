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
public class ColeccionCandidatosPorPartido {

    ArrayList<Persona> candidatos;

    public ColeccionCandidatosPorPartido() {
        this.candidatos = new ArrayList();
    }

    public boolean agregarCandidato(Persona candidato) {

        for (int i = 0; i < candidatos.size(); i++) {
            if (candidato.getNombre().equals(candidatos.get(i).getNombre())) {
                return false;
            }
        }

        candidatos.add(candidato);

        return true;

    }

    public boolean eliminarCandidato(String nombre) {

        for (int i = 0; i < candidatos.size(); i++) {
            if (nombre.equals(candidatos.get(i).getNombre())) {
                candidatos.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarCandidato(Persona candidatoX) {
        String nombre = candidatoX.getNombre();

        for (int i = 0; i < candidatos.size(); i++) {
            if (nombre.equals(candidatos.get(i).getNombre())) {
                candidatos.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public boolean existenciaCandidato(String nombre){
        for (int i = 0; i < candidatos.size(); i++) {
            if (nombre.equals(candidatos.get(i).getNombre())) {
                return true;
            }
        }
        return false;        
    }
    
    public Persona retornarCandidato(String nombre){

        for (int i = 0; i < candidatos.size(); i++) {
            if (nombre.equals(candidatos.get(i).getNombre())) {
                return candidatos.get(i);
            }
        }
        return null;           
    }
    
    public Persona retornarCandidatoIndice(int index){
        
        return this.candidatos.get(index);           
    }
    
    public int sizeArray(){
        return this.candidatos.size();
    }

}
