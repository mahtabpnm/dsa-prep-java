package arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class SubarrayFromBToC {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = B ; i <= C ; i++){
            ans.add(A.get(i));
        }
        return ans;
    }


    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int B = 2;
        int C = 4;

        SubarrayFromBToC obj = new SubarrayFromBToC();
        ArrayList<Integer> result = obj.solve(A, B, C);

        System.out.println(result);
    }
}


