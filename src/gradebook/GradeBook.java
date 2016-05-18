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
        int sAge, dayStill = 0, retirement = 70;
        Double sGpa;
        String sName, gender = "";
        Boolean isFemale;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please Enter the student's name ==>" );
        sName = input.nextLine();
//        System.out.println(sName);
        
        System.out.println("Please Enter the student's age ==>");
         sAge = input.nextInt();
//        System.out.println(sAge);
        
        System.out.println("Please Enter the student's GPA ==>");
        sGpa = input.nextDouble();

        System.out.println("Are you Female (True/False) ==>");
        isFemale = input.nextBoolean();
        
        //MARK: - To be on Dean's list student must qualify this check       
        if (sGpa > 3.2){
            System.out.printf("Congrats! %s you are on Dean's List \n", sName);
        }else{
            System.out.printf("Sorry! %s you are not on Dean's List \n", sName);
        }
        
        gender = isFemale ? "She" : "He";
        
        //MARK: - To be on Dean's list student must qualify this check       
        if (isFemale != true){
            System.out.printf("%s is %d years old. %s has a %f GPA Welcome!! \n", sName, sAge,gender, sGpa);
        }else{
            System.out.printf("%s is %d years old. %s has a %f GPA Welcome!! \n", sName, sAge, gender,sGpa);
        }
        
        dayStill = retirement - sAge;
        
        //MARK: - To be on Dean's list student must qualify this check       
//        if (sAge >= 70){
            System.out.printf("%s is %d years old. %s has a %f GPA Welcome!! and %d days left for retirement\n", sName, sAge,gender, sGpa, dayStill);
//        }else{
//            System.out.printf("%s is %d years old. %s has a %f GPA Welcome!! \n", sName, sAge,gender, sGpa);
//        }
    }
    
}
