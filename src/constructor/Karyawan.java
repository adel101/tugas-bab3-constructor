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
public class Karyawan {

    private String[] Nama = {"Paijo", "Lala", "Lulu", "Sabar", "Sule", "Paiman", "Ponimin", "Sutiman", "Raja", "Paijo"};

    private int[][] Datagaji = {
        {101, 2000, 1000, 500, 200},
        {102, 1750, 900, 500, 200},
        {103, 2150, 1000, 300, 375},
        {104, 1500, 750, 600, 200},
        {105, 2500, 850, 500, 300},
        {106, 1500, 350, 450, 250},
        {107, 2000, 1000, 500, 200},
        {108, 1500, 1250, 500, 300},
        {109, 1000, 1000, 500, 200},
        {110, 2250, 1000, 200, 200}
    };

    public void Data() {
        System.out.println("\tData Karyawan");
        System.out.println("");
        System.out.printf("%s %9s %17s %15s %12s %15s \n",
                "Nik", "Nama", "Gaji Pokok", "Tunjangan", "Bonus", "Denda");

        {

            for (int a = 0; a < Nama.length; a++) {
                System.out.print(Datagaji[a][0] + "\t");
                System.out.print(Nama[a] + "\t\t");

                for (int s = 1; s < 5; s++) {
                    System.out.print(Datagaji[a][s] + "\t\t");
                }
                System.out.println();
            }
            System.out.println("\n");
        }
        
    

    public void Data(int Nik) {
        System.out.println("=================");
        System.out.println("\t Data Karyawan");
        for (int a = 0; a < Nama.length; a++) {
            if (Nik == Datagaji[a][0]) {
                System.out.println("Nik\t\t              : " + Datagaji[a][0]);
                System.out.println("Nama\t\t             : " + Nama[a]);
                System.out.println("Gaji Pokok\t         : " + Datagaji[a][1]);
                System.out.println("Tunjangan\t          : " + Datagaji[a][2]);
                System.out.println("Bonus\t\t            : " + Datagaji[a][3]);
                System.out.println("Denda\t\t            : " + Datagaji[a][4]);
            }
        }
    }

    public void Data(String Nama, int nilai) {
        System.out.println("");
        System.out.println("=================");
        System.out.println("\t Data Karyawan Gaji");
        System.out.printf("%s %9s %17s %15s %12s %15s \n", "Nik", "Nama", "Gaji Pokok", "Tunjangan", "Bonus", "Denda");

        int p = 0;
        if ("Gaji Pokok".equalsIgnoreCase(Nama)) {
            p = 1;
        } else if ("Tunjangan".equalsIgnoreCase(Nama)) {
            p = 2;
        } else if ("Bonus".equalsIgnoreCase(Nama)) {
            p = 3;
        } else if ("Denda".equalsIgnoreCase(Nama)) {
            p = 4;
        }
        for (int a = 0; a < Nama.length; a++) {
            if (nilai == Datagaji[a][p]) {
                System.out.print(Datagaji[a][0] + "\t");
                System.out.print(Nama[a] + "\t\t");
                for (int s = 1; s < 5; s++) {
                    System.out.print(Datagaji[a][s] + "\t\t");
                }
                System.out.println();
            }
        }

    }

    public void Data(String Nama, String operator, int nilai) {
        System.out.println();
        System.out.println("=================");
        System.out.println("\t              Data Karyawan " + Nama + " " + operator + " " + nilai + "");
        System.out.printf("%s %9s %17s %15s %12s %15s \n", "Nik", "Nama", "Gaji Pokok", "Tunjangan", "Bonus", "Denda");
        int x = 0;
        if ("Gaji Pokok".equalsIgnoreCase(Nama)) {
            x = 1;
        } else if ("Tunjangan".equalsIgnoreCase(Nama)) {
            x = 2;
        } else if ("Bonus".equalsIgnoreCase(Nama)) {
            x = 3;
        } else if ("Denda".equalsIgnoreCase(Nama)) {
            x = 4;
        }

        {
