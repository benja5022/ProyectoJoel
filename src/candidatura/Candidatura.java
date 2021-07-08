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
public class Candidatura {

    /**
     * @throws java.io.IOException
     */
    public static Cargos car = new Cargos();
    
    public static void main(String[] args) throws IOException {
        Persona lucasCruz = new Presidente(1, 1, "Lucas Cruz", "Derecha", 2300);
        Persona abrahamLincoln = new Presidente(1, 1, "Abraham Lincoln", "Centro", 700);
        Persona melGibson = new Gore(1, "Valparaiso", "Mel Gibson", "Derecha", 1000);
        Persona troyMclure = new Gore(1, "Metropolitana", "Troy Mclure", "Centro", 2000);
        Persona johnBobi = new Concejal(4, "Vina del Mar", "John Bobi", "Izquierda", 2500);
        Persona cocoLegrand = new Concejal(8, "Quillota", "Coco Legrand", "Derecha", 500);
        Persona diegoPalta = new Alcalde(8, "Villa Alemana", "Diego Palta", "Izquierda", 2999);
        Persona djMendez = new Alcalde(4, "Concon", "Dj Mendez", "Derecha", 1);
        leerDatos();
        
        car.agregar((Presidente) lucasCruz);
        car.agregar((Presidente) abrahamLincoln);
        car.agregar((Gore) melGibson);
        car.agregar((Gore) troyMclure);
        car.agregar((Concejal) johnBobi);
        car.agregar((Concejal) cocoLegrand);
        car.agregar((Alcalde) diegoPalta);
        car.agregar((Alcalde) djMendez);
        
        car.setFormatoDeSalida(new FormatoPresidente());
        car.imprimir();
        System.out.println('\n');
        car.setFormatoDeSalida(new FormatoConcejal());
        car.imprimir();
        System.out.println('\n');
        car.setFormatoDeSalida(new FormatoGore());
        car.imprimir();
        System.out.println('\n');
        car.setFormatoDeSalida(new FormatoAlcaldes());
        car.imprimir();
        System.out.println('\n');
        
        car.setFormatoDeSalida(new FormatoReporteGeneral());
        car.imprimir();
        /*int opcion;
        try{
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
                    "14.-Informacion Cargo\n"+         
                    "15.- Salir\n"+
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
                case 10:{
                    Persona pres = new Presidente();
                    pres.agregar(); 
                    break;            
                }
                case 11:{
                    Persona gor = new Gore();
                    gor.agregar(); 
                    break;            
                }
                case 12:{
                    Persona con = new Concejal();
                    con.agregar(); 
                    break;            
                }
                case 13:{
                    Persona alca = new Alcalde();
                    alca.agregar(); 
                    break;            
                }
                case 14:{
                    int op;
                     op=Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Informacion\n"+
                    "1.-Presidente\n"+
                    "2.-Gore\n"+
                    "3.-Consejal\n"+
                    "4.-Alcalde\n"+
                    "INGRESE UNA OPCION [1-4]","MENU PRINCIPAL",JOptionPane.QUESTION_MESSAGE));
                    if(op==1){
                        Persona aux = new Presidente();
                        aux.cantidadDeAnos();
                        aux.poder();
                    }
                    if(op==2){
                        Persona aux = new Gore();
                        aux.cantidadDeAnos();
                        aux.poder();
                    }
                    if(op==3){
                        Persona aux = new Concejal();
                        aux.cantidadDeAnos();
                        aux.poder();
                    }
                    if(op==4){
                        Persona aux = new Alcalde();
                        aux.cantidadDeAnos();
                        aux.poder();
                    }
                    break;
                }
                case 15:JOptionPane.showMessageDialog(null,"QUE TENGA UN BUEN DIA");System.exit(0);break;
                        default:JOptionPane.showMessageDialog(null,"ELIJA UNA OPCION VALIDA\n","ERROR OPCION",JOptionPane.WARNING_MESSAGE);
            } 
            }while(opcion!=15);
        }catch(NullPointerException e){}*/
    }
    
    public static void leerDatos() throws IOException {
        String salidaArchivo = "Candidatos.csv";
        
        String cadena;
        
        try (FileReader f = new FileReader(salidaArchivo)) {
            BufferedReader b = new BufferedReader(f);
            int cont = 1;
            while ((cadena = b.readLine()) != null) {
                String[] arrOfStr = cadena.split(",");
                if (cont == 1) {
                    String substring = arrOfStr[0].substring(1);
                    arrOfStr[0] = substring;
                    cont++;
                }
                
                if (arrOfStr[0].equals("Presidente")) {
                    
                    int cant = Integer.parseInt(arrOfStr[4]);
                    int pres = Integer.parseInt(arrOfStr[5]);
                    int voto = Integer.parseInt(arrOfStr[3]);
                    Persona aux;
                    aux = new Presidente(cant, pres, arrOfStr[1], arrOfStr[2], voto);
                    car.agregar((Presidente) aux);
                    
                }
                if (arrOfStr[0].equals("Gore")) {
                    
                    int cant = Integer.parseInt(arrOfStr[4]);
                    //int pres=Integer.parseInt(arrOfStr[5]);
                    int voto = Integer.parseInt(arrOfStr[3]);
                    Persona aux;
                    aux = new Gore(cant, arrOfStr[5], arrOfStr[1], arrOfStr[2], voto);
                    car.agregar((Gore) aux);
                    
                }
                if (arrOfStr[0].equals("Concejal")) {
                    
                    int cant = Integer.parseInt(arrOfStr[4]);
                    //int pres=Integer.parseInt(arrOfStr[5]);
                    int voto = Integer.parseInt(arrOfStr[3]);
                    Persona aux;
                    aux = new Concejal(cant, arrOfStr[5], arrOfStr[1], arrOfStr[2], voto);
                    car.agregar((Concejal) aux);
                    
                }
                if (arrOfStr[0].equals("Alcalde")) {
                    
                    int cant = Integer.parseInt(arrOfStr[4]);
                    //int pres=Integer.parseInt(arrOfStr[5]);
                    int voto = Integer.parseInt(arrOfStr[3]);
                    Persona aux;
                    aux = new Alcalde(cant, arrOfStr[5], arrOfStr[1], arrOfStr[2], voto);
                    car.agregar((Alcalde) aux);
                    
                }
            }
        } catch (NullPointerException e) {
        }
    }
    
}
