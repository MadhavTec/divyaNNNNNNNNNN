
public class InTheFuture {

	
	public static void main(String[] args) {
		
		minNum(4,5,1);
		
	}
	
	static int minNum(int A,int K, int P){
		
		int day=1;
		int aprob=A;
		int newA=0;
		
		
		while(day>0){
			newA=aprob+P;
			if(K>newA){
				System.out.println(day);
				break;
			}
			else{
				day++;
				System.out.println(day);
				break;
			}
			
		}
			
		return day;
		
	}
}
