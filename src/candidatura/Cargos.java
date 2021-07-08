/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidatura;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class Cargos {

    private ColeccionPresidente coleccionDePresidentes;
    private ColeccionGore coleccionDeGores;
    private ColeccionConcejal coleccionDeConcejales;
    private ColeccionAlcaldes coleccionDeAlcaldes;
    private ColeccionGeneral coleccionTotal;

    private ColeccionPartidosPoliticos partidosPoliticos;
    public CandidatosImprimible impresion;

    public Cargos() {

        this.coleccionDePresidentes = new ColeccionPresidente();
        this.coleccionDeGores = new ColeccionGore();
        this.coleccionDeConcejales = new ColeccionConcejal();
        this.coleccionDeAlcaldes = new ColeccionAlcaldes();
        this.coleccionTotal = new ColeccionGeneral();
        this.partidosPoliticos = new ColeccionPartidosPoliticos();

    }

    public boolean agregar(Presidente presidente) {
        String aux = presidente.getNombre();
        this.coleccionTotal.agregarPersona(presidente);
        this.partidosPoliticos.agregarPartido(presidente.getPartido());
        return coleccionDePresidentes.agregarPresidente(presidente);//presidentes.add(presidente);
    }

    public boolean agregar(Gore gore) {
        String aux = gore.getNombre();
        this.partidosPoliticos.agregarPartido(gore.getPartido());
        this.coleccionTotal.agregarPersona(gore);
        return coleccionDeGores.agregarGore(gore);//gores.add(gore);
    }

    public boolean agregar(Concejal concejal) {
        String aux = concejal.getNombre();
        this.partidosPoliticos.agregarPartido(concejal.getPartido());
        this.coleccionTotal.agregarPersona(concejal);
        return this.coleccionDeConcejales.agregarConcejal(concejal);//concejales.add(concejal);
    }

    public boolean agregar(Alcalde alcalde) {
        String aux = alcalde.getNombre();
        this.partidosPoliticos.agregarPartido(alcalde.getPartido());
        this.coleccionTotal.agregarPersona(alcalde);
        return this.coleccionDeAlcaldes.agregarAlcalde(alcalde);//alcaldes.add(alcalde);
    }

    public void mostrarP() throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el nombre del presidente del cual desea la informacion");
        String aux;
        aux = read.readLine();
        Presidente presidentito = (Presidente) this.coleccionDePresidentes.obtenerPresidente(aux);
        infoCargo(presidentito);
    }

    public void mostrarG() throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el nombre del gore del cual desea la informacion");
        String aux;
        aux = read.readLine();
        Gore gorito = (Gore) this.coleccionDeGores.obtenerGore(aux);
        infoCargo(gorito);
    }

    public void mostrarC() throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el nombre del concejal del cual desea la informacion");
        String aux;
        aux = read.readLine();
        Concejal concejito = (Concejal) this.coleccionDeConcejales.obtenerConcejal(aux);
        infoCargo(concejito);
    }

    public void mostrarA() throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el nombre del alcalde del cual desea la informacion");
        String aux;
        aux = read.readLine();
        Alcalde alcaldito = (Alcalde) this.coleccionDeAlcaldes.obtenerAlcalde(aux);
        infoCargo(alcaldito);
    }

    public void mostrarPresVotos(Cargos car) {
        Presidente aux;
        Presidente aux2 = new Presidente();
        for (int i = 0; i < car.coleccionDePresidentes.SizeArray(); i++) {
            aux = (Presidente) car.coleccionDePresidentes.obtenerPresidente(i);
            if (aux.getVotos() > aux2.getVotos()) {
                aux2 = aux;
            }
        }
        JOptionPane.showMessageDialog(null, aux2.getNombre());
    }

    public void mostrarGoreVotos(Cargos car) {
        Gore aux;
        Gore aux2 = new Gore();
        for (int i = 0; i < car.coleccionDeGores.SizeArray(); i++) {
            aux = (Gore) car.coleccionDeGores.obtenerGore(i);
            if (aux.getVotos() > aux2.getVotos()) {
                aux2 = aux;
            }
        }
        JOptionPane.showMessageDialog(null, aux2.getNombre());
    }

    public void mostrarConceVotos(Cargos car) {
        Concejal aux;
        Concejal aux2 = new Concejal();
        for (int i = 0; i < car.coleccionDeConcejales.SizeArray(); i++) {
            aux = (Concejal) car.coleccionDeConcejales.obtenerConcejal(i);
            if (aux.getVotos() > aux2.getVotos()) {
                aux2 = aux;
            }
        }
        JOptionPane.showMessageDialog(null, aux2.getNombre());
    }

    public void mostrarAlcaVotos(Cargos car) {
        Alcalde aux;
        Alcalde aux2 = new Alcalde();
        for (int i = 0; i < car.coleccionDeAlcaldes.SizeArray(); i++) {
            aux = (Alcalde) car.coleccionDeAlcaldes.obtenerAlcalde(i);
            if (aux.getVotos() > aux2.getVotos()) {
                aux2 = aux;
            }
        }
        JOptionPane.showMessageDialog(null, aux2.getNombre());
    }

    public void infoCargo(Presidente presi) {
        System.out.println(presi.getNombre());
        System.out.println(presi.getPartido());
        System.out.println(presi.getVotos());
    }

    public void infoCargo(Gore blood) {
        System.out.println(blood.getNombre());
        System.out.println(blood.getPartido());
        System.out.println(blood.getVotos());
    }

    public void infoCargo(Concejal conce) {
        System.out.println(conce.getNombre());
        System.out.println(conce.getPartido());
        System.out.println(conce.getVotos());
    }

    public void infoCargo(Alcalde alca) {
        System.out.println(alca.getNombre());
        System.out.println(alca.getPartido());
        System.out.println(alca.getVotos());
    }

    public void mostrarListaP(Cargos car) {
        String mostrar = "";
        Presidente aux;
        for (int i = 0; i < car.coleccionDePresidentes.SizeArray(); i++) {
            aux = (Presidente) car.coleccionDePresidentes.obtenerPresidente(i);
            mostrar = mostrar + aux.getNombre();
            mostrar += " ";
            mostrar = mostrar + aux.getPartido();
            mostrar += " ";
            mostrar = mostrar + aux.getVotos();
            mostrar += "\n";
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }

    public void mostrarListaG(Cargos car) {
        String mostrar = "";
        Gore aux;
        for (int i = 0; i < car.coleccionDeGores.SizeArray(); i++) {
            aux = (Gore) car.coleccionDeGores.obtenerGore(i);
            mostrar = mostrar + aux.getNombre();
            mostrar += " ";
            mostrar = mostrar + aux.getPartido();
            mostrar += " ";
            mostrar = mostrar + aux.getVotos();
            mostrar += "\n";
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }

    public void mostrarListaC(Cargos car) {
        String mostrar = "";
        Concejal aux;
        for (int i = 0; i < car.coleccionDeConcejales.SizeArray(); i++) {
            aux = (Concejal) car.coleccionDeConcejales.obtenerConcejal(i);
            mostrar = mostrar + aux.getNombre();
            mostrar += " ";
            mostrar = mostrar + aux.getPartido();
            mostrar += " ";
            mostrar = mostrar + aux.getVotos();
            mostrar += "\n";
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }

    public void mostrarListaA(Cargos car) {
        String mostrar = "";
        Alcalde aux;
        for (int i = 0; i < car.coleccionDeAlcaldes.SizeArray(); i++) {
            aux = (Alcalde) car.coleccionDeAlcaldes.obtenerAlcalde(i);
            mostrar = mostrar + aux.getNombre();
            mostrar += " ";
            mostrar = mostrar + aux.getPartido();
            mostrar += " ";
            mostrar = mostrar + aux.getVotos();
            mostrar += "\n";
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }

    public void mostrarTodo(Cargos car) {
        String mostrar = "";

        Presidente aux;
        for (int i = 0; i < car.coleccionDePresidentes.SizeArray(); i++) {
            aux = (Presidente) car.coleccionDePresidentes.obtenerPresidente(i);
            mostrar = mostrar + aux.getNombre();
            mostrar += " ";
            mostrar = mostrar + aux.getPartido();
            mostrar += " ";
            mostrar = mostrar + aux.getVotos();
            mostrar += " Presidente\n";
        }

        Gore aux2;
        for (int i = 0; i < car.coleccionDeGores.SizeArray(); i++) {
            aux2 = (Gore) car.coleccionDeGores.obtenerGore(i);
            mostrar = mostrar + aux2.getNombre();
            mostrar += " ";
            mostrar = mostrar + aux2.getPartido();
            mostrar += " ";
            mostrar = mostrar + aux2.getVotos();
            mostrar += " Gore \n";
        }

        Concejal aux3;
        for (int i = 0; i < car.coleccionDeConcejales.SizeArray(); i++) {
            aux3 = (Concejal) car.coleccionDeConcejales.obtenerConcejal(i);
            mostrar = mostrar + aux3.getNombre();
            mostrar += " ";
            mostrar = mostrar + aux3.getPartido();
            mostrar += " ";
            mostrar = mostrar + aux3.getVotos();
            mostrar += " Concejal \n";
        }

        Alcalde aux4;
        for (int i = 0; i < car.coleccionDeAlcaldes.SizeArray(); i++) {
            aux4 = (Alcalde) car.coleccionDeAlcaldes.obtenerAlcalde(i);
            mostrar = mostrar + aux4.getNombre();
            mostrar += " ";
            mostrar = mostrar + aux4.getPartido();
            mostrar += " ";
            mostrar = mostrar + aux4.getVotos();
            mostrar += " Alcalde \n";
        }

        JOptionPane.showMessageDialog(null, mostrar);
    }

    public Alcalde[] obtenerArrayAlcaldes() {
        int i;
        Alcalde[] alcaldes = new Alcalde[this.coleccionDeAlcaldes.SizeArray()];
        for (i = 0; i < this.coleccionDeAlcaldes.SizeArray(); i++) {
            alcaldes[i] = this.coleccionDeAlcaldes.obtenerAlcalde(i);
        }

        return alcaldes;
    }

    public Presidente[] obtenerArrayPresidente() {
        int i;
        Presidente[] presidentesGlobal = new Presidente[this.coleccionDePresidentes.SizeArray()];
        for (i = 0; i < this.coleccionDePresidentes.SizeArray(); i++) {
            presidentesGlobal[i] = this.coleccionDePresidentes.obtenerPresidente(i);
        }

        return presidentesGlobal;
    }

    public Gore[] obtenerArrayGore() {
        int i;
        Gore[] goresGlobal = new Gore[this.coleccionDeGores.SizeArray()];
        for (i = 0; i < this.coleccionDeGores.SizeArray(); i++) {
            goresGlobal[i] = this.coleccionDeGores.obtenerGore(i);
        }

        return goresGlobal;
    }

    public Concejal[] obtenerArrayConcejal() {
        int i;
        Concejal[] consejalesGlobal = new Concejal[this.coleccionDeConcejales.SizeArray()];
        for (i = 0; i < this.coleccionDeConcejales.SizeArray(); i++) {
            consejalesGlobal[i] = this.coleccionDeConcejales.obtenerConcejal(i);
        }

        return consejalesGlobal;
    }

    public String[] retornarListadoPartidos() {
        return this.partidosPoliticos.retornarListadoPartidos();

    }

    public Persona[] retornarConjuntoDeCandidatos(String partidoPolitico) {
        return this.coleccionTotal.retornarConjuntoDeCandidatos(partidoPolitico);
    }

    public void setFormatoDeSalida(CandidatosImprimible tipo) {
        this.impresion = tipo;
    }

    public void imprimir() {
        this.impresion.imprimir(this);
    }
}
