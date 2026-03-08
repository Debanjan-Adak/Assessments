import java.util.*;

public class LeetCode3640 {

	public long maxSumTrionic(int[] nums) {
		HashMap <Integer,Integer> hs = new HashMap<>();
        Map<Long,Long> sum=new HashMap<>();
        int tempSum=0;
        for(int i=0;i<nums.length;i++) {
        	tempSum+=nums[i];
        	sum.put((long)i,(long)tempSum);
        }
        
    }
	public static void main(String[] args) {

	}

}
