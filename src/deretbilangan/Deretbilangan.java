/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deretbilangan;

/**
 *
 * @author user Rani Hanifah
 */
import java.util.Scanner;


public class Deretbilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // pendeklarasian variable bertipe data
        String nama,nim;
        int angka,past,current,fibonacci;
        int oddSum = 0;
        int evenSum = 0;
        int fiboSum = 0;
        char ulang; 
        
        do{
        System.out.print("Masukkan Nama Anda [1-25 Karakter]: ");
        nama = in.next();
        //cek panjang variabel
        if(nama.length() >= 1 && nama.length() <=25 ){
            System.out.print("Masukkan NIM Anda [10 Karakter]: ");
            nim = in.next();
            if(nim.length() == 10){
                System.out.println("");
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                System.out.println("");
                System.out.println("Registrasi Sukses ...");
                System.out.println("Selamat datang " + nama + "[NIM: " + nim + "]" + "^^");
                System.out.println("");
                System.out.println("Mari belajar macam-macam deret bilangan ..");
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                System.out.println("");
                System.out.print("Masukkan Sembarang Angka [5-20] : ");
                angka = in.nextInt();
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                System.out.println("");
                System.out.println("Deret Bilangan");
                System.out.println("==============");
                System.out.println(angka + " Bilangan Ganjil : ");
                for(int i=1;i <= angka * 2; i++) {
                    if (i%2!=0) {
                    System.out.print(i+" ");
                    oddSum = oddSum + i; }
                }
                System.out.println("|| Hasil Penjumlahan = " + oddSum);
                System.out.println("");
                System.out.println(angka + " Bilangan Genap : ");
                for(int i=1;i <= angka * 2; i++) {
                    if (i%2==0) {
                    System.out.print(i+" ");
                    evenSum = evenSum + i; }     
                }
                System.out.println("|| Hasil Penjumlahan = " + evenSum);
                System.out.println("");
                System.out.println(angka + " Bilangan Fibonacci : ");
                past = 0;
                current = 1;
                fibonacci = 1;
                for (int i =1; i <= angka; i++){
                    System.out.print(current + " ");
                    fiboSum = fiboSum + current;       
                    fibonacci = past + current;
                    past = current;
                    current = fibonacci;
                }
                System.out.println("|| Hasil Penjumlahan = " + fiboSum);
            }else{
                System.out.println("NIM Harus 10 Karakter");
            }
        }else{
            System.out.println("Nama Minimal 1 Karakter dan Maksimal 25 Karater");
        }
         System.out.println();
         System.out.println("Anda ingin mengulang [y/t] : ");
         ulang = in.next().charAt(0);
         System.out.println();
        }
        while(ulang != 't');
        
        System.out.println("Terima Kasih");        
    }
    
}
