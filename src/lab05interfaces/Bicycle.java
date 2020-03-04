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
public class Bicycle implements CanTravel {

    /**
     *
     * @param miles miles traveled
     * @return the amount of time it takes to travel
     */
    @Override
    public double move(double miles) {
        int chance = (int) ((Math.random() * 100) + 1);
        double mph = 0;
        if (chance != 1) {
            System.out.println("Person biking: " + miles);
            mph = miles / 15;
        } else if (chance == 1) {
            System.out.println("Tire flat \n Person walking: " + miles);
            mph = miles / 5.5;
        }
        return mph;
    }

}
