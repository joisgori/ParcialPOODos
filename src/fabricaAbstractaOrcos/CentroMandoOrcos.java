/* *********************************************************
 * Centro de mando de Orcos donde se almacenan los recursos y los arreglos de las edificaciones del usuario
 * Se encuentran definidos los recursos iniciales y los métodos getter y setter para irlos editando en pleno juego, debo dejarles un valor de almacenamiento máximo.
 * FORTALEZAS: ALTO NIVEL DE VIDA EN MILICA Y SOLDADO.
 * DESVENTAJAS: CONSTRUICCION LENTA DE EDIFICACIONES.
 * *********************************************************/
package fabricaAbstractaOrcos;

import EdifOFactory.EdificacionesO;
import java.util.ArrayList;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class CentroMandoOrcos {
    //Definición de recursos iniciales:
    private int Arcilla = 750, Arena = 2500, Pedernales = 1000;
    //Definición del arreglo de las edificaciones:
    private ArrayList<EdificacionesO> EdificacionesO = new ArrayList<EdificacionesO>();
    //Métodos getter y setter para el trato de los recursos durante el juego

    public int getArcilla() {
        return Arcilla;
    }

    public int getArena() {
        return Arena;
    }

    public int getPedernales() {
        return Pedernales;
    }

    public ArrayList<EdificacionesO> getEdificacionesO() {
        return EdificacionesO;
    }

    public void setArcilla(int Arcilla) {
        this.Arcilla = Arcilla;
    }

    public void setArena(int Arena) {
        this.Arena = Arena;
    }

    public void setPedernales(int Pedernales) {
        this.Pedernales = Pedernales;
    }

    public void setEdificacionesO(ArrayList<EdificacionesO> EdificacionesO) {
        this.EdificacionesO = EdificacionesO;
    }

}
