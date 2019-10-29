/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author santuy
 */
public class gajah extends hewan {
    public static void testClassMethod(){
        System.out.println("The  class method in hewan...");
    }
    //mengoveride method pada class animal
public void testInstanceMethod(){
    System.out.println("The instance method in gajah...");
}
public static void main(String[]args){
    gajah myGajah = new gajah();
    hewan myHewan = myGajah;
    hewan.testClassMethod();
    myHewan.testInstanceMethod();
}
}
