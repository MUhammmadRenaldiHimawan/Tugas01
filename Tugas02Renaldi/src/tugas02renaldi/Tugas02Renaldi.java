/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas02renaldi;

/**
 *
 * @author acer
 */
public class Tugas02Renaldi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int umur = 23;
       String paras = "cantik";
       String knowledge = "Smart";
       if (umur <= 23 && umur >= 20 && knowledge == "Smart" && paras == "cantik") {
           System.out.println("Mau 100%!");
       } else if (umur <= 23 && umur >= 20 && paras == "cantik") {
           System.out.println("OK Lah");
       } else if (umur >= 23 && paras == "cantik") {
           System.out.println("Saya pikir pikir dulu");
       } else {
           System.out.println("No Way!");
       }

   }

    }
    
}
