package candidatura;

import candidatura.Modelos.*;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class ColeccionAnios {

    private ArrayList<AnosCandidatura> fechas;

    public ColeccionAnios() {

        this.fechas = new ArrayList();
    }

    public void rellenarHard(AnosCandidatura anioCero) throws IOException {
        fechas.add(anioCero);
        anioCero.rellenar0(anioCero);

    }

    public void leerData(AnosCandidatura anioNuevo) throws IOException {
        fechas.add(anioNuevo);
        anioNuevo.leerDatos(anioNuevo);

    }

    public AnosCandidatura obtenerAnioIndice(int index) {
        return this.fechas.get(index);
    }

    public AnosCandidatura obtenerAnioC(int ano) {

        for (int i = 0; i < fechas.size(); i++) {
            if (ano == (fechas.get(i).getAnio())) {
                return fechas.get(i);
            }
        }
        return null;
    }

    public boolean agregarAnio(AnosCandidatura nuevoAnio) {
        return this.fechas.add(nuevoAnio);
    }

    public boolean eliminarAnioC(int ano) {
        for (int i = 0; i < fechas.size(); i++) {
            if (ano == (fechas.get(i).getAnio())) {
                this.fechas.remove(i);
                return true;
            }
        }
        return false;
    }

    public int tamanioArreglo() {
        return this.fechas.size();
    }

    public AnosCandidatura consulta(ColeccionAnios registro) {

        int anoConsulta = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Elija el año a consultar\n",
                JOptionPane.QUESTION_MESSAGE));
        AnosCandidatura num3 = registro.obtenerAnioC(anoConsulta);
        return num3;
    }
    
    public boolean buscar (ColeccionAnios registro, int anioC){
        boolean flag= false;
        for(int i=0; i < registro.fechas.size();i++){
            if (anioC == registro.fechas.get(i).getAnio()){
                flag=true;
                return flag;
            }
        }
        return flag;
    }
    
    public AnosCandidatura ingreso(ColeccionAnios registro) {

        int anoConsulta = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingrese el año en el que se postula al cargo público\n",
                JOptionPane.QUESTION_MESSAGE));
        
        if(buscar(registro, anoConsulta)){
            
        }
        
        return num3;
    }

    public void mostrarAnios(ColeccionAnios lista) {

        if (lista.tamanioArreglo() <= 1) {
            JOptionPane.showMessageDialog(null, "No hay años disponibles para consultar, la base de datos está vacía\n");
            return;
        }
        String mostrar = "Los años a consultar son: \n";
        int num;
        for (int i = 0; i < lista.tamanioArreglo(); i++) {
            if ((lista.fechas.get(i)) != null) {
                num = lista.fechas.get(i).getAnio();
                mostrar += num + "\n";

            }
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }

    public void reporteAnidado(ColeccionAnios reg) {
        int num;
        for (int i = 0; i < reg.tamanioArreglo(); i++) {
            if ((reg.fechas.get(i)) != null) {
                num = reg.fechas.get(i).getAnio();

            }
        }
        //fullReportes()
    }

    private void ordenarArray() {

        for (int i = 0; i < this.tamanioArreglo(); i++) {
            for (int j = 0; j < this.tamanioArreglo()-1; j++) {
                if (this.obtenerAnioIndice(i)!= null && this.obtenerAnioIndice(i+1) != null && this.obtenerAnioIndice(i).getAnio() < this.obtenerAnioIndice(i+1).getAnio()) {
                    AnosCandidatura tmp = this.obtenerAnioIndice(i + 1);
                    this.fechas.add(i+1, this.obtenerAnioIndice(i));
                    this.fechas.add(i, tmp);

                }
            }
        }
    }
    
    public int[] obtenerConjuntoDeAnios(){
        this.ordenarArray();
        int[] arrayDeAnios = new int[this.tamanioArreglo()];
        for (int i = 0; i < this.tamanioArreglo(); i++) {
            arrayDeAnios[i] = this.obtenerAnioIndice(i).getAnio();
        }
        return arrayDeAnios;
    }
    
    public void imprimirReporteAnidado(){
        // poner funcion que elimine el archivo "anidado"
        for (int i = 0; i < this.fechas.size(); i++) {
            this.obtenerAnioIndice(i).imprimir(this.obtenerAnioIndice(i).getAnio(),4);
        }
    }

}
