/*
 * Created by 21343014_Resti Apriliyanti
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class KataTerakhirBufferedReader {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader (System.in));

        String word1 = " ", word2 = " ", word3 = " ";

        try {
            System.out.print("Enter Word 1 : ");
            word1 = dataIn.readLine();
            
            System.out.print("Enter Word 2 : ");
            word2 = dataIn.readLine();

            System.out.print("Enter Word 3 : ");
            word3 = dataIn.readLine();
        }

        catch (IOException e) {
            System.out.println("Gagal Membaca Keyboard");
        }

        System.out.println(" " +word1 + " " +word2 + " " +word3);
    }
}
