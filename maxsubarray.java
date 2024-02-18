import java.util.Arrays;
//i changed the code

class Solution {
    public int maximumSumSubarray(int K, int[] Arr, int N) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int mx = Integer.MIN_VALUE;
        
        while (j < N) {
            sum += Arr[j]; // accumulate sum
            
            if (j - i + 1 < K) {
                j++; // expand window until it reaches size K
            } else if (j - i + 1 == K) {
                mx = Math.max(mx, sum); // update maximum sum
                sum -= Arr[i]; // remove leftmost element from the window
                i++; // slide window to the right
                j++; // move to the next element
            }
        }
        return mx;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int K = 3;
        int[] Arr = {2, 1, 5, 1, 3, 2};
        int N = Arr.length;
        System.out.println(solution.maximumSumSubarray(K, Arr, N)); // Output: 9
    }
}
