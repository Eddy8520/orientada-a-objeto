/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author alexa
 */
public class Mlogico {
    
         
    public boolean Son_iguales(double num1, double num2){
        return num1==num2;
    }
    
    public double es_mayor(double num1, double num2){
        if(num1>num2){
            return num1;
        }
        else return num2;
        
        
        
    }
     public double es_menor(double num1, double num2){
        if(num1<num2){
            return num1;
        }
        else return num2;
        
        
        
    }
     
     public boolean sera_verdad(double num1, double num2){
       
        return num1>=num2 ;
  
        
    }
      public boolean sera_falso(double num1, double num2){
       
        return num1<=num2 ;
  
        
    }
    
    
}

