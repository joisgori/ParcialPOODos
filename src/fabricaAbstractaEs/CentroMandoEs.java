/* *********************************************************
 * Centro de mando de Esqueletos donde se almacenan los recursos y los arreglos de las edificaciones del usuario
 * Se encuentran definidos los recursos iniciales y los métodos getter y setter para irlos editando en pleno juego, debo dejarles un valor de almacenamiento máximo.
 * FORTALEZAS: CONSTRUCCION VELOZ DE EDIFICACIONES (1 FASE - CUALQUIER EDIF)
 * DESVENTAJAS: MILICA VULNERABLE - POCA VIDA.
 * *********************************************************/
package fabricaAbstractaEs;

import EdifEsFactory.EdificacionesEs;
import java.util.ArrayList;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public class CentroMandoEs {

    //Definición de recursos iniciales:
    private int Marmol = 750, Oro = 2500, Lava = 1000;
    //Definición del arreglo de las edificaciones:
    private ArrayList<EdificacionesEs> EdificacionesEsqueletos = new ArrayList<EdificacionesEs>();
    //Métodos getter y setter para el trato de los recursos durante el juego

    public int getMarmol() {
        return Marmol;
    }

    public int getOro() {
        return Oro;
    }

    public int getLava() {
        return Lava;
    }

    public ArrayList<EdificacionesEs> getEdificacionesEsqueletos() {
        return EdificacionesEsqueletos;
    }

    public void setMarmol(int Marmol) {
        this.Marmol = Marmol;
    }

    public void setOro(int Oro) {
        this.Oro = Oro;
    }

    public void setLava(int Lava) {
        this.Lava = Lava;
    }

    public void setEdificacionesEsqueletos(ArrayList<EdificacionesEs> EdificacionesEsqueletos) {
        this.EdificacionesEsqueletos = EdificacionesEsqueletos;
    }

}
