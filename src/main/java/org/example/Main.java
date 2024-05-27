package org.example;

// Klavyeden girilen [a,b] aralığı ve parça ( oluşturulacak diktörgen ) sayısına göre  f(x) = 3x² + 2x fonksiyonunun belirli integralini
// "sağ toplamlar" ile hesaplayan program

import java.util.Scanner;

public class Main {
    public static double f(double x){
        return 3*x*x+2*x;
    }
    public static void main(String[] args) {

        double a,b,h,t = 0;
        int n,k;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Aralığın Alt Sınırı : ");
        a = scanner.nextDouble();
        System.out.print("Aralığın Üst Sınırı : ");
        b = scanner.nextDouble();
        System.out.print("Parça Sayısı : ");
        n = scanner.nextInt();

        h=(b-a)/n;

        for (k=1; k<=n; k++)
            t+=h*f(a+k*h);
        System.out.printf("\nBelirli İntegral : %.10f",t);


    }
}
