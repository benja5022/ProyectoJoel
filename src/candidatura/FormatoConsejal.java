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
public class FormatoConsejal implements CandidatosImprimible {

    @Override
    public void imprimir(Cargos cargos) {
        Concejal current;
        Concejal[] coleccionConcejales = cargos.obtenerArrayConcejal();

        for (int i = 0; i < coleccionConcejales.length; i++) {
            current = coleccionConcejales[i];
            System.out.println("Nombre Candidato: " + current.getNombre()
                    + '\n' + "Comuna: " + current.getComuna() + '\n' + "Partido Político: " + current.getPartido()
                    + '\n' + "Edad: " + current.getCantAnos());
        }
    }

}
