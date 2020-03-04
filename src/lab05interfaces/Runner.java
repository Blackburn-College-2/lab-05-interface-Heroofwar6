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
public class Runner {
    public static int hours(double time){
        return (int)Math.floor(time);
    }
    public static int minutes(double time){
        int hours = (int)Math.floor(time);
        time = time - hours;
        int minutes = (int)(60*time);
        return minutes;
    }
    public static void roundTrip(CanTravel travel, double distance){
        System.out.println("Round Trip!");
        System.out.println("Leaving...");
        double time = travel.move(distance);
        int hours = hours(time);
        int minutes = minutes(time);
        String h = "";
        if(hours > 1){
            h = "hours";
        }else{
            h = "hour";
        }
        String m = "";
        if(minutes > 1){
            m = "minutes";
        }else{
            m = "minute";
        }
        System.out.println("It takes: " + hours + " " + h 
                + " and " + minutes + " " + m + ".");
        System.out.println("Returning...");
        double rtime = travel.move(distance);
        int rhour = hours(rtime);
        int rminute = minutes(rtime);
        h = "";
        if(rhour > 1){
            h = "hours";
        }else{
            h = "hour";
        }
        m = "";
        if(rminute > 1){
            m = "minutes";
        }else{
            m = "minute";
        }
        System.out.println("It takes: " + hours + " " + h 
                + " and " + minutes + " " + m + ".");
        int fhour = rhour + hours;
        int fminute = rminute + minutes;
        System.out.println("It takes: " + fhour + " hours "
                + " and " + fminute + " minutes. \n");
    }
    public static void main(String[] args){
        Walking walk = new Walking();
        Bicycle bike = new Bicycle();
        Plane plane = new Plane();
        Train train = new Train();
        Car car = new Car();
        RollerSkates rS = new RollerSkates();
        SideJump sJ = new SideJump();
        roundTrip(walk, 1000.0);
        roundTrip(bike, 1000.0);
        roundTrip(plane, 1000.0);
        roundTrip(train, 1000.0);
        roundTrip(car, 1000.0);
        roundTrip(rS, 1000.0);
        roundTrip(sJ, 1000.0);
        
    }
}
