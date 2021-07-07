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
public class FormatoConsejal implements CandidatosImprimible {

    @Override
    public void imprimir(Cargos cargos) {
        try {
            FileWriter escritor = new FileWriter("Reportes\\Concejales.txt", StandardCharsets.UTF_8);
            Concejal current;
            Concejal[] coleccionConcejales = cargos.obtenerArrayConcejal();
            escritor.write("Candidatos a ser Consejal:\n");
            for (int i = 0; i < coleccionConcejales.length; i++) {
                current = coleccionConcejales[i];
                escritor.write("Nombre Candidato: " + current.getNombre()
                    + '\n' + "Comuna: " + current.getComuna() + '\n' + "Partido Político: " + current.getPartido()
                    + '\n' + "Edad: " + current.getCantAnos()+"\n\n");
            }
            escritor.close();

        } catch (IOException ex) {
            Logger.getLogger(FormatoAlcaldes.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*Concejal current;
        Concejal[] coleccionConcejales = cargos.obtenerArrayConcejal();
        System.out.println("Candidatos a ser Concejal:\n");
        for (int i = 0; i < coleccionConcejales.length; i++) {
            current = coleccionConcejales[i];
            System.out.println("Nombre Candidato: " + current.getNombre()
                    + '\n' + "Comuna: " + current.getComuna() + '\n' + "Partido Político: " + current.getPartido()
                    + '\n' + "Edad: " + current.getCantAnos());
        }*/
    }

}
