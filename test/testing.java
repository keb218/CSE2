import java.util.Scanner; //import 
import java.util.Random; 
 /***************************************
  * Kelli Barber
  * lab09
  * 11/1/14
  *
  * This program addresses large problems
  * in terms of subproblems and teaches
  * modularity
  *
  * ************************************/
 public class testing{
     //public static void main (String args[]){
    
         

 /**  
 [START]
[1]
[2]
[4]
[7]
[11]
[16]
[END]
 
 
 int j=1;
    int i=0;
        
        for (int i =0; i<6;i++){
    if (i==0){
        System.out.println("[START]");
    }
    j=j+i;
    System.out.println("[" + j +"]");
   
    }
     if (i==6){
        System.out.println("[END]");
    }
    

1
2
22
4
44
444
8
88
888
8888   

    int i=1, temp=1;
         for( i=0; i<4; i++){
             if(i!=0){
                 temp=temp*2;
             }
             for(int j=0; j<i+1; j++){
                 for (int k=0; k<j; k++){
                 System.out.print(temp);
             }
             System.out.println(temp);
        } }
        
        
        
v:     Aaa
v:         Aaaaa
v:             Aaaaaaa
v:                 Aaaaaaaaa


public static String A(String a){
    return " " + (" " + a + "a");
}

public static void main( String args[] ){
    int i = 0;
String word = "A";
    for(i = 0; i<4; i++){
        word = A( A(word) );
System.out.println("v: " + word );
}
int i=0, j=40;
while (i < 40) {
     while (j > 0) {
          System.out.println(i*j);
          j -= 4;
     }
     i += 2;
}


b
bb
b
bb
bbb
b
bb
bbb
bbbb

for (int j=1; j<4; j++){
    for ( int k=0; k<j+1; k++){
        for(int i=0; i<k+1; i++){
        System.out.print("b");
    }
    System.out.println();
}

int k=8;
for (int i=9; i>0; i--){
    for(k; k>0; k--){
        System.out.print(" ");
    }
    System.out.println(i);
    k--;
}

/////FALL 2012 EXAM 23#1
 //method showHands
int[] A={0,1,2,3,4};
int [] B= {0,1,2,3,4};
//int [] C= new int[5];
A[0]=A[A.length-1];
int j=1;
for(int i=0; i<4; i++){
        A[j]=B[i];
    j++;
}
for(int i=0; i<5; i++){
System.out.println( A[i] + " " + B[i]);
}
////FALL 2012 EXam 3 #3
public static void main(String [] args){
int [] x={0,1};
expand(x);
}
public static int[] expand(int[] in){
    int count =0;
    count++;
    int []B=new int [in.length*2];
    for(int i=0; i<in.length; i++){
        B[i]= in[i];
    }
    in = B;
    for(int i=0; i<in.length; i++){
        System.out.println(in[i]);
    }
    System.out.println(count);
    return in;
}

public static void main(String [] args){
    int[] x={1,2,3,4,5,6};
    int t=0; int m=0;
    for (int i=1; i<x.length; i+=2){
        t+=x[i];
    }
    for (int i=0; i<x.length; i+=2){
        m+=x[i];
    }
    System.out.println("even avg " +m/2);
     System.out.println("odd avg " +t/2);
     for (int i=0; i<x.length; i++){
         System.out.print(x[i]);
     }
}


    double [] x = {2.5, 3.4, 6.0, 1.2, 5.2};
    double t=0;
    for (double u: x){
        t+= u;
    }
    System.out.print(t);
}
public static void main(String [] args){
    double [] y ={21,13,72,43,5,16,7};
    
    for(int i=0; i<y.length;i++){
        double min=y[i];
        int minindex=i;
    for(int j=i+1; j<y.length; j++){
        if(min>y[j]){
            min=y[j];
            minindex=j;
        }
    }
    if(minindex != i){
        y[minindex]=y[i];
        y[i]=min;
    }
System.out.print(y[i]+ " ");

        
    }
}
public static void main(String [] args){
    int [] x={1,2,3,4,5,6,7};
    int y=6;
    int min=x[0];
    int max=x.length-1;
  
    
    while(max>=min){
          int mid=(min+max)/2;
    if(y<x[mid]){
        max=mid-1;
    }else if(y==x[mid]){
           System.out.print(x[mid]); 
           break;
    }
     else{
         min=mid+1;
     }

    }
}
**/
public static void main(String [] args){
    int [] x={1,2,3,4,5,6,7,8};
    int y=7;
    for(int i=0; i<x.length; i++){
        if(x[i]==y){
            System.out.print(x[i]);
            break;
        }
        
    }
}
}