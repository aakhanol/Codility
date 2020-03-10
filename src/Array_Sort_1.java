import java.util.Arrays;

public class Array_Sort_1 {

    public static int Solution(int[] arr){

        Arrays.sort(arr);
        int count =0;

        while (count <arr.length && arr[count]<=0) ++count;

        if(count == arr.length) return 1;
        if(arr[count] !=1) return 1;
       // while()



        return 0;
    }

}
