/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehEsFactory;

/**
 *
 * @author Josué González <0003471@uca.edu.sv>
 */
public class DragonesEsqueletos implements VehiculosEs {

    private int Salud = 200; //creo que no debería ser abstract y se deberá implementar así, a dif de atacar...
    private String nombre;

    public int getSalud() {
        return Salud;
    }

    public void setSalud(int Salud) {
        this.Salud = Salud;
    }
    

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void danio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
