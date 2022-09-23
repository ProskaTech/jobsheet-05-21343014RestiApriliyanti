/*
 * Created by 21343014_Resti Apriliyanti
 */

import javax.swing.JOptionPane;

public class GetInputFromKeyboard2 {
    public static void main(String[] args) {
        String nama = " ", hobi = " ";

        nama = JOptionPane.showInputDialog("Nama Anda : ");
        hobi = JOptionPane.showInputDialog("Hobi Anda : ");

        String msg = "Jadi hobi Anda " +hobi+ "." + "Hobi yang bagus " +nama;

        JOptionPane.showMessageDialog(null, msg);

        System.out.println("Jadi Hobi Anda " +hobi+ ". Hobi yang bagus " +nama);
    }
    
}
