/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidatura;

import static candidatura.Candidatura.car;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class Concejal extends Persona{
    private int cantAnos; //Cantidad de años que ha sido concejal
    private String comuna;
    
    public Concejal(int cantAnos, String comuna, String nombre, String partido, int votos) {
        super(nombre, partido, votos);
        this.cantAnos = cantAnos;
        this.comuna = comuna;
    }
    

    public Concejal() {
        super(null, null, 0);
    }
    public int getCantAnos() {
        return cantAnos;
    }

    public void setCantAnos(int cantAnos) {
        this.cantAnos = cantAnos;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    
    
   

    @Override
    public void agregar() {
        String nom=JOptionPane.showInputDialog("Ingrese el nombre del Candidato");
        String par=JOptionPane.showInputDialog("Ingrese el partido del Candidato");
        int vot=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de votos del Candidato"));
        String com=JOptionPane.showInputDialog("Ingrese cantidad de años que ha ejercido el cargo");
        int cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la comuna a la que se presenta"));
        Concejal aux = new Concejal(cant,com,nom, par, vot);
        car.agregar(aux);

        JOptionPane.showMessageDialog(null,"El nuevo Concejal se ha agregado correctamente");
    }

    @Override
    public void cantidadDeAnos(){
        JOptionPane.showMessageDialog(null,"Un Concejal esta en el poder durante 4 años , y  puede ser reelecto");
    }
    
    @Override
    public void poder(){
        JOptionPane.showMessageDialog(null,"Un concejal tiene poder en una comuna");
    }
    
}
