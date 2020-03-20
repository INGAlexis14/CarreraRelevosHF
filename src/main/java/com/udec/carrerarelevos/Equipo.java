package com.udec.carrerarelevos;

/**
 *
 * @author Alexis Gonzalez
 */
public class Equipo {
    /*
    * inicializacion de variables donde se va guardar cada
       posición y el nombre de cada equipo.
    */
    private String nombreEquipo;
    private int posicion1;
    private int posicion2;
    private int posicion3;  

    public Equipo() {
    }
    /*
    * constructtor de el equipo donde se incicializa la 
      posición de cada jugador.
    */
        
    public Equipo(String nombreEqui) {
        this.nombreEquipo = nombreEqui;
        this.posicion1=0;
        this.posicion2=30;
        this.posicion3=60;
    }
    /*
    * creación de getters y setters de cada variable.
    */
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getPosicion1() {
        return posicion1;
    }

    public void setPosicion1(int posicion1) {
        this.posicion1 = posicion1;
    }

    public int getPosicion2() {
        return posicion2;
    }

    public void setPosicion2(int posicion2) {
        this.posicion2 = posicion2;
    }

    public int getPosicion3() {
        return posicion3;
    }

    public void setPosicion3(int posicion3) {
        this.posicion3 = posicion3;
    }


    /*
    *metodo tipo synchronized String donde se imprimen los puestos
     por color.
    */
    public synchronized String imprimirPuesto(){
        String puesto="";  
        int contador=0;
        puesto = "Equipo : " + nombreEquipo;  
        
        for (int i = 0; i <= 100; i++) {
            if (i == posicion1) {
                puesto += "\033[34m o-o";
                 
            } else if (i == posicion2) {
                puesto += "\033[32m Q-Q";
            } else if (i == posicion3) {
                puesto += "\033[31m *-*";
            } else {
                puesto += "_\033[30m";
            }
           
           
          //  Runtime.getRuntime().exec("cls");
        } 
        System.out.println(".");
        return puesto;
       
    }
       
}
