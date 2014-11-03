/*************************
 * Kelli Barber
 * lab 10
 * 10/31/14
 * 
 * This program calls the 
 * methods addDigit and join
 * to add values to a and b
 * ************************/
 public class MethodCalls{ 
 public static int addDigit(int x, int y){
    int xsign = 1;
    int ysign= 1;
    if(x<0){
        xsign=-1;
        x=-x;
    }
    if (y<0){
        ysign=-1;
        y=-y;
    }
         String value1 = Integer.toString(y);
        String value2 = Integer.toString(x);
        String num = value1+value2;
        int w = Integer.parseInt(num);
        w=xsign*ysign*w;
        return w;
   
 }
 
 public static int join(int x, int y){
     int input = addDigit(y,x);
     return input;
 } 
 

    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
}  

