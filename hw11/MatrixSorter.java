import java.util.Scanner;
import java.util.Random;
/*************************
 * Kelli Barber
 * hw11
 * 12/1/2014
 * 
 * This program will sort 
 * and search a 3D array
 * ************************/
 
 public class MatrixSorter{
     //main method needed for all programs
  public static void main(String arg[]){ 
    int mat3d[][][]; //initialize 3d array
    mat3d=buildMat3d(); // call method to build array
    show(mat3d); //call method to show the array
    System.out.println("The smallest entry in the 3D matrix is "+
    findMin(mat3d)); //call method to find the min
    System.out.println("After sorting the 3rd matrix we get"); //tell user the min
    sort(mat3d[2]); //call sort method to sort third slab
    show(mat3d); //call show method
   }

//method to assign values to array
public static int[][][] buildMat3d(){//int[][][] threeDArray){
    int[][][] threeDArray=new int[3][0][0]; //initialize array
    Random rand =new Random(); //call randdom class
    for(int m=0; m<threeDArray.length; m++){ //run while less than length of array
         threeDArray[m]= new int[(m*2)+3][]; //make column m*2+3 in length
         for (int n=0; n<(m*2)+3; n++){ //run while n is less than m*2+3
            threeDArray[m][n]=new int[m+n+1]; //make row m+n+1
            for(int p=0;p<m+n+1;p++){ //run while p is less than m+n+1
                threeDArray[m][n][p]=(int)((Math.random()*99)+1); //fill array with random numbers
            }
         }
    }
    return threeDArray;//return the array  to main method
}

public static void show(int[][][] array){//method to print the array
    for(int m=0; m<array.length; m++){ //run whilem is less than array length
        System.out.println("-----------------Slab " + (1+m)); //print out slab number
         for(int i=0; i<array[m].length; i++){ //run while i is less than the column
            for(int p=0;p<array[m][i].length;p++){ //run while p is less than row length
                System.out.print(array[m][i][p] + " "); //print out the slab, column and row
            }
         System.out.println(); //go to the next line
         }
    }
}
public static int findMin(int[][][] array1){//method to find min of 3d array
    int min=99; //set min as highest number
    for(int m=0; m<array1.length; m++){//run while m is less than array length
        for (int n=0; n<(m*2)+3; n++){ //run while n is less than row length
            for(int p=0;p<m+n+1;p++){ //run while p is less than column length
                for(int r=p+1; r<m+n+1; r++){//run while r is less than row length-r is p+1
                    if(array1[m][n][p]<min){ // check for smaller value
                        min=array1[m][n][p]; //make mmin smaller value
                    }
                }
            }
        }
    }
    return min; //return min to main method
}

public static void sort(int [][] array2){ //method to sort the third slab
   for(int m=0; m<3; m++){ //run while m is less than three
    for (int n=0; n<(m*2)+3; n++){ //run while n is less than row
        for(int p=0;p<m+n+1;p++){ //run while p is less than column
            for(int r=p+1; r<m+n+1; r++){//run while r is less than column, r is p+1
                if(array2[n][r]<array2[n][p]){//if first number in first row is smaller than first number in second row
                    int temp=array2[n][p]; //set temp equal to first row
                    array2[n][p]= array2[n][r]; //swap first and second row
                    array2[n][r]=temp; //set second row equal to first row
                }
            }
        }
    }
    }
    for(int i=1; i< array2.length; i++){
        int [] temp = array2[i];
        int p= array2[i][0];
        int row=i;
        while(row>0&&array2[row-1][0]>p){
            array2[row]=array2[row-1];
            row--;
        }
        array2[row]=temp;
    }
}
}