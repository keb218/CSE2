import java.util.Scanner; //import scanner
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
     public static void main (String args[]){
    
         

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
**/
int k=8;
for (int i=9; i>0; i--){
    for(k; k>0; k--){
        System.out.print(" ");
    }
    System.out.println(i);
    k--;
}


}
}

