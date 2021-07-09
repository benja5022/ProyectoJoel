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
    public void imprimir(Cargos cargos) {
        try {
            FileWriter escritor = new FileWriter("Reportes\\Formato General Anidado.txt", StandardCharsets.UTF_8);
            int i, j;
            
            Alcalde[] coleccionAlcaldes = cargos.obtenerArrayAlcaldes();
            escritor.write("Candidatos a Alcalde:\n");
            for(i = 0; i < coleccionAlcaldes.length; i++){
                escritor.write('\t' + coleccionAlcaldes[i].getNombre() + '\n');
            }
            Presidente[] coleccionPresidente = cargos.obtenerArrayPresidente();
            escritor.write("Candidatos a Presidente:\n");
            for(i = 0; i < coleccionPresidente.length; i++){
                escritor.write('\t' + coleccionPresidente[i].getNombre() + '\n');
            }
            Concejal[] coleccionConcejal = cargos.obtenerArrayConcejal();
            escritor.write("Candidatos a Concejal:\n");
            for(i = 0; i < coleccionConcejal.length; i++){
                escritor.write('\t' + coleccionConcejal[i].getNombre() + '\n');
            }
            Gore[] coleccionGore = cargos.obtenerArrayGore();
            escritor.write("Candidatos a Gore:\n");
            for(i = 0; i < coleccionGore.length; i++){
                escritor.write('\t' + coleccionGore[i].getNombre() + '\n');
            }            

            escritor.close();
        } catch (IOException ex) {
            Logger.getLogger(FormatoReporteGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
