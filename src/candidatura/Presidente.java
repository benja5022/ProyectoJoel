/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidatura;

import javax.swing.JOptionPane;
/**
 *
 * @author Bastián
 */

public class Presidente {
    private String nombre; 
    private String partido;
    private int votos;
    private int cantidad = 0;

    public Presidente(String nombre, String partido, int votos) {
        this.nombre = nombre;
        this.partido = partido;
        this.votos = votos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
    
    public void aumentarVotos(int aux){
        votos = votos + aux;
    }
    public void aumentarVotos(){
        System.out.println("votos correctamente aumentados");
    }
    
    public static void agregarPres(Cargos car){
    String nom=JOptionPane.showInputDialog("Ingrese el nombre del Candidato");
    String par=JOptionPane.showInputDialog("Ingrese el partido del Candidato");
    int vot=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de votos del Candidato"));
    Presidente aux = new Presidente(nom, par, vot);
    car.agregarPres(aux);
    
    JOptionPane.showMessageDialog(null,"El nuevo Presidente se ha agregado correctamente");
    }
}
