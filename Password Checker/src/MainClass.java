
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
        
        String password;
        
        Scanner sc = new Scanner(System.in);
        password = sc.nextLine();
        
        System.out.println("" + checkPassword(password));
        
    }
    
    static boolean checkPassword(String str){
        
        if(str.contains("/") || str.contains("\\")){
            return false;
        }
        
        if(Pattern.matches("[a-zA-Z][a-zA-Z0-9]{1,}", str) && Pattern.matches(".+[0-9]+.*", str) && Pattern.matches(".+[A-Z]+.*", str)){
            return true;
        }
        
        return false;
        
    }
    
}
