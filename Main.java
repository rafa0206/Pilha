/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula13_mario_stack;

/**
 *
 * @author JFernandes
 */

import java.util.IllformedLocaleException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static int eval(String str) {
    Scanner s = new Scanner(str);
    Stack<Integer> stack = new Stack<>();
    while (s.hasNext()) {
      if (s.hasNextInt()) {
        stack.push(s.nextInt());
      }
      else if (s.hasNext("\\+")) {
        s.next("\\+");
        int o2 = stack.pop();
        int o1 = stack.pop();
        stack.push(o1 + o2);
      }
      else if (s.hasNext("\\*")) {
        s.next("\\*");
        int o2 = stack.pop();
        int o1 = stack.pop();
        stack.push(o1 * o2);
      }
      else throw new IllformedLocaleException();
    }
    if (stack.size() != 1) throw new IllformedLocaleException();
    s.close();
    return stack.pop();
  }

  public static void main(String [] args) {
    System.out.println(eval("2 3 * 4 1 7 + * + 9 +"));
  }
    
}
