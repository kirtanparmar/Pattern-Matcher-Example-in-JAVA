
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kirta
 */
public class MainClass {
    
    public static void main(String[] args) {
        
        /*Condition For Password String.*/
        /*First letter should not be Digit*/
        /*Must contain one Capital Letter and one Digit*/
        /*Must not contain '/' or '\'.*/
        
        String password;
        
        Scanner sc = new Scanner(System.in);
        password = sc.nextLine();
        
        System.out.println("" + checkPassword(password));
        
    }
    
    static boolean checkPassword(String str){ /*Returns true if password String satisfies all of the conditions else returns false.*/
        
        if(str.contains("/") || str.contains("\\") /*Checks string must not contain Forward slash or Backword slash.*/
          ){
            return false;
        }
        
        if(Pattern.matches("[a-zA-Z][a-zA-Z0-9]{1,}", str) /*Checks first letter is not a Digit.*/
           && Pattern.matches(".+[0-9]+.*", str) /*Checks String contains one Numeric character.*/
           && Pattern.matches(".+[A-Z]+.*", str) /*Checks String contains one Upper case letter.*/
          ){ 
            return true;
        }
        
        return false;
        
    }
    
}
