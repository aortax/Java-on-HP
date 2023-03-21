import java.util.ArrayList;
import java.util.List;

public class Problem1v3 {
    // Function to merge two arrays
    public static List<Integer> mergeTwoArrays(List<Integer> l, List<Integer> r) {
        // list to store the result
        // after merging l and r
        List<Integer> ret = new ArrayList<>();

        // variables to store the current
        // pointers for l and r
        int lIn = 0, rIn = 0;

        // loop to merge l and r using two pointer
        while (lIn + rIn < l.size() + r.size()) {
            if (lIn != l.size() && (rIn == r.size() || l.get(lIn) < r.get(rIn))) {
                ret.add(l.get(lIn));
                lIn += 1;
            } else {
                ret.add(r.get(rIn));
                rIn += 1;
            }
        }

        return ret;
    }

    // Function to merge all the arrays
    public static List<Integer> mergeArrays(List<List<Integer>> arr) {

        // Loop to make pairs of arrays
        // and merge them
        while (arr.size() != 1) {

            // 2D-array to store the results
            // of a step temporarily
            List<List<Integer>> arrS = new ArrayList<>();

            for (int i = 0; i < arr.size(); i += 2) {
                if (i == arr.size() - 1) {
                    arrS.add(arr.get(i));
                } else {
                    arrS.add(mergeTwoArrays(arr.get(i), arr.get(i + 1)));
                }
            }

            arr = arrS;
        }

        // Returning the required output array
        return arr.get(0);
    }

    public static void main(String[] args) {
        // Input arrays
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(List.of(3, 13));
        arr.add(List.of(8, 10, 11));
        arr.add(List.of(9, 15));

        // Merged sorted array
        List<Integer> output = mergeArrays(arr);

        for (int i = 0; i < output.size(); i++) {
            System.out.print(output.get(i) + " ");
        }
    }
}
