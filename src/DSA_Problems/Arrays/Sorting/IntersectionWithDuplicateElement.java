package DSA_Problems.Arrays.Sorting;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class IntersectionWithDuplicateElement {

    // Function to find intersection of two arrays
    static List<Integer> intersect(int[] a, int[] b) {

        // Put all elements of a[] in as
        HashSet<Integer> as = new HashSet<>();
        for (int num : a) {
            as.add(num);
        }

        HashSet<Integer> rs = new HashSet<>();
        List<Integer> res = new ArrayList<>();

        // Traverse through b[]
        for (int num : b) {

            // If the element is in as and not yet in rs
            if (as.contains(num) && !rs.contains(num)) {
                rs.add(num);
                res.add(num);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 3,1,2,2};
        System.out.println(intersect(a,b));
    }
}

