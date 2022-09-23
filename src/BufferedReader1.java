/*
 * Created by 21343014_Resti Apriliyanti
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader1 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
        
        String a, b;
        float angka1, angka2, jumlah;
        System.out.println("Program Penjumlahan Dua Bilangan");

        try {
            System.out.print("Masukkan Angka Pertama : ");
            a = dataIn.readLine();
            angka1 = Float.parseFloat(a);

            System.out.print("Masukkan Angka Kedua : ");
            b = dataIn.readLine();
            angka2 = Float.parseFloat(b);

            jumlah = angka1 + angka2;
            System.out.print("Jumlah : " +jumlah);
        }

        catch (IOException e) {
            System.out.println("Gagal Membaca Keyboard");
        }
    }
}
