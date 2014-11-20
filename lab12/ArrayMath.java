import java.util.Scanner;
/*************************
 * Kelli Barber
 * lab 12
 * 11/14/14
 * 
 * This program will call two
 * methods that are written 
 * to perform arithmetic operations 
 * ************************/
public class ArrayMath{
 public static Boolean equals(double [] list1, double [] list2){
   Boolean equals= false;
    if (list1.length==list2.length){
      equals= java.util.Arrays.equals(list1, list2);
    }else {
        equals = false;
    }
    return equals;
}

public static double[] addArrays(double [] list1, double[] list2){
    double [] result = new double [list1.length];
    //int i=0;
    if (list1.length==list2.length){
        for(int i=0; i<list1.length; i++){
            result[i]=list1[i]+list2[i];
        }
    }else if(list1.length>list2.length){
        int extra = list1.length-list2.length;
        for(int i=0; i<list2.length; i++){
            result[i]=list1[i]+list2[i];
        }
        for(int j=list2.length; j<list1.length;j++){
            result[j]=list1[j];
        }
    }
    return result;
}
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
}
