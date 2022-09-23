/*
 * Created by 21343014_Resti Apriliyanti
 */

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       System.out.print("Masukkan Nama Lengkap : ");
       String nama = in.nextLine();

       System.out.print("Masukkan NIM : ");
       int NIM = in.nextInt();

       System.out.print("Masukkan Nilai : ");
       float nilai = in.nextFloat();

       System.out.println(  "\nNama : " +nama +
                            "\nNIM : " +NIM +
                            "\nNilai : " +nilai); 
    }
    
}
