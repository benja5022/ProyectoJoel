/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidatura;

import candidatura.Modelos.*;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joel
 */

public class FormatoReporteGeneral implements CandidatosImprimible {

    @Override
    public void imprimir(Object[] array, int num) {
        try {
            FileWriter escritor = new FileWriter("Reportes\\Formato General Anidado.txt", StandardCharsets.UTF_8,true);
            int i, j;
            escritor.write("Año: "+ num +"\n");
            Alcalde[] coleccionAlcaldes = (Alcalde[]) array[0];
            escritor.write("\tCandidatos a Alcalde:\n");
            for(i = 0; i < coleccionAlcaldes.length; i++){
                escritor.write("\t\t" + coleccionAlcaldes[i].getNombre() + '\n');
            }
            Presidente[] coleccionPresidente = (Presidente[]) array[1];
            escritor.write("\tCandidatos a Presidente:\n");
            for(i = 0; i < coleccionPresidente.length; i++){
                escritor.write("\t\t" + coleccionPresidente[i].getNombre() + '\n');
            }
            Concejal[] coleccionConcejal = (Concejal[]) array[2];
            escritor.write("\tCandidatos a Concejal:\n");
            for(i = 0; i < coleccionConcejal.length; i++){
                escritor.write("\t\t" + coleccionConcejal[i].getNombre() + '\n');
            }
            Gore[] coleccionGore = (Gore[]) array[3];
            escritor.write("\tCandidatos a Gore:\n");
            for(i = 0; i < coleccionGore.length; i++){
                escritor.write("\t\t" + coleccionGore[i].getNombre() + '\n');
            }            

            escritor.close();
        } catch (IOException ex) {
            Logger.getLogger(FormatoReporteGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }    }

    @Override
    public void imprimir(Object[] array) {
        try {
            FileWriter escritor = new FileWriter("Reportes\\Formato General Anidado.txt", StandardCharsets.UTF_8,true);
            int i, j;
            
            Alcalde[] coleccionAlcaldes = (Alcalde[]) array[0];
            escritor.write("Candidatos a Alcalde:\n");
            for(i = 0; i < coleccionAlcaldes.length; i++){
                escritor.write('\t' + coleccionAlcaldes[i].getNombre() + '\n');
            }
            Presidente[] coleccionPresidente = (Presidente[]) array[1];
            escritor.write("Candidatos a Presidente:\n");
            for(i = 0; i < coleccionPresidente.length; i++){
                escritor.write('\t' + coleccionPresidente[i].getNombre() + '\n');
            }
            Concejal[] coleccionConcejal = (Concejal[]) array[2];
            escritor.write("Candidatos a Concejal:\n");
            for(i = 0; i < coleccionConcejal.length; i++){
                escritor.write('\t' + coleccionConcejal[i].getNombre() + '\n');
            }
            Gore[] coleccionGore = (Gore[]) array[3];
            escritor.write("Candidatos a Gore:\n");
            for(i = 0; i < coleccionGore.length; i++){
                escritor.write('\t' + coleccionGore[i].getNombre() + '\n');
            }            

            escritor.close();
        } catch (IOException ex) {
            Logger.getLogger(FormatoReporteGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }     }

}
