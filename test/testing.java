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
**/

public static void main(String [] args){ //method showHands
int[] rank=new int [13]; //set array for rank to have 13 spots
   int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,r=0,j=0,k=0,l=0,m=0, n=0;
   int aa=0,bb=0,cc=0,dd=0,ee=0,ff=0,gg=0,hh=0,rr=0,jj=0,kk=0,ll=0,mm=0;
    int[] deck = new int [52]; //create a deck of cards using array
    int[] hand = {-1, -1, -1, -1, -1}; //sey all values in array to -1
   Random rand= new Random(); //name random value
   for (int q=0; q<deck.length; q++){
       deck[q]=q;
   }
   /**int t=0;
   for (int xx=0; xx<hand.length; xx++){ //run while i is less than hand length
       int y= rand.nextInt(52);
       t=hand[xx];
       hand[xx]=deck[y];
       deck[y]=t;
   }**/
    for (int z=0; z<10000; z++){//run loop 10,000 times
    int t=0;
   for (int xx=0; xx<hand.length; xx++){ //run while i is less than hand length
       int y= rand.nextInt(52);
       t=hand[xx];
       hand[xx]=deck[y];
       deck[y]=t;
   }
        for (int i=0; i<hand.length; i++){//run loop while i<hand length
            for(int x=i+1; x<hand.length; x++){// run loop while x< hand length
                if((hand[i]==0 || hand[i]==13 || hand[i]==26 || hand[i]==39)&& hand[i]==hand[x]&& i!=x){
                    a++;
                    //rank[0]=a;
                }
                if((hand[i]==1 || hand[i]==14 || hand[i]==27 || hand[i]==40)&& hand[i]==hand[x]&& i!=x){
                    b++;
                    //rank[1]=b;
                }
                if((hand[i]==2 || hand[i]==15 || hand[i]==28 || hand[i]==41)&& hand[i]==hand[x]&& i!=x){
                    c++;
                    //rank[2]=c;
                }
                 if((hand[i]==3 || hand[i]==16 || hand[i]==29 || hand[i]==42)&& hand[i]==hand[x]&& i!=x){
                    d++;
                    //rank[3]=d;
                }
                 if((hand[i]==4 || hand[i]==17 || hand[i]==30 || hand[i]==43)&& hand[i]==hand[x]&& i!=x){
                    e++;
                    //rank[4]=e;
                }
                 if((hand[i]==5 || hand[i]==18 || hand[i]==31 || hand[i]==44)&& hand[i]==hand[x]&& i!=x){
                    f++;
                    //rank[5]=f;
                }
                 if((hand[i]==6 || hand[i]==19 || hand[i]==32 || hand[i]==45)&& hand[i]==hand[x]&& i!=x){
                    g++;
                   // rank[6]=g;
                }
                 if((hand[i]==7 || hand[i]==20 || hand[i]==33 || hand[i]==46)&& hand[i]==hand[x]&& i!=x){
                    h++;
                    //rank[7]=h;
                }
                 if((hand[i]==8 || hand[i]==21 || hand[i]==34 || hand[i]==47)&& hand[i]==hand[x]&& i!=x){
                    r++;
                    //rank[8]=r;
                }
                 if((hand[i]==9 || hand[i]==22 || hand[i]==35 || hand[i]==48)&& hand[i]==hand[x]&& i!=x){
                    j++;
                    //rank[9]=j;
                }
                if((hand[i]==10 || hand[i]==23 || hand[i]==36 || hand[i]==49)&& hand[i]==hand[x]&& i!=x){
                    k++;
                    //rank[10]=k;
                }
                if((hand[i]==11|| hand[i]==24 || hand[i]==37|| hand[i]==50)&& hand[i]==hand[x]&& i!=x){
                    l++;
                    //rank[11]=l;
                }
                 if((hand[i]==12 || hand[i]==25 || hand[i]==38 || hand[i]==51)&& hand[i]==hand[x]&& i!=x){
                    m++;
                    //rank[12]=m;
                }
                else{
                    n++;
                }
            }
        }
        if (a==1){
            aa++;
            rank[0]=aa;
        }
        if (b==1){
            bb++;
            rank[1]=bb;
        }
        if (c==1){
            cc++;
            rank[2]=cc;
        }
        if (d==1){
            dd++;
            rank[3]=dd;
        }
        if (e==1){
            ee++;
            rank[4]=ee;
        }
        if (f==1){
            ff++;
            rank[5]=ff;
        }
        if (g==1){
            gg++;
            rank[6]=gg;
        }
        if (h==1){
            hh++;
            rank[7]=hh;
        }
        if (r==1){
            rr++;
            rank[8]=r;
        }
        if (j==1){
            jj++;
            rank[9]=jj;
        }
        if (k==1){
            kk++;
            rank[10]=kk;
        }
        if (l==1){
            ll++;
            rank[11]=ll;
        }
        if (m==1){
            mm++;
            rank[12]=mm;
        }
        
      }
      String [] rank1={"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
        for (int p=0; p<rank.length; p++){
            System.out.println( rank1[p] + " " +rank[p]);
        }
    System.out.println("------------------");
    System.out.println("total not exactly one pair:" +n);
}
}

