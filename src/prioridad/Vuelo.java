/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prioridad;

/**
 *
 * @author usuario
 */
public class Vuelo {

    private String Aerolinea;
    private int numVuelo;
   private int prioridad;

    public Vuelo(String Aerolinea, int numVuelo, int prioridad) {
        this.Aerolinea = Aerolinea;
        this.numVuelo = numVuelo;
        this.prioridad = prioridad;
    }

    public String getAerolinea() {
        return Aerolinea;
    }

    public int getNumVuelo() {
        return numVuelo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public String toString(){
    return "Vuelo: " + numVuelo + " Aerolínea " + Aerolinea + " Priorodad " + prioridad;
    }


}
