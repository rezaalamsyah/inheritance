/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasPraktikum;
import java.util.Scanner;
/**
 *
 * @author santuy
 */
public class jadwalpelajaran {
    
         public static void main(String[] args) {
        int choice;
        Scanner p = new Scanner (System.in);
        
        //data guru
        System.out.println("===Pilihan Pelajaran yang Tersedia===");
        System.out.println("1. Produktif RPL");
        System.out.println("2. Bahasa Indonesia ");
        System.out.println("3. Matematika  ");
        System.out.print("Masukan pilihan Anda : ");
        choice = p.nextInt();
        
        switch (choice){
            case 1 :
                if(choice == 1);
                matpel shimme = new matpel ("Pak Arifin", "Produktif RPL","senin,selasa,rabu,kamis,jumat");
                shimme.info();
            break;
            case 2 :
                if(choice == 2);
                matpel shimmee = new matpel ("Pak Tepeng", "Bahasa Indonesia","Senin");
                shimmee.info();
            break;
            case 3 :
                if(choice == 3);
                matpel shimmeee = new matpel ("Pak Fuad", "Matematika","Senin");
                shimmeee.info();
            break;
            default:
                System.out.println("maaf, pilihan Anda illegal");
                   
               
                    
        }
}
}
