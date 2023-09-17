import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SlidingWindow {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0, i = 0, j = 0;
        //HashSet<Integer> sh = new HashSet<Integer>();
        char[] chars = s.toCharArray();
        int len = chars.length;
        while (i + j < len){
            List<Character> sh = new ArrayList<>();
            j = 0;
            while((!sh.contains(chars[i + j])) && (i + j < len)){
                sh.add(chars[i + j]);
                j++;
                ans = j > ans ? j : ans;
            }
            if(i + j >= len){
                return ans;
            }
            i = sh.indexOf(chars[i + j]) + 1;
        }
        return ans;
    }
}
