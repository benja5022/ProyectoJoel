/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidatura;

import candidatura.Modelos.Persona;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Joel
 */

public class ColeccionGeneral {

    HashMap<String, ColeccionCandidatosPorPartido> coleccionGeneral;

    public ColeccionGeneral() {
        this.coleccionGeneral = new HashMap();
    }

    public Persona[] retornarConjuntoDeCandidatos(String partidoPolitico) {
        int i;
        Persona[] coleccionDeCandidatos = new Persona[coleccionGeneral.get(partidoPolitico).sizeArray()];
        ColeccionCandidatosPorPartido valores = coleccionGeneral.get(partidoPolitico);

        for (i = 0; i < valores.sizeArray(); i++) {
            coleccionDeCandidatos[i] = valores.retornarCandidatoIndice(i);
        }

        return coleccionDeCandidatos;
    }

    public Persona retornarPersona(String partidoPolitico, String nombre) {

        if (coleccionGeneral.containsKey(partidoPolitico)) {
            return coleccionGeneral.get(partidoPolitico).retornarCandidato(nombre);
        }

        return null;

    }

    public void agregarPersona(Persona candidato) {
        if (candidato != null) {

            if (this.coleccionGeneral.containsKey(candidato.getPartido())) {
                this.coleccionGeneral.get(candidato.getPartido()).agregarCandidato(candidato);
            } else {
                agregarPartidoPolitico(candidato.getPartido());
                this.coleccionGeneral.get(candidato.getPartido()).agregarCandidato(candidato);
            }

        }
    }

    public void eliminarPersona(Persona candidato) {
        if (candidato != null && this.coleccionGeneral.containsKey(candidato.getPartido())) {
            this.coleccionGeneral.get(candidato.getPartido()).eliminarCandidato(candidato);
        }
    }

    public void agregarPartidoPolitico(String nombrePartido) {

        if (this.coleccionGeneral.containsKey(nombrePartido)) {
            System.out.println("El Partido ya existe");
        } else {
            coleccionGeneral.put(nombrePartido, new ColeccionCandidatosPorPartido());
        }
    }
}
