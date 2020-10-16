package com.company;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int x, average, i, sum = 0, num;
	Scanner input = new Scanner(System.in);
	System.out.println("Pentru cate numere doriti sa caluclati media?");
	x = input.nextInt();
	for (i = 1; i <= x; i ++){
        num = Integer.valueOf(JOptionPane.showInputDialog("Introduceti numarul " + i + ": "));
        sum = sum + num;
    }
	average = sum / x;
	JOptionPane.showMessageDialog(null,"Media aritmetica a numerelor introduse este: " + average);
    }
}
