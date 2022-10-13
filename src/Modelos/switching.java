/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import javax.swing.JOptionPane;

/**
 *
 * @author alexa
 */
public class switching {
    
    public String Meses(String mes1){
        
        switch(mes1.toLowerCase()){
            
            case "enero":
             return "Tiene 31 dias";
               case "febrero":
             return "Tiene 28 dias";
               case "marzo":
             return "Tiene 31 dias";
               case "abri":
             return "Tiene 30 dias";
               case "mayo":
             return "Tiene 31 dias";
               case "junio":
             return "Tiene 30 dias";
               case "julio":
             return "Tiene 31 dias";
           case "agosto":
             return "Tiene 31 dias";  
             case "septiembre":
             return "Tiene 30 dias";
             case "octubre":
             return "Tiene 31 dias";
             case "noviembre":
             return "Tiene 30 dias";
             case "diciembre":
             return "Tiene 31 dias";
 
            
            default:
                        break;
                       
                
            
        }
         return "no existe";
         
         
    }
    
    public String temporada(int mes){
    
        switch(mes){
        
        case 1: 
        return "verano";
         case 2: 
         return "verano";
         
          case 3: 
          return "verano";
           case 4: 
           return "verano";
            case 5:  
            return "verano";
             case 6: 
             return "verano";
             
              case 7:
        return "invierno";
         case 8:  
         return "invierno";
         
          case 9:
          return "invierno";
           case 10: 
           return "invierno";
            case 11:  
            return "invierno";
             case 12: 
             return "invierno";
           
             default:
             break;
        
    }
       return "no existe"; 
        
    }
    
    
    
    
}
