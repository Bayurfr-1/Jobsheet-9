
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win 7
 */
public class HitungInt {
    public static void hitung(int a , int b ){
        System.out.println("HASIL : "+ (a+b) );
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Bilangan I : ");
        int bil1 = input.nextInt();
        
        System.out.print("Masukkan Bilangan II : ");
        int bil2 = input.nextInt();
        
        hitung(bil1,bil2);
        
    }
}
