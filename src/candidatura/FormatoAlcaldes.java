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
public class FormatoAlcaldes implements CandidatosImprimible {

    @Override
    public void imprimir(Cargos cargos) {

        Alcalde current;
        Alcalde[] coleccionAlcaldes = cargos.obtenerArrayAlcaldes();

        for (int i = 0; i < coleccionAlcaldes.length; i++) {
            current = coleccionAlcaldes[i];
            System.out.println("Nombre Candidato: " + current.getNombre()
                    + '\n' + "Comuna: " + current.getComuna() + '\n' + "Partido Político: " + current.getPartido()
                    + '\n' + "Edad: " + current.getCantAnos());
        }
    }

}
