
package insertion_algorithm;

import java.util.Scanner;

/**
 *
 * @author Ilham, 19523066
 */
public class Insertion_Algorithm {


    public static void main(String[] args) {
        int[] number = {3,5,6,3,7,8,9,6};
        // Insertion_Algo(number);
        Sequential_Searching(number);
    }
    
    public static void Insertion_Algo(int[] numb){
        for (int i = 1; i < numb.length; ++i) { 
            int temp = numb[i]; 
            int j = i - 1;      
            while (j >= 0 && numb[j] > temp) { 
                numb[j + 1] = numb[j]; 
                j = j - 1; 
            } 
            numb[j + 1] = temp; 
        }
        for(int a: numb){
            System.out.print(a + " ");
        }
    }
    
    public static void Sequential_Searching(int[] numb){
        Scanner sc = new Scanner(System.in);
        int cAngka, nAngka = 0;
        String idx = "";
        
        for(int Angka : numb){
            System.out.print(Angka + " ");
        }
        System.out.println("");
        System.out.print("Masukkan angka yang dicari: ");
        cAngka = sc.nextInt();
        
        for(int i = 0;i < numb.length; i++){
            if(numb[i] == cAngka){
                nAngka = nAngka + 1;
                idx += i + " ";
            }
        }
        if(nAngka == 0){
            System.out.println("Angka " + cAngka + " tidak ditemukan, sejumlah " +
                    nAngka + " di index " + idx);
        }
                if(nAngka > 0){
            System.out.println("Angka " + cAngka + " ditemukan, sejumlah " +
                    nAngka + " di index " + idx);
        }
    }
    public static void Binary_Searching(int[] numb){
        
    }
}
