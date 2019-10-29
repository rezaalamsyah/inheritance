/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasPraktikum;

/**
 *
 * @author santuy
 */
public class sekolah {
    private String nama;
    private String matpel;
   
   
    public sekolah (String nama, String matpel){
        this.nama = nama;
        this.matpel = matpel;

       
    }
    public void info(){
        System.out.println("Nama : "+this.nama);
        System.out.println("Mapel: "+this.matpel);

    }
}
