/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidatura;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Benjamín
 */
public class FormatoPresidente implements CandidatosImprimible {

    @Override
    public void imprimir(Cargos cargos) {
        
        try {
            FileWriter escritor = new FileWriter("Reportes\\Presidentes.txt", StandardCharsets.UTF_8);
            Presidente current;
            Presidente[] coleccionPresidentes = cargos.obtenerArrayPresidente();
            escritor.write("Candidatos a la Presidencia:\n");
            for (int i = 0; i < coleccionPresidentes.length; i++) {
                current = coleccionPresidentes[i];
                escritor.write("Nombre Candidato: " + current.getNombre()
                    + '\n' + "Partido Político: " + current.getPartido()
                    + "\n\n");
            }
            escritor.close();

        } catch (IOException ex) {
            Logger.getLogger(FormatoAlcaldes.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*Presidente current;
        Presidente[] coleccionPresidentes = cargos.obtenerArrayPresidente();
        System.out.println("Candidatos a la Presidencia:\n");
        for (int i = 0; i < coleccionPresidentes.length; i++) {
            current = coleccionPresidentes[i];
            System.out.println("Nombre Candidato: " + current.getNombre()
                    + '\n' + "Partido Político: " + current.getPartido()
                    + '\n');
        }*/
    }

}
