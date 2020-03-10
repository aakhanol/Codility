import java.util.Arrays;

public class ArraySort_ReturnNextPositive {



    //
    // This is a demo task.
    //
    //Write a function:
    //
    //class Solution { public int solution(int[] A); }
    //
    //that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
    //
    //For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
    //
    //Given A = [1, 2, 3], the function should return 4.
    //
    //Given A = [−1, −3], the function should return 1.
    //
    //Write an efficient algorithm for the following assumptions:
    //
    //N is an integer within the range [1..100,000];
    //each element of array A is an integer within the range [−1,000,000..1,000,000].
    //
    //
    // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    public static void main(String[] args){


                 System.out.println("The last number is "+ ArraySort_ReturnNextPositive.solution( new int[]{10,5}));

    }


        public  static int solution(int[] A) {
            // write your code in Java SE 8

           int count = 1;
            try{

//create a new Empty Array with the same length.



                if(A.length==1 ){
                    if(A[0] <=0 ){
                        return 1;
                    }else if (A[0] ==1){
                        return A[0]+1;
                    } else{
                        return 1;
                    }
                }
                Arrays.sort( A);

                for(int i =0 ; i<A.length; i++){

                    if(A[i] > 0 ){
                        for (int j=i; j<A.length; j++){

                            if(A[j]== count){
                                count++;
                            }else {
                                return count;
                            }




                        }
                    }

                    }





            }catch (Exception e){

            }
           return count;
        }
}

