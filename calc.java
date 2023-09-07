import java.io.*;
import java.lang.Math;
import java.util.Scanner;


public class calc{
    public static void main (String [] args){
        float a;
        float b;
        float output = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan dua angka: ");
        a = input.nextFloat();
        b = input.nextFloat();
        
        System.out.println("Hasil penjumlahan variabel a dan b = "+(a+b));
        System.out.println("Hasil pengurangan variabel a dan b = "+(a-b));
        System.out.println("Hasil perkalian variabel a dan b = "+(a*b));
        System.out.println("Hasil pembagian variabel a dan b = "+(a/b));
    }
}