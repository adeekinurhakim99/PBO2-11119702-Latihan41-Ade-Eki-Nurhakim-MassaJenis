/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massajenis;

/**
 *
 * @author Ekiw
 */
public class Main {
    public static void main(String[] args) {
    Massa ma = new Massa();
    ma.setSisi(5);
    ma.setMassa(250);
        System.out.println("================Massa Jenis Kubus==============");
        System.out.println("Sisi : "+ma.getSisi());
        System.out.println("Massa : "+ma.getMassa());
        
        System.out.println("================Hasil Perhitungan==============");
        System.out.println("Volume :"+ma.hitungVolume());
        System.out.println("Volume :"+ma.hitungMassaJenis());
    
    
}
    
}
