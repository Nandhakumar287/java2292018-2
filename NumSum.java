import java.io.*;
import java.util.*;
  public class NumSum{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Any Number");
      int in=sc.nextInt();
      int a,b=0;
      while(in>0){
      a=in%10;
      b=b+a;
      in=in/10;
      }
      System.out.println("SUM:"+b);
    }
  }  
