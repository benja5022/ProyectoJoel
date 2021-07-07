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
public class FormatoGore implements CandidatosImprimible {

    @Override
    public void imprimir(Cargos cargos) {
        Gore current;
        Gore[] coleccionGore = cargos.obtenerArrayGore();

        for (int i = 0; i < coleccionGore.length; i++) {
            current = coleccionGore[i];
            System.out.println("Nombre Candidato: " + current.getNombre()
                    + '\n' + "Comuna: " + '\n' + "Partido Político: " + current.getPartido()
                    + '\n' + "Región: " + current.getRegion());
        }
    }

}
