/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidatura.Modelos;

import candidatura.ColeccionAnios;
import javax.swing.JOptionPane;
/**
 *
 * @author Joel
 */

public class Presidente extends Persona{

    
    private int cantPresent; // cantidad de presentaciones como candidato a la presidencia
    private int cantCarg; // Cantidad de haber ejercido el cargo de presidente
    
    public Presidente(int cantPresent, int cantCarg, String nombre, String partido, int votos) {
        super(nombre, partido, votos);
        this.cantPresent = cantPresent;
        this.cantCarg = cantCarg;
    }

    public Presidente() {
        super(null, null, 0);
    }

    public int getCantPresent() {
        return cantPresent;
    }

    public void setCantPresent(int cantPresent) {
        this.cantPresent = cantPresent;
    }

    public int getCantCarg() {
        return cantCarg;
    }

    public void setCantCarg(int cantCarg) {
        this.cantCarg = cantCarg;
    }
    
    
    

    

    
    @Override
    public void agregar(ColeccionAnios registro) { 
        
        AnosCandidatura aux1= registro.consulta(registro);
        String nom=JOptionPane.showInputDialog("Ingrese el nombre del Candidato");
        String par=JOptionPane.showInputDialog("Ingrese el partido del Candidato");
        int vot=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de votos del Candidato"));
        int present=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de veces en las que se ha presentado el Candidato"));
        int cand=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de veces en que el Candidato ha ejercido el cargo"));
        Presidente aux = new Presidente(present,cand,nom, par, vot);
        aux1.agregar(aux, aux1);
        
        JOptionPane.showMessageDialog(null,"El nuevo Presidente se ha agregado correctamente");
    }
    @Override
    public void cantidadDeAnos(){
        JOptionPane.showMessageDialog(null,"Un Presidente esta en el poder durante 4 años , y no puede ser reelecto al siguiente año");
    }
    @Override
    public void poder(){
        JOptionPane.showMessageDialog(null,"Un Presidente tiene poder en un Pais");
    }
}
