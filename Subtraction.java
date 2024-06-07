/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.subtraction;

/**
 *
 * @author faith
 */
import java.util.Scanner;
import java.util.Random;

public class Subtraction {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        // Generate two single-digit integers
        int number1 = rand.nextInt(10);
        int number2 = rand.nextInt(10);

        // If num1 < num2, swap num1 with num2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // Prompt the student to answer "What is number1 - number2?"
        System.out.println("What is " + number1 + " - " + number2 + "?");
        int answer = input.nextInt();

        // Check the student's answer and display whether the answer is correct or not
        if (number1 - number2 == answer) {
            System.out.println("Correct! Well done.");
        } else {
            System.out.println("Incorrect. The correct answer is " + (number1 - number2));
        }

        input.close();
    }
}
