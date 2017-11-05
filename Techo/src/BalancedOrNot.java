import java.util.ArrayList;
import java.util.List;

public class BalancedOrNot {
	public static void main(String[] args) {

	/*	String[] expressions={"<>","<>><"};
		int[] maxReplacements={1,0};*/
		
		String[] expressions={"<>>>","<>>>>"};
		int[] maxReplacements={2,2};
		balancedOrNot(expressions, maxReplacements);
	}

	static int[] balancedOrNot(String[] expressions,int[] maxReplacements){
		List list=new ArrayList<>();
		int fail=1;
		int maxIndex=0;

		int count=0;
		for(String s:expressions){
			int r=maxReplacements[maxIndex];
				for(int i=count;i<s.length();i++){
					char c = s.charAt(i);

					if(c=='>'){
						if(r==0){
							fail=0;
							break;
						}
						else if(r>0){
						 r--;
						count=i+1;
						}
					}
					if(c=='<'){
						char next=s.charAt(++i);

						if(next=='>'){
							count=i+1;
						}
					}
				}
				maxIndex++;

				count=0;
			list.add(fail);
		}
		System.out.println(list);
		return maxReplacements;
	}
}
