package hash;

import org.junit.Test;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs){
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            List<String> list = map.getOrDefault(s, new ArrayList<String>());
            list.add(str);
            map.put(s,list);
        }
        return new ArrayList<List<String>>(map.values());
    }
    @Test
    public void longestConsecutive(){
        long ans = 1;
        Integer[] ints = new Integer[]{1,5,6,3,2,4,100,10,};
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i : ints){
            hashSet.add(i);
        }
        for(int currentNum : hashSet){
            if(hashSet.contains(currentNum-1)){
                continue;
            }else{
                int len = 1;
                while(hashSet.contains(currentNum+len)){
                    len++;
                }
                ans = len > ans?len:ans;
            }
        }
        System.out.println(ans);
    }


}

