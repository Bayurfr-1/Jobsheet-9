
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
public class Praktikum2 {
   public static int nilai (int nilai1,  int nilai2, int nilai3, int maks) {
       if (nilai1 > nilai2 && nilai2 > nilai3){
       maks = nilai1; }
       else if (nilai2 > nilai1 && nilai1 > nilai3) {          
       maks = nilai2;}
       else {
           
       maks = nilai3;}
       return maks;
   }
   
    public static void main(String[] args) {
        Scanner bil = new Scanner (System.in);
        
        System.out.print("Masukkan bilangan 1 : ");
        int bil1 = bil.nextInt();
           
        System.out.print("Masukkan bilangan 2 : ");
        int bil2 = bil.nextInt();
           
        System.out.print("Masukkan bilangan 3 : ");
        int bil3 = bil.nextInt();
        
        int maks = 0;
        
        int compare;
        compare = nilai (bil1,bil2,bil3,maks);
        System.out.println("Nilai terbesar adalah : "+ compare);
        
    }
   
}


    