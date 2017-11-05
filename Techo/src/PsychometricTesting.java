import java.util.ArrayList;

public class PsychometricTesting {
	
	public static void main(String[] args) {
		int[] scores={1,3,5,6,8};
		int[] lowerLimits={2};
		int[] upperLimits={6};
		int queries =1;
		
		ArrayList finalList=new ArrayList<>();
		for(int i=0;i<queries;i++){
			
		
		jobOffers(scores, lowerLimits, upperLimits);
		
		}
		
		
	}

	static int jobOffers(int[] scores,int[] lowerLimits,int[] upperLimits){
		
		ArrayList list=new ArrayList<>();
		for(int i:scores){
			
			for(int j:lowerLimits){
				
				for(int k:upperLimits){
					
					if(i>=j && i<=k){
						list.add(i);
					}
				}
			}
			
		}
		System.out.println(list.size());
		return list.size();
		
	}
	
}
