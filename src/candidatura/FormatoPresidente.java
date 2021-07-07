/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidatura;

/**
 *
 * @author Benjamín
 */
public class FormatoPresidente implements CandidatosImprimible {

    @Override
    public void imprimir(Cargos cargos) {
        Presidente current;
        Presidente[] coleccionPresidentes = cargos.obtenerArrayPresidente();

        for (int i = 0; i < coleccionPresidentes.length; i++) {
            current = coleccionPresidentes[i];
            System.out.println("Nombre Candidato: " + current.getNombre()
                    + '\n' + "Partido Político: " + current.getPartido()
                    + '\n');
        }
    }

}
