package com.company;
import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;
import java.lang.Math;
import java.lang.Double;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum=0.00;
        System.out.print("Введите количество чисел: ");
        int count=input.nextInt();
        String[]str=new String[count];
        for(int i=0;i<count;i++) {
            System.out.print("Введите число "+ (i+1)+" :");
            str[i]=input.next();
            sum+=Double.parseDouble(str[i]);
        }
        System.out.println("Сумма:"+sum);
    }
}
