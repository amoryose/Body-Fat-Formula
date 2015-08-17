// 7/7/14
// Avraham Moryosef
// CSC156
// Exercise 4
// BODY FAT FORMULA FOR MEN AND WOMEN

package bodyfat;

import javax.swing.JOptionPane;
//import java.util.*;

public class Body_Fat
{
    public static void main(String [] args)
    {    
            // input variables
            
            double bW;   // body weight
            double wM;   // waist measurement
            double wrM;  // wrist measurement
            double hM;   // hip measurement
            double fM;   // forearm measurement
            double BF;   // body fat
            double BFP;  // body fat percentage
            int input;   // input for male or female
            
            // variables that are dependent via the calculations
            
            double A1;
            double A2;
            double A3;
            double A4;
            double A5;
            double B; 
                        
            // constant variables
            
            int MALE = 1;
            int FEMALE = 2;
            
            // input string variables
            
            String bWString;    // body weight string
            String wMString;    // waist measurement string
            String wrMString;   // wrist measurement string
            String hMString;    // hip measurement string
            String fMString;    // forearm measurement string
            String BFString;    // body fat string
            String BFPString;   // body fat percentage
            String inputString; // input for male or female
            
        int choice;
        do
        {
            //  Questions that are common for men and women
            
            inputString = JOptionPane.showInputDialog("Enter 1 for male or 2 for female: ");
            input = Integer.parseInt(inputString);
            
            bWString = JOptionPane.showInputDialog("Enter your body weight in pounds: ");
            bW = Double.parseDouble(bWString);
            
            wMString = JOptionPane.showInputDialog("Enter your waist measurement in inches: ");
            wM = Double.parseDouble(wMString);          
                   
         // FEMALE
         
            if (input == FEMALE)
            {
            // additional questions for female
                
            wrMString = JOptionPane.showInputDialog("Enter your wrist measurement in inches: ");
            wrM = Double.parseDouble(wrMString);
            
            hMString = JOptionPane.showInputDialog("Enter your hip measurement in inches: ");
            hM = Double.parseDouble(hMString);
            
            fMString = JOptionPane.showInputDialog("Enter your forearm measurement in inches: ");
            fM = Double.parseDouble(fMString);
            
            // formula for female
            
            A1 = (bW * 0.732) + 8.987;
            A2 = (wM * 0.157);
            A3 = (wrM / 3.14);
            A4 = (hM * 0.249);
            A5 = (fM * 0.434);
            
            B = A1 + A2 + A3 + A4 + A5;
            
            BF = bW - B;
            
            BFP = BF * 100 / bW;
            
            BFString = String.format("Your body fat is: %.2f", BF);
                                    
            BFPString = String.format("Your body fat percentage is: %.2f%%", BFP);
             
            JOptionPane.showMessageDialog(null, BFString + "\n" + BFPString,
                                            "Female Body Fat Information",
                        JOptionPane.INFORMATION_MESSAGE);
    
         }
          
         //MALE
                
           else if ( input == MALE)
           {
                  
            A1 = (bW * 1.082) + 94.42;
            A2 = wM * 4.15;
            B = A1 - A2;
            
            BF = bW - B;
            
            BFP = BF * 100 / bW;
            
            BFString = String.format("Your body fat is: %.2f", BF);
                                                       
            BFPString = String.format("Your body fat percentage is: %.2f%%", BFP);
             
            JOptionPane.showMessageDialog(null, BFString + "\n" + BFPString,
                                            "Male Body Fat Information",
                        JOptionPane.INFORMATION_MESSAGE);
             }
             
             choice = JOptionPane.showConfirmDialog(null,"Would you like to make another calculation?", "Make a Choice",
                                                JOptionPane.YES_NO_OPTION);
                                                
         }
         while (choice == 0);        
            
        System.exit(0);
        
        }
}