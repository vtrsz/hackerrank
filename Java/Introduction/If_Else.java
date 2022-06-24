package Java.Introduction;

import java.util.Scanner;

/*
    Task
    Given an integer, n, perform the following conditional actions:

    If n is odd, print Weird
    If n is even and in the inclusive range of 2 to 5, print Not Weird
    If n is even and in the inclusive range of 6 to 2, print Weird
    If n is even and greater than 20, print Not Weird
    Complete the stub code provided in your editor to print whether or not  is weird.

    Input Format
    A single line containing a positive integer, n.

    Constraints
    1 < n < 100

    Output Format
    Print Weird if the number is weird; otherwise, print Not Weird.
    Sample Input 0
    3
    Sample Output 0
    Weird
    Sample Input 1
    24
    Sample Output 1
    Not Weird

    Explanation
    Sample Case 0: n = 3 
    n is odd and odd numbers are weird, so we print Weird.

    Sample Case 1: n = 24
    n > 20 and n is even, so it isn't weird. Thus, we print Not Weird.

*/

public class If_Else {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        if (n % 2 != 0){
            System.out.println("Weird");
        } else if (n % 2 == 0 & n >= 2 & n <= 5){
            System.out.println("Not Weird");
        } else if (n % 2 == 0 & n >= 6 & n <= 20){
            System.out.println("Weird");
        } else if (n % 2 == 0 & n > 20){
            System.out.println("Not Weird");
        }
    }
}
