/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidatura;

import candidatura.Modelos.Cargos;
import candidatura.Modelos.Alcalde;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joel
 */

public class FormatoAlcaldes implements CandidatosImprimible {

    @Override
    public void imprimir(Object[] alcaldes, int num) {

        try {
            FileWriter escritor = new FileWriter("Reportes\\Alcaldes.txt", StandardCharsets.UTF_8);
            Alcalde current;
            Alcalde[] coleccionAlcaldes =(Alcalde[]) alcaldes;
            escritor.write("Candidatos a la Alcaldia:\n");
            for (int i = 0; i < coleccionAlcaldes.length; i++) {
                current = coleccionAlcaldes[i];
                escritor.write("Nombre Candidato: " + current.getNombre()
                        + '\n' + "Comuna: " + current.getComuna() 
                        + '\n' + "Partido Político: " + current.getPartido()
                        + '\n' + "Cantidad de años que ha ejercido el cargo : " + current.getCantAnos()
                        +"\n\n");
            }
            escritor.close();

        } catch (IOException ex) {
            Logger.getLogger(FormatoAlcaldes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
  }

    @Override
    public void imprimir(Object[] alcaldes) {
        try {
            FileWriter escritor = new FileWriter("Reportes\\Alcaldes.txt", StandardCharsets.UTF_8);
            Alcalde current;
            Alcalde[] coleccionAlcaldes =(Alcalde[]) alcaldes;
            escritor.write("Candidatos a la Alcaldia:\n");
            for (int i = 0; i < coleccionAlcaldes.length; i++) {
                current = coleccionAlcaldes[i];
                escritor.write("Nombre Candidato: " + current.getNombre()
                        + '\n' + "Comuna: " + current.getComuna() 
                        + '\n' + "Partido Político: " + current.getPartido()
                        + '\n' + "Cantidad de años que ha ejercido el cargo : " + current.getCantAnos()
                        +"\n\n");
            }
            escritor.close();

        } catch (IOException ex) {
            Logger.getLogger(FormatoAlcaldes.class.getName()).log(Level.SEVERE, null, ex);
        }    }

}
