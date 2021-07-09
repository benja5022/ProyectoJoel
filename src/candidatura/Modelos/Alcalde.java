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

public class Alcalde extends Persona{
    private  int cantAnos; //Cantidad de años que ha sido alcalde
    private  String comuna;
    
    public Alcalde(int cantAnos, String comuna, String nombre, String partido, int votos) {
        super(nombre, partido, votos);
        this.cantAnos = cantAnos;
        this.comuna = comuna;
    }

    public Alcalde() {
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
    public void agregar(ColeccionAnios registro) {
        
        AnosCandidatura aux1= registro.consulta(registro);
        String nom=JOptionPane.showInputDialog("Ingrese el nombre del Candidato");
        String par=JOptionPane.showInputDialog("Ingrese el partido del Candidato");
        int vot=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de votos del Candidato"));
        String com=JOptionPane.showInputDialog("Ingrese la comuna a la que se presenta");
        int cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de años que ha ejercido el cargo"));
        Alcalde aux = new Alcalde(cant,com,nom, par, vot);
        aux1.agregar(aux, aux1);

        JOptionPane.showMessageDialog(null,"El nuevo Alcalde se ha agregado correctamente");
    }

    @Override
     public void cantidadDeAnos(){
        JOptionPane.showMessageDialog(null,"Un alcalde esta en el poder durante 4 años , y puede ser reelecto las veces que sea");
     }
     
    @Override
    public void poder(){
        JOptionPane.showMessageDialog(null,"Un alcalde tiene poder en una comuna");
    }
}
