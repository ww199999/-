import org.junit.Test;

public class TwoPoint {

    @Test
    public void moveZeroes(){
        Integer integer = Integer.valueOf(666);
        Integer integer2 = Integer.valueOf(666);
        Integer integer3 = Integer.valueOf(666);
        integer3 = 777;
        String s1 = new String("lfsdkfj");

        System.out.println(s1.intern());
        System.out.println(integer+" "+integer+" "+integer3);
    }

//    @Test
//    public int subarraySum(int[] nums, int k) {
//        int len = nums.length, ans = 0;
//        for(int i = 0; i < len; i++){
//            int sum = 0;
//            for(int j = i; j < len ; j++){
//                sum += nums[j];
//                if(sum == k){
//                    ans++;
//                }
//            }
//        }
//        return ans;
//    }

    @Test
    public void searchInsert() {
        int[] nums = {1,2,3,4,5,6,7};
        int len = nums.length, target = 6;
        int left = 0, right = len-1;
        while(left < right){
            int mid = (left + right)>>1;
            if(nums[mid] >= target){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        if(nums[left] < target){
            left++;
        }
        System.out.println(left);
    }
    public int climbStairs(int n) {
        int[] a ={1, 1};
        for(int i = 2; i <= n; i++){
            a[i%2] = a[(i-1)%2] + a[(i-2)%2];
        }
        return a[n%2];
    }

}
