/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidatura;

import candidatura.Modelos.*;
import candidatura.Modelos.AnosCandidatura;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */

public class Candidatura {
    //private ColeccionAnios coleccionDeAnios;
        ColeccionAnios registro= new ColeccionAnios();
        AnosCandidatura primero= new AnosCandidatura(2020);

    public static void main(String[] args) throws IOException {
        //Menu de opciones implementado con JOptionPane
        ColeccionAnios registro= new ColeccionAnios();
        AnosCandidatura primero= new AnosCandidatura(2020);
        AnosCandidatura cero= new AnosCandidatura(2016);
        registro.leerData(cero);
        registro.rellenarHard(primero);
        int opcion;
        int anoConsulta;
        AnosCandidatura aux;
        
        registro.imprimirReporteAnidado();
        try{
            do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "    ELIJA LA ACCION QUE DESEA REALIZAR    \n"+
                    "0.-  Mostrar los años disponibles para consultar\n"+
                    "1.-  Mostrar Lista de Presidentes por año\n"+
                    "2.-  Mostrar Lista de Gores por año\n"+ 
                    "3.-  Mostrar Lista de Concejales por año\n"+
                    "4.-  Mostrar Lista de Alcaldes por año\n"+
                    "5.-  Mostrar Presidente con mas Votos por año\n"+
                    "6.-  Mostrar Gore con mas Votos por año\n"+
                    "7.-  Mostrar Concejal con mas Votos por año\n"+
                    "8.-  Mostrar Alcalde con mas Votos por año\n"+
                    "9.-  Mostrar Todos los Candidatos por año\n"+
                    "10.- Agregar Presidente\n"+
                    "11.- Agregar Gore\n"+ 
                    "12.- Agregar Concejal\n"+ 
                    "13.- Agregar Alcalde\n"+
                    "14.- Informacion Cargo\n"+ 
                    "15.- Generar Reporte General"+ //Considera todos los años e imprime información superficial    
                    "18.- Salir\n"+
                    "INGRESE UNA OPCION [0-18]","MENU PRINCIPAL",JOptionPane.QUESTION_MESSAGE));
            switch (opcion){
                //Las opciones de 1 a X interactúan con el usuario mediante JOption
                case 0:{
                        registro.mostrarAnios(registro);
                        break;
                }
                case 1:{             
                        aux= registro.consulta(registro);
                        aux.mostrarListaP(aux); //Imprime lista Presidentes
                        break;
                }                    
                case 2:{
                        aux= registro.consulta(registro);
                        aux.mostrarListaG(aux);//Imprime lista GORES
                        break;
                }        
                case 3:{
                        aux= registro.consulta(registro);
                        aux.mostrarListaC(aux);//Imprime lista Concejales
                        break;
                }
                case 4:{
                        aux= registro.consulta(registro);
                        aux.mostrarListaA(aux);
                        break;//Imprime lista Alcaldes
                }  
                case 5:{
                        aux= registro.consulta(registro);
                        aux.mostrarPresVotos(aux); 
                        break; //Muestra al Presidente con mas votos
                }        
                case 6:{               
                        aux= registro.consulta(registro);
                        aux.mostrarGoreVotos(aux); 
                        break; //Muestra al GORE con mas votos
                }        
                case 7:{
                        aux= registro.consulta(registro);
                        aux.mostrarConceVotos(aux); 
                        break;//Muestra al Concejal con mas votos 
                }
                case 8:{
                        aux= registro.consulta(registro);
                        aux.mostrarAlcaVotos(aux);  
                        break;//Muestra al Alcalde con mas votos 
                }
                
               // case 9:car.mostrarTodo(car); break; //Imprime toda la info guardada en el programa por JOption
                case 10:{ //Agrega a 1 Presidente
                    Persona pres = new Presidente();
                    pres.agregar(registro); 
                    break;            
                }
                case 11:{ //Agrega a 1 GORE
                    Persona gor = new Gore();
                    gor.agregar(registro); 
                    break;            
                }
                case 12:{ //Agrega a 1 Concejal
                    Persona con = new Concejal();
                    con.agregar(registro); 
                    break;            
                }
                case 13:{ //Agrega a 1 Alcalde
                    Persona alca = new Alcalde();
                    alca.agregar(registro); 
                    break;            
                }
                case 14:{ //Informacion especifica de cada cargo, esta corresponde a la interfaz "Informacion"
                    int op;
                     op=Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Informacion\n"+
                    "1.-Presidente\n"+
                    "2.-Gore\n"+
                    "3.-Consejal\n"+
                    "4.-Alcalde\n"+
                    "INGRESE UNA OPCION [1-4]","MENU PRINCIPAL",JOptionPane.QUESTION_MESSAGE));
                    if(op==1){ //Info Presidente
                        Persona aux2 = new Presidente();
                        aux2.cantidadDeAnos();
                        aux2.poder();
                    }
                    if(op==2){ //Info GORE 
                        Persona aux2 = new Gore();
                        aux2.cantidadDeAnos();
                        aux2.poder();
                    }
                    if(op==3){ //Info Concejal
                        Persona aux2 = new Concejal();
                        aux2.cantidadDeAnos();
                        aux2.poder();
                    }
                    if(op==4){ //Info Alcalde
                        Persona aux2 = new Alcalde();
                        aux2.cantidadDeAnos();
                        aux2.poder();
                    }
                    break;
                }
                /*case 15:{
                    registro.reporteAnidado(registro);
                }*/
                //Opcion de salida + mensaje
                case 18:JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DIA");System.exit(0);break;
                        default:JOptionPane.showMessageDialog(null,"ELIJA UNA OPCION VALIDA\n","ERROR OPCION",JOptionPane.WARNING_MESSAGE);
            } 
            }while(opcion!=15);
        }catch(NullPointerException e){}
    }
}
    
