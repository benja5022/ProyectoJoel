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


public class FormatoGore implements CandidatosImprimible {

    @Override
    public void imprimir(Cargos cargos) {
        
        try {
            FileWriter escritor = new FileWriter("Reportes\\Gores.txt", StandardCharsets.UTF_8);
            Gore current;
            Gore[] coleccionGores = cargos.obtenerArrayGore();
            escritor.write("Candidatos a ser gores:\n");
            for (int i = 0; i < coleccionGores.length; i++) {
                current = coleccionGores[i];
                escritor.write("Nombre Candidato: " + current.getNombre()
                    +'\n' + "Partido Político: " + current.getPartido()
                    +'\n' + "Región: " + current.getRegion()+"\n\n");
            }
            escritor.close();

        } catch (IOException ex) {
            Logger.getLogger(FormatoAlcaldes.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*Gore current;
        Gore[] coleccionGore = cargos.obtenerArrayGore();
        System.out.println("Candidatos a ser GORE:\n");
        for (int i = 0; i < coleccionGore.length; i++) {
            current = coleccionGore[i];
            System.out.println("Nombre Candidato: " + current.getNombre()
                    +'\n' + "Partido Político: " + current.getPartido()
                    + '\n' + "Región: " + current.getRegion());
        }*/
    }

}
