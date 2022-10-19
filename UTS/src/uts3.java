/**
 * Ghenta Alif Alde_21343048
 */

import javax.swing.JOptionPane;

public class uts3 {
    public static void main(String[] args) {
        int angka;
        String a;
        
        a = JOptionPane.showInputDialog("Masukkan Angka");
        angka = Integer.parseInt(a);

        if(angka>0) {
            JOptionPane.showMessageDialog(null,"Angka "+angka+" merupakan bilangan positif" );
        }
        else if (angka<0){
            JOptionPane.showMessageDialog(null, "Angka "+angka+" merupakan negatif" );
        }
        else {
            JOptionPane.showMessageDialog(null,"Angka "+angka+" merupakan bilangan netral" );
        }
    }
 }