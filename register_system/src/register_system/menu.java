/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package register_system;

import java.io.*;
import java.util.*;
class menu {

    public static Scanner keyboard = new Scanner(System.in);
    static int choice;

    public int PrintMenu() {
        System.out.println("\n\n**** Menu : ระบบการลงทะเบียน");
        System.out.println("****  = = = = = = = = = = = = =   ");
        System.out.println("**** 1. สร้างรายวิชา");
        System.out.println("**** 2. แสดงรายวิชา ");
        System.out.println("**** 3. เพิ่มรายวิชา");
        System.out.println("**** 4. อัพเดทรายการลงทะเบียน");
        System.out.println("**** 5. แสดงรายชื่อนิสิต");
        System.out.println("**** 6. สร้างไฟล์นิสิต");
        System.out.println("**** 7. เพิ่มรายชื่อนิสิต");
        System.out.println("**** 8. แสดงการลงทะเบียนของนิสิต");
        System.out.println("**** 9. แสดงการลงทะเบียนตามรายวิชา");
        System.out.println("**** 10. ออก");
        System.out.println("****  = = = = = = = = = = = = =  ");
        System.out.print("**** เลือกรายการดำเนินงาน :");
        choice = keyboard.nextInt();
        return (choice);
    }
};
