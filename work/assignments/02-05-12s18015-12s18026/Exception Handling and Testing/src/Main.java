import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*package Exception_Handling_and_Testing;*/

/**
 *
 * @author 05-12S18015 Della Cenovita Tarigan
 * @author 05-12S18026 Yohanes Ray Febriyanto Silitong
 */
public class Main {
    
    /*class-level attributes */
    private static final List<String> nims = new ArrayList<>();
    private static List<String> names = new ArrayList<>();

    /*program entry point */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);     
        String s;     
        boolean quit = false; 
        
        do {       
            s = in.nextLine();
            String[] tokens = s.split(" ");
            String output = "";
            
        
            switch (tokens[0]) { 
        case "add":          
              add(tokens[1], tokens[2]);
                break;     
        case "find":  
            output = find(tokens[1]);      
                break;         
        case "count":           
            output = "" + count();          
            break;   
        case "reset":    
            reset();           
            break;       
        case "exit":           
            quit = true;       } 
 
      if (output.length() > 0) {        
          System.out.println(output);       }     
        } 
        while (!quit);   
    } 
 
     /**    
      * Adds a new student data.    
      *    
      * @param _nim Student number    
      * @param _name Student name    
      */   
    
    public static void add(String _nim, String _name) {   
        int check = 0;
    for(int i= 0; i< nims.size() ; i++){    
            if ( _nim.equals (nims.get(i))){
                check++;
            }
    }
            if(check==0){
                nims.add (_nim);
                names.add (_name);
            }
        }
 
    
  /**    
   * Finds a student based on the student number.    
   *    
   * @param _nim Student number    
   * @return When the given student number does exist in the storage, return a    
   * string that represent the student data. Otherwise, <code>NULL</code> is    
   * returned.    
   */   
    
    public static String find(String _nim) {     
        int index = nims.indexOf(_nim); 
        if (index >= 0) {       
            return nims.get(index) + " " + names.get(index);     
        } 
 
    return "";   
    }

   /**    
    * Counts the number of student data stored.    
    *    
    * @return A numerical value representing the number of student data stored in    
    * the program.    
    */   
    
    public static int count() {     
        return nims.size();   
    } 
        
    /**    
     * Removes all student data.    
     */  
    public static void reset() {   
    nims.clear();
    names.clear();
    } 
}

  