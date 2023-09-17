import hash.GroupAnagrams;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        TwoPoint twoPoint = new TwoPoint();
//        System.out.println(twoPoint.climbStairs(3));
//        dp dp = new dp();
//        System.out.println(dp.generate(5));
        SlidingWindow slidingWindow = new SlidingWindow();
        System.out.println(slidingWindow.lengthOfLongestSubstring("abcabcabc"));

    }
}