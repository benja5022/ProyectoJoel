/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidatura;

import candidatura.Modelos.Persona;
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

public class FormatoReporteGeneral implements CandidatosImprimible {

    @Override
    public void imprimir(Cargos cargos) {
        try {
            FileWriter escritor = new FileWriter("Reportes\\ReporteAnidado.txt", StandardCharsets.UTF_8);
            int i, j;
            String[] partidosPoliticos = cargos.retornarListadoPartidos();
            Persona[] listadoCandidatos;
            for (i = 0; i < partidosPoliticos.length; i++) {
                listadoCandidatos = cargos.retornarConjuntoDeCandidatos(partidosPoliticos[i]);
                escritor.write(partidosPoliticos[i] + ":\n");
                for (j = 0; j < listadoCandidatos.length; j++) {
                    escritor.write('\t' + listadoCandidatos[j].getNombre() + '\n');
                }
            }
            escritor.close();
        } catch (IOException ex) {
            Logger.getLogger(FormatoReporteGeneral.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
