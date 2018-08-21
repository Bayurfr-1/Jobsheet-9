
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
public class Kecepatan {
    
     public static void hitung(double jarak , double waktu ){
        System.out.println("KECEPATAN : "+(jarak/waktu) + " KM/JAM" );
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Jarak : ");
        double jarak = input.nextDouble();
        
        System.out.print("Masukkan Waktu Tempuh : ");
        double waktu = input.nextDouble();
        
        double 
         KECEPATAN = (jarak/waktu);
        
        hitung(jarak,waktu);
        
    }

   
    }


    

