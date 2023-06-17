
import java.util.Scanner;

public class Main {
    
    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Taban değerini girin: ");
        double taban = scanner.nextDouble();
        System.out.print("Üs değerini girin: ");
        int us = scanner.nextInt();

        double sonuc = usHesapla(taban, us);
        System.out.println(taban + " üzeri " + us + " = " + sonuc);
        
    }
    
    public static double usHesapla(double taban, int us) {
        
        if (us == 0)
            return 1;
        else if (us > 0)
            return taban * usHesapla(taban, us - 1);
        else
            return (1 / taban) * usHesapla(taban, us + 1);
    }

    
    
}
