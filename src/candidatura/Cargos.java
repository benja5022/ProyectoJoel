/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidatura;

import java.util.ArrayList;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Bastián
 */
public class Cargos {
    private ArrayList<Presidente> presidentes;
    private ArrayList<Gore> gores;
    private ArrayList<Concejal> concejales;
    private ArrayList<Alcalde> alcaldes;
    private HashMap candidatos;
    
    public Cargos() {
        presidentes = new ArrayList<>();
        gores = new ArrayList<>();
        concejales = new ArrayList<>();
        alcaldes = new ArrayList<>();
        candidatos = new HashMap();
    }

    public ArrayList<Presidente> getPresidentes() {
        return presidentes;
    }

    public void setPresidentes(ArrayList<Presidente> presidentes) {
        this.presidentes = presidentes;
    }

    public ArrayList<Gore> getGores() {
        return gores;
    }

    public void setGores(ArrayList<Gore> gores) {
        this.gores = gores;
    }

    public ArrayList<Concejal> getConcejales() {
        return concejales;
    }

    public void setConcejales(ArrayList<Concejal> concejales) {
        this.concejales = concejales;
    }

    public ArrayList<Alcalde> getAlcaldes() {
        return alcaldes;
    }

    public void setAlcaldes(ArrayList<Alcalde> alcaldes) {
        this.alcaldes = alcaldes;
    }
    
    public HashMap getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(HashMap candidatos) {
        this.candidatos = candidatos;
    }
    
    public boolean agregarPres(Presidente presidente){
        String aux = presidente.getNombre();
        candidatos.put(aux,presidente);
        return presidentes.add(presidente);
    }
    
    public boolean agregarGore(Gore gore){
        String aux = gore.getNombre();
        candidatos.put(aux,gore);
        return gores.add(gore);
    }
    
    public boolean agregarConc(Concejal concejal){
        String aux = concejal.getNombre();
        candidatos.put(aux,concejal);
        return concejales.add(concejal);
    }
    
    public boolean agregarAlca(Alcalde alcalde){
        String aux = alcalde.getNombre();
        candidatos.put(aux,alcalde);
        return alcaldes.add(alcalde);
    }
    
    public void mostrarP()throws IOException{ 
        BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Ingrese el nombre del presidente del cual desea la informacion");
        String aux;
        aux = read.readLine();
        Presidente presidentito = (Presidente) candidatos.get(aux);
        infoCargo(presidentito);
    }

    public void mostrarG()throws IOException{ 
        BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Ingrese el nombre del gore del cual desea la informacion");
        String aux;
        aux = read.readLine();
        Gore gorito = (Gore) candidatos.get(aux);
        infoCargo(gorito);
    }

    public void mostrarC()throws IOException{ 
        BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Ingrese el nombre del concejal del cual desea la informacion");
        String aux;
        aux = read.readLine();
        Concejal concejito = (Concejal) candidatos.get(aux);
        infoCargo(concejito);
    }

    public void mostrarA()throws IOException{ 
        BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Ingrese el nombre del alcalde del cual desea la informacion");
        String aux;
        aux = read.readLine();
        Alcalde alcaldito = (Alcalde) candidatos.get(aux);
        infoCargo(alcaldito);
    }
    
    public void mostrarPresVotos(Cargos car){
        Presidente aux;
        Presidente aux2 = new Presidente("aux2","aux2",0);
        for(int i = 0 ; i < car.presidentes.size() ; i++){
            aux = car.presidentes.get(i);
            if(aux.getVotos() > aux2.getVotos()){
                aux2 = aux;
            }
        }
        JOptionPane.showMessageDialog(null,aux2.getNombre());
    }
    
    public void mostrarGoreVotos(Cargos car){
        Gore aux;
        Gore aux2 = new Gore("aux2","aux2",0);
        for(int i = 0 ; i < car.gores.size() ; i++){
            aux = car.gores.get(i);
            if(aux.getVotos() > aux2.getVotos()){
                aux2 = aux;
            }
        }
        JOptionPane.showMessageDialog(null,aux2.getNombre());
    }

    public void mostrarConceVotos(Cargos car){
        Concejal aux;
        Concejal aux2 = new Concejal("aux2","aux2",0);
        for(int i = 0 ; i < car.concejales.size() ; i++){
            aux = car.concejales.get(i);
            if(aux.getVotos() > aux2.getVotos()){
                aux2 = aux;
            }
        }
        JOptionPane.showMessageDialog(null,aux2.getNombre());
    }       

    public void mostrarAlcaVotos(Cargos car){
        Alcalde aux;
        Alcalde aux2 = new Alcalde("aux2","aux2",0);
        for(int i = 0 ; i < car.alcaldes.size() ; i++){
            aux = car.alcaldes.get(i);
            if(aux.getVotos() > aux2.getVotos()){
                aux2 = aux;
            }
        }
        JOptionPane.showMessageDialog(null,aux2.getNombre());
    }
        
    public void infoCargo(Presidente presi){
        System.out.println(presi.getNombre());
        System.out.println(presi.getPartido());
        System.out.println(presi.getVotos());
    }

    public void infoCargo(Gore blood){
        System.out.println(blood.getNombre());
        System.out.println(blood.getPartido());
        System.out.println(blood.getVotos());
    }

    public void infoCargo(Concejal conce){
        System.out.println(conce.getNombre());
        System.out.println(conce.getPartido());
        System.out.println(conce.getVotos());
    }

    public void infoCargo(Alcalde alca){
        System.out.println(alca.getNombre());
        System.out.println(alca.getPartido());
        System.out.println(alca.getVotos());
    }
    
    public void mostrarListaP(Cargos car){
        String mostrar = "";
        Presidente aux;
        for(int i = 0 ; i < car.presidentes.size() ; i++){
            aux = car.presidentes.get(i);
            mostrar = mostrar + aux.getNombre();
            mostrar += " ";
            mostrar = mostrar + aux.getPartido();
            mostrar += " ";
            mostrar = mostrar + aux.getVotos();
            mostrar += "\n";
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }
    
    public void mostrarListaG(Cargos car){
        String mostrar = "";
        Gore aux;
        for(int i = 0 ; i < car.gores.size() ; i++){
            aux = car.gores.get(i);
            mostrar = mostrar + aux.getNombre();
            mostrar += " ";
            mostrar = mostrar + aux.getPartido();
            mostrar += " ";
            mostrar = mostrar + aux.getVotos();
            mostrar += "\n";
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }
    
    public void mostrarListaC(Cargos car){
        String mostrar = "";
        Concejal aux;
        for(int i = 0 ; i < car.concejales.size() ; i++){
            aux = car.concejales.get(i);
            mostrar = mostrar + aux.getNombre();
            mostrar += " ";
            mostrar = mostrar + aux.getPartido();
            mostrar += " ";
            mostrar = mostrar + aux.getVotos();
            mostrar += "\n";
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }
    
    public void mostrarListaA(Cargos car){
        String mostrar = "";
        Alcalde aux;
        for(int i = 0 ; i < car.alcaldes.size() ; i++){
            aux = car.alcaldes.get(i);
            mostrar = mostrar + aux.getNombre();
            mostrar += " ";
            mostrar = mostrar + aux.getPartido();
            mostrar += " ";
            mostrar = mostrar + aux.getVotos();
            mostrar += "\n";
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }
    
    public void mostrarTodo(Cargos car){
    String mostrar = "";
    
        Presidente aux;
        for(int i = 0 ; i < car.presidentes.size() ; i++){
            aux = car.presidentes.get(i);
            mostrar = mostrar + aux.getNombre();
            mostrar += " ";
            mostrar = mostrar + aux.getPartido();
            mostrar += " ";
            mostrar = mostrar + aux.getVotos();
            mostrar += " Presidente\n";
        }
        
        Gore aux2;
        for(int i = 0 ; i < car.gores.size() ; i++){
            aux2 = car.gores.get(i);
            mostrar = mostrar + aux2.getNombre();
            mostrar += " ";
            mostrar = mostrar + aux2.getPartido();
            mostrar += " ";
            mostrar = mostrar + aux2.getVotos();
            mostrar += " Gore \n";
        }
        
         Concejal aux3;
        for(int i = 0 ; i < car.concejales.size() ; i++){
            aux3 = car.concejales.get(i);
            mostrar = mostrar + aux3.getNombre();
            mostrar += " ";
            mostrar = mostrar + aux3.getPartido();
            mostrar += " ";
            mostrar = mostrar + aux3.getVotos();
            mostrar += " Concejal \n";
        }
        
        Alcalde aux4;
        for(int i = 0 ; i < car.alcaldes.size() ; i++){
            aux4 = car.alcaldes.get(i);
            mostrar = mostrar + aux4.getNombre();
            mostrar += " ";
            mostrar = mostrar + aux4.getPartido();
            mostrar += " ";
            mostrar = mostrar + aux4.getVotos();
            mostrar += " Alcalde \n";
        }
        
        JOptionPane.showMessageDialog(null, mostrar);        
    }
}

