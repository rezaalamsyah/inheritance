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
        Scanner noe = new Scanner (System.in);
        
        //data guru
        System.out.println("======Pilihan Pelajaran yang ingin kamu ketahui======");
        System.out.println("1. Produktif R2");
        System.out.println("2. Penjaskes R2");
        System.out.println("3. Sejarah R2");
        System.out.print("Masukan pilihan");
        choice = noe.nextInt();
        
        switch (choice){
            case 1 :
                if(choice == 1);
                matpel shimme = new matpel ("Muhammad Arifin", "Produktif RPL","setiap hari");
                shimme.info();
            break;
            case 2 :
                if(choice == 2);
                matpel shimmee = new matpel ("Rofiqut Thoriq", "Pendidikan Jasmani dan Kesehatan","Rabu");
                shimmee.info();
            break;
            case 3 :
                if(choice == 3);
                matpel shimmeee = new matpel ("Ana Wahyuning", "Sejarah","Kamis");
                shimmeee.info();
            break;
            default:
                System.out.println("maaf, pilihan tidak tersedia");
                   
               
                    
        }
}
}
