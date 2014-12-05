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
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
    findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
   }


public static int[][][] buildMat3d(){//int[][][] threeDArray){
    int[][][] threeDArray=new int[3][0][0];
    Random rand =new Random();
    for(int m=0; m<threeDArray.length; m++){
         threeDArray[m]= new int[(m*2)+3][];
         for (int n=0; n<(m*2)+3; n++){
            threeDArray[m][n]=new int[m+n+1];
            for(int p=0;p<m+n+1;p++){
                threeDArray[m][n][p]=(int)((Math.random()*99)+1);
            }
         }
    }
    return threeDArray;
}

public static void show(int[][][] array){
    for(int m=0; m<array.length; m++){
        System.out.println("-----------------Slab " + (1+m));
         for(int i=0; i<array[m].length; i++){
            for(int p=0;p<array[m][i].length;p++){
                System.out.print(array[m][i][p] + " ");
            }
         System.out.println();
         }
    }
}
public static int findMin(int[][][] array1){
    int min=99;
    for(int m=0; m<array1.length; m++){
        for (int n=0; n<(m*2)+3; n++){
            for(int p=0;p<m+n+1;p++){
                for(int r=p+1; r<m+n+1; r++){
                    if(array1[m][n][p]<min){
                        min=array1[m][n][p];
                    }
                }
            }
        }
    }
    return min;
}

public static void sort(int [][] array2){
    for(int m=0; m<3; m++){
    for (int n=0; n<(m*2)+3; n++){
        for(int p=0;p<m+n+1;p++){
            for(int r=p+1; r<m+n+1; r++){
                if(array2[n][r]<array2[n][p]){
                    int temp=array2[n][p];
                    array2[n][p]= array2[n][r];
                    array2[n][r]=temp;
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