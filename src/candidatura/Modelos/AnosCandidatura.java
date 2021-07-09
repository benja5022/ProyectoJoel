/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidatura.Modelos;

import candidatura.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */

public class AnosCandidatura {

    private Cargos car;
    private int anio;

    public AnosCandidatura(int anio) {
        this.car = new Cargos();
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void rellenar0(AnosCandidatura ola) throws IOException {

        Persona lucasCruz = new Presidente(1, 1, "Lucas Cruz", "Derecha", 2300);
        Persona abrahamLincoln = new Presidente(1, 1, "Abraham Lincoln", "Centro", 700);
        Persona melGibson = new Gore(1, "Valparaiso", "Mel Gibson", "Derecha", 1000);
        Persona troyMclure = new Gore(1, "Metropolitana", "Troy Mclure", "Centro", 2000);
        Persona johnBobi = new Concejal(4, "Vina del Mar", "John Bobi", "Izquierda", 2500);
        Persona cocoLegrand = new Concejal(8, "Quillota", "Coco Legrand", "Derecha", 500);
        Persona diegoPalta = new Alcalde(8, "Villa Alemana", "Diego Palta", "Izquierda", 2999);
        Persona djMendez = new Alcalde(4, "Concon", "Dj Mendez", "Derecha", 1);
        //Lectura automática de datos desde excel 

        //Datos hardcodeados de prueba
        ola.car.agregar((Presidente) lucasCruz);
        ola.car.agregar((Presidente) abrahamLincoln);
        ola.car.agregar((Gore) melGibson);
        ola.car.agregar((Gore) troyMclure);
        ola.car.agregar((Concejal) johnBobi);
        ola.car.agregar((Concejal) cocoLegrand);
        ola.car.agregar((Alcalde) diegoPalta);
        ola.car.agregar((Alcalde) djMendez);

        /*
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
         */
    }

    //Funciones para reporte
    public void fullReportes(AnosCandidatura anoReporte) {
        car.setFormatoDeSalida(new FormatoReporteGeneral());
        car.imprimir(anoReporte.getAnio());

        /* car.setFormatoDeSalida(new FormatoPartidosPoliticos());
        car.imprimir();*/
        car.setFormatoDeSalida(new FormatoPresidente());
        car.imprimir(anoReporte.getAnio());

        System.out.println('\n');

        car.setFormatoDeSalida(new FormatoConcejal());
        car.imprimir(anoReporte.getAnio());

        System.out.println('\n');

        car.setFormatoDeSalida(new FormatoGore());
        car.imprimir(anoReporte.getAnio());

        System.out.println('\n');

        car.setFormatoDeSalida(new FormatoAlcaldes());
        car.imprimir(anoReporte.getAnio());

        System.out.println('\n');

    }    //

    public void mostrarListaP(AnosCandidatura ola) {
        String mostrar = "En el año " + ola.anio + " participaron los siguientes presidentes";
        JOptionPane.showMessageDialog(null, mostrar);
        ola.car.mostrarListaP(ola.car);
    }

    public void mostrarListaG(AnosCandidatura ola) {
        String mostrar = "En el año " + ola.anio + " participaron los siguientes GORES";
        JOptionPane.showMessageDialog(null, mostrar);
        ola.car.mostrarListaG(ola.car);
    }

    public void mostrarListaA(AnosCandidatura ola) {
        String mostrar = "En el año " + ola.anio + " participaron los siguientes Alcaldes";
        JOptionPane.showMessageDialog(null, mostrar);
        ola.car.mostrarListaA(ola.car);
    }

    public void mostrarListaC(AnosCandidatura ola) {
        String mostrar = "En el año " + ola.anio + " participaron los siguientes Concejales";
        JOptionPane.showMessageDialog(null, mostrar);
        ola.car.mostrarListaC(ola.car);
    }

    public void mostrarPresVotos(AnosCandidatura ola) {
        String mostrar = "En el año " + ola.anio + " la persona con más votos a la Presidencia fue";
        JOptionPane.showMessageDialog(null, mostrar);
        ola.car.mostrarPresVotos(ola.car);
    }

    public void mostrarAlcaVotos(AnosCandidatura ola) {
        String mostrar = "En el año " + ola.anio + " la persona con más votos a la Alcaldía fue";
        JOptionPane.showMessageDialog(null, mostrar);
        ola.car.mostrarAlcaVotos(ola.car);
    }

    public void mostrarGoreVotos(AnosCandidatura ola) {
        String mostrar = "En el año " + ola.anio + " la persona con más votos a GORE fue";
        JOptionPane.showMessageDialog(null, mostrar);
        ola.car.mostrarGoreVotos(ola.car);
    }

    public void mostrarConceVotos(AnosCandidatura ola) {
        String mostrar = "En el año " + ola.anio + " la persona con más votos a Concejal fue";
        JOptionPane.showMessageDialog(null, mostrar);
        ola.car.mostrarConceVotos(ola.car);
    }

    public void agregar(Presidente p, AnosCandidatura nc) {
        nc.car.agregar(p);

    }

    public void agregar(Alcalde a, AnosCandidatura nc) {
        nc.car.agregar(a);
    }

    public void agregar(Gore g, AnosCandidatura nc) {
        nc.car.agregar(g);
    }

    public void agregar(Concejal c, AnosCandidatura nc) {
        nc.car.agregar(c);
    }

    //Funcion que importa datos desde un archivo excel
    public static void leerDatos(AnosCandidatura ola) throws IOException {
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
                    ola.car.agregar((Presidente) aux);

                }
                if (arrOfStr[0].equals("Gore")) {

                    int cant = Integer.parseInt(arrOfStr[4]);
                    //int pres=Integer.parseInt(arrOfStr[5]);
                    int voto = Integer.parseInt(arrOfStr[3]);
                    Persona aux;
                    aux = new Gore(cant, arrOfStr[5], arrOfStr[1], arrOfStr[2], voto);
                    ola.car.agregar((Gore) aux);

                }
                if (arrOfStr[0].equals("Concejal")) {

                    int cant = Integer.parseInt(arrOfStr[4]);
                    //int pres=Integer.parseInt(arrOfStr[5]);
                    int voto = Integer.parseInt(arrOfStr[3]);
                    Persona aux;
                    aux = new Concejal(cant, arrOfStr[5], arrOfStr[1], arrOfStr[2], voto);
                    ola.car.agregar((Concejal) aux);

                }
                if (arrOfStr[0].equals("Alcalde")) {

                    int cant = Integer.parseInt(arrOfStr[4]);
                    //int pres=Integer.parseInt(arrOfStr[5]);
                    int voto = Integer.parseInt(arrOfStr[3]);
                    Persona aux;
                    aux = new Alcalde(cant, arrOfStr[5], arrOfStr[1], arrOfStr[2], voto);
                    ola.car.agregar((Alcalde) aux);

                }
            }
        } catch (NullPointerException e) {
        }
    }

    public void imprimir(int anio,int tipo){
        switch(tipo){
            case 0:
                this.car.setFormatoDeSalida(new FormatoAlcaldes());
                break;
            case 1:
                this.car.setFormatoDeSalida(new FormatoPresidente());
                break;
            case 2:
                this.car.setFormatoDeSalida(new FormatoConcejal());
                break;
            case 3:
                this.car.setFormatoDeSalida(new FormatoGore());
                break;
            case 4:
                this.car.setFormatoDeSalida(new FormatoReporteGeneral());
                break;
        }
        this.car.imprimir(tipo,anio);
    }
    
    public void imprimir(int tipo){
        switch(tipo){
            case 0:
                this.car.setFormatoDeSalida(new FormatoAlcaldes());
                break;
            case 1:
                this.car.setFormatoDeSalida(new FormatoPresidente());
                break;
            case 2:
                this.car.setFormatoDeSalida(new FormatoConcejal());
                break;
            case 3:
                this.car.setFormatoDeSalida(new FormatoGore());
                break;
            case 4:
                this.car.setFormatoDeSalida(new FormatoReporteGeneral());
                break;
        }
        this.car.imprimir(tipo);
    }

}
