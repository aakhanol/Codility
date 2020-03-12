import java.util.*;

public class OddOccurrences_Array {

    public static void main(String[] args) {

        int b = OddOccurrences_Array.oddSolution(new int[]{1, 1, 2, 2,3});
        System.out.println(" Odd Contained " + b);

    }

    public static int oddSolution(int[] arr){
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int count =0;
        int toRet=0;

        for(int a : arr){
            hashSet.add(a);
        }

        for(int h : hashSet){
            for(int b: arr){
                if(h==b){
                    count++;
                }
            }
            if(count==1){
                 toRet =h;
            }
        }
    return toRet;

    }




}

   /* public static Set oddSolution(int[] arr){

        HashMap<Integer,Integer> hastMap = new HashMap<Integer, Integer>();
        HashSet<Integer> hashSet = new HashSet<Integer>();
        HashSet<Integer> oddSet = new HashSet<Integer>();

        for(int k : arr){
            hashSet.add(k);
        }

        for(int i : arr){
            for ( int j =i+1; j<arr.length;j++){
               if(arr[i]==arr[j]){
                   hastMap.put(arr[i],arr[j]);
               }

            }

        }
          System.out.println(" Hashmap" + hastMap);
          System.out.println(" Hashset "+ hashSet);

        for(int h : hashSet){
            if(!hastMap.containsKey(h)){
             oddSet.add(h);
            }
        }
          return oddSet;
    }

}
*/