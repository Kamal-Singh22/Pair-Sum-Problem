import java.util.HashMap;

public class PairSum {
    public static int[] findPair(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return null; // No pair found
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = findPair(arr, target);
        if (result != null) {
            System.out.println("Pair found at indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No pair found.");
        }
    }
}
