/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 * @author 
 * Nama      : Garry Prang
 * Kelas     : PBO-2
 * NIM      `: 10116147
 * Deskripsi : Program untuk menghitung gaji karyawan.
 */

public class PBO210116147Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("======= Program Perhitungan Gaji Karyawan =======");
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Scanner scn3 = new Scanner(System.in);
        Scanner scn4 = new Scanner(System.in);
        Scanner scn5 = new Scanner(System.in);
    
        Manager manager = new Manager ();
        System.out.print("Masukkan NIK\t\t\t: ");
        manager.setNik(scn1.next());
        System.out.print("Masukkan Nama\t\t\t: ");
        manager.setNama(scn2.next());
        System.out.print("Masukkan Golongan (1/2/3)\t: ");
        manager.setGolongan(scn3.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag): ");
        manager.setJabatan(scn4.next());
        System.out.print("Masukkan Jumlah Kehadiran\t: ");
        manager.setKehadiran(scn5.nextInt());
        System.out.println("");
        System.out.println("======= Hasil Perhitungan =======");
        System.out.println("NIK\t\t: " + manager.getNik());
        System.out.println("Nama\t\t: " + manager.getNama());
        System.out.println("Golongan\t: " + manager.getGolongan());
        System.out.println("Jabatan\t\t: " + manager.getJabatan());
        System.out.println("");
        System.out.println("Tunjangan Golongan\t= " + manager.tunjanganGolongan
                                                     (manager.getGolongan()));
        System.out.println("Tunjangan Jabatan\t= " + manager.tunjanganJabatan
                                                    (manager.getJabatan()));
        System.out.println("Tunjangan Kehadiran\t= " + manager.tunjanganKehadiran
                                                     (manager.getKehadiran()));
        System.out.println("Gaji Total\t\t= " + manager.totalGaji());
    }
    
}
