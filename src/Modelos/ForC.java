/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author alexa
 */
public class ForC {
   
    
    public double sumatoria(double n1){
        double sumato;
        sumato=1;
        for(int i=0;i<n1;i++){
            sumato=sumato+i;
            
        }
        return sumato;
    }
       public double sumatoria2(double n1,double n2){
        double sumato;
        sumato=n1;
        for(int i=0;i<n2;i++){
            sumato=sumato+i;
            
        }
        return sumato;
    }
    
       public boolean primo(double n1){
          
  // Casos especiales
  if (n1 == 0) return false;
    if (n1 == 1) return false;
      if (n1 == 4) return false;
      
  double prueba;
  prueba=0;
  for (int x = 2; x < n1 / 2; x++) {
      prueba=n1% x;
    if (prueba== 0) {
        return false;
    }
  }
    return true;
       }

}