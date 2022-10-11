/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;


/**
 *
 * @author alexa
 */
public class MDO {
    
    
    public double prom_1n(double n2){
        double suma;
        int contador=0;
        double n1;
        n1=1;
        suma=0;
        do{
            suma=suma+n1;
            
           contador++;
            n1++;
        }while(contador!=n2);
                
   
      return suma/contador;
        
    }
    
    public double prom_12(double n1,double n2){
     double suma;
     int contador;
     contador=0;
     suma=0;
     do{
         suma=suma+n1;
        
         contador++;
         n1++;
         
     }while(contador!=n2);
        return suma/contador;
    }
    
    public boolean primo(double n1){
       
 if (n1==0){return false;}
  if (n1==1){return false;}
   if (n1==4){return true;}
  double prueba ;
   int x;
  x=2;
  prueba=n1 % x;
 
  do{
      if (prueba == 0) return true;
      x++; 
  }while( x < n1 / 2);
  return false;

    }
    /*
    public boolean conta(char n1){
        char contra;
        contra="abc.123";
        do{
           return true;
        }while(contra==n1);
  return false;
        
    
    
}*/
    
    public double sumar2(){
    int conta;
    conta=2;
    double suma4;
    suma4=0;
    do{
        suma4=suma4+conta;
        conta=conta+2;
        
    }while(conta<=200);
         return suma4;  
}
   
    
    
}