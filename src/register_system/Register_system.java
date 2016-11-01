/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package register_system;
import java.io.*;
import java.util.*;
/**
 *
 * @author Spectre
 */
public class Register_system {

    /**
     * @param args the command line arguments
     */
    public static Scanner keyboard = new Scanner(System.in);
    static int choice;
    static menu Menu = new menu();
    static operation obj = new operation(0);
    public static void main(String[] args) {
        // TODO code application logic here
        do  {
            choice = Menu.PrintMenu();
            switch (choice) {
                case 1:
                    obj.SubjectScheduler();
                    break;
                case 2: 
                    obj.Display_SubjectScheduler(); 
                    break;
                case 3:
                    obj.Add_SubjectScheduler();
                      break;
                case 4:
                    obj.Update(); //4 อัพเดท
                    break;
                case 5:
                   obj.Display_Student(); 
                    break;
                case 6:
                    obj.Student();
                    break;
                case 7:
                   obj.Add_Student();
                    break;
                case 8:
                   // obj.DisplayData(); 
                    break;
                case 9:
                  //  obj.SearchData();
                    break;
                
                case 10:
                    obj.exit(0);
                    break;
            }
            if(choice != 10)
            {
              System.out.print("press any key ");
              String RR = keyboard.nextLine();
            }
        } while (choice != 10);
    }
    }
    

