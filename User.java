/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

/**
 *
 * @author MOLKET012
 */
 class User {
     private String username;
     private String password;
     
     public User(String username, String password){
    this.username = username;
    this.password = password;
    
}
     // method setter
     public void setUsername(String username){
         this.username = username;
     }
     public void setPassword(String password){
         this.password = password;
     }
     
     //method getter
     public String getUsername(){
         return this.username;
     }
     public String getPassword(){
         return this.password;
     }

}

