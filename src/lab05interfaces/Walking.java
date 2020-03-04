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
public class Walking implements CanTravel {

    /**
     *
     * @param miles miles traveled
     * @return the amount of time it takes to travel
     */
    @Override
    public double move(double miles) {
        double mph = miles / 5.5;
        System.out.println("Person walking: " + miles);
        return mph;
    }

}
