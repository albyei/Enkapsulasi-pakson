/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;
import java.util.Scanner;
 public class main {
     public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
      System.out.print("masukkan username : ");
      String username =input.nextLine();
      System.out.print("masukkan password ");
      String password =input.nextLine();
      
      User agus = new User(username, password);
      
      agus.setUsername("agus");
      agus.setPassword("agusId123");

      
         System.out.println("username : " +agus.getUsername());
         System.out.println("password : " + agus.getPassword());
     }
 }


