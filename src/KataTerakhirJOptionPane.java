/*
 * Created by 21343014_Resti Apriliyanti
 */

import javax.swing.JOptionPane;

public class KataTerakhirJOptionPane {
    public static void main(String[] args) {
        String word1 = " ", word2 = " ", word3 = " ";

        word1 = JOptionPane.showInputDialog("Enter Word 1 : ");
        word2 = JOptionPane.showInputDialog("Enter Word 2 : ");
        word3 = JOptionPane.showInputDialog("Enter Word 3 : ");

        String msg = " " +word1 + " " +word2 + " " +word3;

        JOptionPane.showMessageDialog(null, msg);

        System.out.println(" " +word1 + " " +word2 + " " +word3);
        
    }
}
