/*
 * Interfaz de edificaciones, debo mandar en el método "Generar recurso" un parámetro de Fase
 * dentro de que generar recurso verificará la fase "actual" con la "fase prevista" para su uso, hasta que no llegue a la misma
 * debería retornar un valor 0 o null y luego que llege a la misma que genere el multiplicador o la alteración del recurso con setter...
 */
package EdifGHFactory;

/**
 *
 * @author Josué González <00034715@uca.edu.sv>
 */
public interface Edificaciones {

    public void GenerarRecurso();

    public void almacenarCosas(); //Serviría para guardar recursos en un array o algo así, para guardar los vehículos, soldados, escuadrones, etc...
    //debe recibir como parámetro el objeto...

}
