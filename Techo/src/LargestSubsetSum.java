import java.util.ArrayList;

public class LargestSubsetSum {
public static void main(String[] args) {
	
	int[] k={2,4};
	maxSubsetSum(k);
}

static long[] maxSubsetSum(int[] k){
	ArrayList list=new ArrayList<>();
	int sum=0,before=0;
	for(int i:k){
		before=i-1;
		sum=i+before;
		list.add(sum);
	}
	System.out.println(list);
	return null;
	
}
}
