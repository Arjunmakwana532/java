import java.util.Arrays;
import java.util.ArrayList;

public class Reverse {
   
    public static int [] ans(int [] arr1,int [] arr2)
    {
        long num1 = 0;
        long num2 = 0;
        // first iterate through the entire number 
      for(int i = arr1.length - 1; i >= 0; i--)
      {
            num1 = (num1 * 10) + arr1[i];
      }

      for(int j = arr2.length - 1; j >= 0; j--)
      {
        num2 = (num2 * 10) + arr2[j];
      }
      long sum = num1 + num2;
      ArrayList<Integer> number = new ArrayList<>();

        while(sum != 0)
        {
            number.add((int) sum % 10);
            sum/=10;
        }
        int [] finalAns = new int[number.size()];
        for(int i = 0; i < finalAns.length; i++)
        {
            finalAns[i] = number.get(i);
        }
        return finalAns;
    }

    public static void main(String[] args)
    {
            System.out.println(Arrays.toString(ans(new int[] {9,9,9,9,9,9,9},new int []{9,9,9,9})));
    }
    

}
