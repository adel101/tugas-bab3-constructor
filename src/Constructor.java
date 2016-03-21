/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author Adel Syafrizal P
 */
public class Constructor {

    public static void main(String[] args) {
        Karyawan save = new Karyawan();

        save.Data();
        save.Data(109);
        save.Data("Gaji Pokok", 1500);
        save.Data("Tunjangan", ">=", 1000);
        save.Data("Denda", ">", 200);
        System.out.println("");
        System.out.println("\t\t\t\t TERIMA KASIH ");
    }
    
}
