/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21task2alekseipodusko;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SPTV21Task2AlekseiPodusko {

    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       System.out.print("Введите 3 значное число");
       int countnumb= scanner.nextInt();
       int third=countnumb%10;
       int second=(countnumb/10)%10;
       int first=((countnumb/100)%10);
       int sum=(first+second+third);
       System.out.print("Первое чило-"+first+ "Второе число- "+second+" Третье число- "+third+"; Равно сумме "+sum);
      
    }
}
