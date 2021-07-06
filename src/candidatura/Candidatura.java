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
 * @author Bastián
 */
public class Candidatura {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
         Presidente lucasCruz = new Presidente("Lucas Cruz","Derecha",2300);
         Presidente abrahamLincoln = new Presidente("Abraham Lincoln","Centro",700);
         Gore melGibson = new Gore("Mel Gibson","Derecha",1000);
         Gore troyMclure = new Gore("Troy Mclure","Centro",2000);
         Concejal johnBobi = new Concejal("John Bobi","Izquierda",2500);
         Concejal cocoLegrand = new Concejal("Coco Legrand","Derecha",500);
         Alcalde diegoPalta = new Alcalde("Diego Palta","Izquierda",2999);
         Alcalde djMendez = new Alcalde("Dj Mendez","Derecha",1);
         
        Cargos car = new Cargos();
        car.agregarPres(lucasCruz);
        car.agregarPres(abrahamLincoln);
        car.agregarGore(melGibson);
        car.agregarGore(troyMclure);
        car.agregarConc(johnBobi);
        car.agregarConc(cocoLegrand);
        car.agregarAlca(diegoPalta);
        car.agregarAlca(djMendez);
        
        
        int opcion;
        
        do{
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                "    ELIJA LA ACCION QUE DESEA REALIZAR    \n"+
                "1.-  Mostrar Lista de Presidentes\n"+
                "2.-  Mostrar Lista de Gores\n"+ 
                "3.-  Mostrar Lista de Concejales\n"+
                "4.-  Mostrar Lista de Alcaldes\n"+
                "5.-  Mostrar Presidente con mas Votos\n"+
                "6.-  Mostrar Gore con mas Votos\n"+
                "7.-  Mostrar Concejal con mas Votos\n"+
                "8.-  Mostrar Alcalde con mas Votos\n"+
                "9.-  Mostrar Todos los Candidatos\n"+
                "10.- Agregar Presidente\n"+
                "11.- Agregar Gore\n"+ 
                "12.- Agregar Concejal\n"+ 
                "13.- Agregar Alcalde\n"+         
                "14.- Salir\n"+
                "INGRESE UNA OPCION [1-14]","MENU PRINCIPAL",JOptionPane.QUESTION_MESSAGE));
        switch (opcion){
            case 1:car.mostrarListaP(car); break;
            case 2:car.mostrarListaG(car); break;
            case 3:car.mostrarListaC(car); break;
            case 4:car.mostrarListaA(car); break;
            case 5:car.mostrarPresVotos(car); break;
            case 6:car.mostrarGoreVotos(car); break;
            case 7:car.mostrarConceVotos(car); break;
            case 8:car.mostrarAlcaVotos(car);  break;
            case 9:car.mostrarTodo(car); break;
            case 10:Presidente.agregarPres(car); break;
            case 11:Gore.agregarGore(car); break;
            case 12:Concejal.agregarConc(car); break;
            case 13:Alcalde.agregarAlca(car); break;
            case 14:JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DIA");System.exit(0);break;
                    default:JOptionPane.showMessageDialog(null,"ELIJA UNA OPCION VALIDA\n","ERROR OPCION",JOptionPane.WARNING_MESSAGE);
        } 
        }while(opcion!=14);
    }
    }
        
        
    
