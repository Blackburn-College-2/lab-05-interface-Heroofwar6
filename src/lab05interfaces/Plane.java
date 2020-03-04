/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05interfaces;

/**
 *
 * @author krigsdator
 */
public class Plane implements CanTravel {

    @Override
    public double move(double miles) {
        double mph = miles/450 + 1;
        System.out.println("Plane flying: " + miles);
        return mph;
    }
    
}
