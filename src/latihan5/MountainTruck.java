/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5;

/**
 *
 * @author santuy
 */
public class MountainTruck extends Truck{
    //the Mountaintruck subclass adds one field
    public int seatHeight;
    // //the Mountaintruck subclass adds one consturctor
    public MountainTruck(int startHeight, int startCadence, int startSpeed ,int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }
    // //the Mountaintruck subclass adds one method
    public void setHeight (int newValue){
        seatHeight = newValue;
    }
    public static void main (String []args){
        System.out.println("mulai berjalan");
        MountainTruck MB = new MountainTruck (0,0,0,0);
        System.out.println("gear = "+MB.gear);
        System.out.println("speed = "+MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("gear = "+MB.gear);
        System.out.println("speed = "+MB.speed);
        MB.speedUp(2);
        System.out.println("gear = "+MB.gear);
        System.out.println("speed = "+MB.speed);
    }
}
