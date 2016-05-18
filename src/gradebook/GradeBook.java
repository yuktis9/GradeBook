/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;


import java.util.Scanner;
/**
 *
 * @author yuktisarwadia
 */
public class GradeBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please Enter the student's name ==>" );
        String sName = input.nextLine();
//        System.out.println(sName);
        
        System.out.println("Please Enter the student's age ==>");
        int sAge = input.nextInt();
//        System.out.println(sAge);
        
        System.out.println("Please Enter the student's GPA ==>");
        Double sGpa = input.nextDouble();
//        System.out.println(sGender);
//        if (sName.equals("") || sAge != null || null != sGpa ){
            System.out.println("Welcome!!" +sName);
//        }
//        if sGender == 'Female'
    }
    
}
