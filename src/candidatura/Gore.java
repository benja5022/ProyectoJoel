/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidatura;

import static candidatura.Candidatura.car;
import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class Gore extends Persona{
    private int cantCarg;
    private String region;
    
    public Gore(int cantCarg, String region, String nombre, String partido, int votos) {
        super(nombre, partido, votos);
        this.cantCarg = cantCarg;
        this.region = region;
    }

    public Gore() {
        super(null, null, 0);
    }
    
    public int getCantCarg() {
        return cantCarg;
    }

    public void setCantCarg(int cantCarg) {
        this.cantCarg = cantCarg;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    
    
    

    @Override
    public void agregar() {
        String nom=JOptionPane.showInputDialog("Ingrese el nombre del Candidato");
        String par=JOptionPane.showInputDialog("Ingrese el partido del Candidato");
        int vot=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de votos del Candidato"));
        String reg=JOptionPane.showInputDialog("Ingrese la region a la que se presenta el Candidato");
        int cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de veces en que el Candidato ha ejercido el cargo"));
        Gore aux = new Gore(cant,reg,nom, par, vot);
        car.agregarGore(aux);

        JOptionPane.showMessageDialog(null,"El nuevo Gore se ha agregado correctamente");
    }

    @Override
    public void cantidadDeAnos(){
        JOptionPane.showMessageDialog(null,"Un Gore esta en el poder durante 2 años , y puede ser reelecto las veces que sea");
    }
    @Override
    public void poder(){
        JOptionPane.showMessageDialog(null,"Un Gore tiene poder en una Region");
    }
    
}
