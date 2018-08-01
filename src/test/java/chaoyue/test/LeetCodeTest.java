package chaoyue.test;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class LeetCodeTest {

    @Test
    public void test1() {
        // 一个序列中最长的斐波那契数列的长度
        int[] intArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(lenLongestFibSubseq(intArr));
    }

    @Test
    public void test2() {
        // 二进制数中两个1之间0的最大个数
        System.out.println(Integer.toBinaryString(22));
        int[] intArr = new int[]{1, 0, 0, 1, 1, 0};
        int maxCount = 0;
        for (int i = 0; i < intArr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < intArr.length; j++) {
                int num = intArr[i];
                if (num == 0) {
                    break;
                }
                if (num == 1 && intArr[j] == 0) {
                    count++;
                } else if (intArr[j] == 1) {
                    break;
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        System.out.println(maxCount);
    }

    private int lenLongestFibSubseq(int[] A) {
        int N = A.length;
        Set<Integer> S = new HashSet();
        for (int x : A) {
            S.add(x);
        }

        int ans = 0;
        for (int i = 0; i < N; ++i)
            for (int j = i + 1; j < N; ++j) {
                /* With the starting pair (A[i], A[j]),
                 * y represents the future expected value in
                 * the fibonacci subsequence, and x represents
                 * the most current value found. */
                int x = A[j], y = A[i] + A[j];
                int length = 2;
                while (S.contains(y)) {
                    // x, y -> y, x+y
                    int tmp = y;
                    y += x;
                    x = tmp;
                    ans = Math.max(ans, ++length);
                }
            }

        return ans >= 3 ? ans : 0;
    }
}
