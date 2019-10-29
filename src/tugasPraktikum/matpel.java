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
public class matpel extends sekolah{
    private String hari;
    public matpel(String nama, String matpel,String hari) {
        super(nama, matpel);
        this.hari = hari;
        
    }

    public void info(){
    System.out.println("hari mengajar : " + this.hari);
    super.info();
    
}
    
}