public class latihan {
    public static void main(String[] args) {
        float vipk = 3.50f;   
        
        if (vipk > 3.65f) {
            System.out.println("Lulus dengan pujian");
        } else if (vipk > 3.00f) {
            System.out.println("Sangat memuaskan");
        } else if (vipk > 2.50f) {
            System.out.println("Memuaskan");
        } else if (vipk > 2.00f) {
            System.out.println("Cukup");
        } else if (vipk > 0.00f) {
            System.out.println("Tidak lulus");
        } else {
            System.out.println("Nilai tidak valid");
        }
    }
}
