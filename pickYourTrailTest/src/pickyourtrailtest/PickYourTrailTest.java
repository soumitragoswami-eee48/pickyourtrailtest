/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pickyourtrailtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import pickyourtrailtest.minunique.ArraySum;
import pickyourtrailtest.stack.Stack;

/**
 *
 * @author sougoswa
 */
public class PickYourTrailTest {

    /**
     * @param args the command line arguments
     */
    public static Scanner sc = new Scanner(System.in);
    public static int LIMIT = 100;

    public static void main(String[] args) {
        //Problem #1
        List<Integer> a = new ArrayList<>();
        //sample input
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(1);

        System.out.println("the minimun sum of the unique array formed is : " + ArraySum.getMinimumUniqueSum(a));

        //Problem #2
        Stack myStack = new Stack();
        boolean runProgram = true;
        System.out.println("Please enter number of instructions for stack operations :");
         int n = sc.nextInt();
         String[] instructions=new String[n+1];
        for(int i=0;i<=n;i++){
            instructions[i]=sc.nextLine();
        }
        for(int i=0;i<instructions.length;i++){
            if (instructions[i].contains("push") || instructions[i].contains("pop") || instructions[i].contains("inc")) {
                String[] tmp = instructions[i].split(" ");
                //if (tmp.length == 2) {
                    switch (tmp[0]) {
                        case "push":
                            if(tmp.length<2){
                                System.out.println("invalid push statement");
                            }
                            myStack.push(Integer.parseInt(tmp[1]));
                            myStack.viewTop();
                            break; 
                        case "pop":
                            myStack.pop();                           
                            break;
                        case "inc":
                            if(tmp.length<3){
                                System.out.println("invalid inc statement");
                            }
                            myStack.inc(Integer.parseInt(tmp[1]), Integer.parseInt(tmp[2]));
                            myStack.viewTop();
                            break;
                        default : 
                            System.out.println("invalid input!");

                    }
            }
        }

    }

}
