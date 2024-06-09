
package dev1.lab06;

/**
 *exercises tested in main 
 * @author Tirdea Ana-Maria
 */
public class ChaineUtil {
    
    
  public static char premiereLettre(String mot){
      return mot.charAt(0); 
      
  }    
    
    
  public static char dernierLettre(String mot){
      int longuer = mot.length(); 
      
      return mot.charAt(longuer-1); 
  }
    
    
}
