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
public class Car implements CanTravel {

    @Override
    public double move(double miles) {
        double check = miles;
        int i = 0;
        while (check > 0){
            check -= miles;
            i++;
        }
        double minutes = i * 0.20;
        double mph = miles/60 + minutes;
        System.out.println("Car drives: " + miles);
        return mph;
    }
    
}
