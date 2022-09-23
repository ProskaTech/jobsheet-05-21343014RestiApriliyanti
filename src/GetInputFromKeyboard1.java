/*
 * Created by 21343014_Resti Apriliyanti
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputFromKeyboard1 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader (System.in));

        String name = " ", hobi = " ";

        try {
            System.out.print("Nama Anda : ");
            name = dataIn.readLine();
            
            System.out.print("Hobi Anda : ");
            hobi = dataIn.readLine();
        }

        catch (IOException e) {
            System.out.println("Gagal Membaca Keyboard");
        }

        System.out.println("Jadi Hobi Anda adalah " +hobi+ ". Hobi yang bagus " +name);
    }
    
}
