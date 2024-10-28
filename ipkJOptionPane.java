import javax.swing.JOptionPane;

public class ipkJOptionPane {
    public static void main(String[] args) {
        double Vipk = Double.parseDouble(JOptionPane.showInputDialog("Masukkan IPK Anda:"));

        if (Vipk >= 3.65 && Vipk <= 4.00) {
            System.out.println("Lulus dengan pujian");
        } else if (Vipk >= 3.00 && Vipk <= 3.64) {
            System.out.println("Sangat memuaskan");
        } else if (Vipk >= 2.50 && Vipk <= 2.99) {
            System.out.println("Memuaskan");
        } else if (Vipk >= 2.00 && Vipk <= 2.49) {
            System.out.println("Cukup");
        } else if (Vipk >= 0.00 && Vipk <= 1.99) {
            System.out.println("Tidak lulus");
        } else {
            System.out.println("IPK tidak valid");
        }
    }
}