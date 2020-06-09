package iMESContest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class G {
    public static void main(String[] args) {
        G a = new G();
        System.out.println(a.threeSum(new int[]{-1,0,1,2,-1,-4}));;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if (nums == null || len < 3) return res;
        Arrays.sort(nums);
//        else if(nums.length==3&&nums[0]==0){
//            if(nums[0]+nums[1]+nums[2]==0) res.add(Arrays.asList(0,0,0));
//        }
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1;
            int r = len - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (nums[i] + nums[l] + nums[r] == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                } else if (sum < 0) l++;
                else if (sum > 0) r--;
            }
        }
        return res;
    }
}
