package Java.Introduction;

import java.util.Scanner;

/* 
    Task
    In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

    Input Format
    There are 3 lines of input, and each line contains a single integer.

    Sample Input
    42
    100
    125

    Sample Output
    42
    100
    125
*/

public class StdIn_and_Stdout_I {
    public static void main(String[] args) {    
    Scanner scan = new Scanner(System.in);
    int int1 = scan.nextInt();
    int int2 = scan.nextInt();
    int int3 = scan.nextInt();
    scan.close();
    
    System.out.println(int1);
    System.out.println(int2);
    System.out.println(int3);
    }
}