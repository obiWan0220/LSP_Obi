package org.howard.edu.lsp.assignment2;
import java.util.Scanner;

public class tokenHw{
	
  public static int sum = 0, prod = 1;
  
  public static void scanString() {
    Scanner response = new Scanner(System.in);
    
    while(true) {
    System.out.println("\"enter a number(enter '.' when finished: ");
    String input = response.nextLine();
    
    if(input.charAt(0) == '.') break;
    
    else 
    scanString(input);
    }
    System.out.println("Sum: " + sum);
    System.out.println("Product: " + prod);
    }
  public static void scanString(String input) {
    int num, beginIndex = 0, index = 0;
    
    while(true) {
      index = input.indexOf(' ');
      
      if(index == -1) break;
      
      else {
        num = Integer.parseInt(input.substring(beginIndex, index));
        sum += num;
        prod *= num;
        input = input.substring(index + 1, input.length());
        }
      }
      num = Integer.parseInt(input);
      sum += num;
      prod *= num;
    }
    public static void main(String args[]) {
      scanString();
    }
}
