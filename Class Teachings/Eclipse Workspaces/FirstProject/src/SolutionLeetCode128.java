import java.util.HashSet;

public class SolutionLeetCode128 {

	public int longestConsecutive(int[] nums) {
	        
	       HashSet<Integer> hs = new HashSet<>();
	       
	       for(int i=0;i<nums.length;i++)
	       hs.add(nums[i]);
	       int count=0,answer=0;
	       for(int x:nums)
	       {
	        if(!hs.contains(x))
	        {
	        	int i=x;
	        	while(hs.contains(i+1))
	        	{
	        		count++;
	        	}
	        }
	        Math.max(answer, count);
	       } 
	    }

}
