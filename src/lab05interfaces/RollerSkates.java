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
public class RollerSkates implements CanTravel {

    @Override
    public double move(double miles) {
        double check = miles;
        int i = 0;
        while (check > 0){
            check -= 3;
            i++;
        }
        double minutes = i * 0.05;
        double mph = miles/8 + minutes;
        System.out.println("Person skating: " + miles);
        return mph;
    }
    
}
