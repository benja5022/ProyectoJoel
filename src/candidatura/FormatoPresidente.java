/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidatura;

import candidatura.Modelos.Presidente;
import candidatura.Modelos.Cargos;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joel
 */

public class FormatoPresidente implements CandidatosImprimible {

    @Override
    public void imprimir(Object[] array,int anio) {
        
        try {
            FileWriter escritor = new FileWriter("Reportes\\Presidentes.txt", StandardCharsets.UTF_8);
            Presidente current;
            Presidente[] coleccionPresidentes = (Presidente[]) array;
            escritor.write("Candidatos a la Presidencia:\n");
            for (int i = 0; i < coleccionPresidentes.length; i++) {
                current = coleccionPresidentes[i];
                escritor.write("Nombre Candidato: " + current.getNombre()
                    + '\n' + "Partido Político: " + current.getPartido()
                    + '\n' + "Cantidad de veces que se ha postulado al cargo: " + current.getCantPresent()
                    + '\n' + "Cantidad de veces que ha ejercido el cargo: " + current.getCantCarg()
                    + "\n\n");
            }
            escritor.close();

        } catch (IOException ex) {
            Logger.getLogger(FormatoAlcaldes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void imprimir(Object[] array) {
        try {
            FileWriter escritor = new FileWriter("Reportes\\Presidentes.txt", StandardCharsets.UTF_8);
            Presidente current;
            Presidente[] coleccionPresidentes = (Presidente[]) array;
            escritor.write("Candidatos a la Presidencia:\n");
            for (int i = 0; i < coleccionPresidentes.length; i++) {
                current = coleccionPresidentes[i];
                escritor.write("Nombre Candidato: " + current.getNombre()
                    + '\n' + "Partido Político: " + current.getPartido()
                    + '\n' + "Cantidad de veces que se ha postulado al cargo: " + current.getCantPresent()
                    + '\n' + "Cantidad de veces que ha ejercido el cargo: " + current.getCantCarg()
                    + "\n\n");
            }
            escritor.close();

        } catch (IOException ex) {
            Logger.getLogger(FormatoAlcaldes.class.getName()).log(Level.SEVERE, null, ex);
        }    }

}
