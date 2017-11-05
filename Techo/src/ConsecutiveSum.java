
public class ConsecutiveSum {

	public static void main(String[] args) {
		consum(125);
	}

	public static void consum(int num){
		int mid=(num+1)/2;
		int count=0;
		int first=1;
		int sum =0;

		while(first<mid){
			for(int i=first;i<=mid;i++){
				sum=sum+i;

				if(sum==num){
					for(int j=first;j<=i;j++){
						System.out.print(j+" ");

					}
					count++;
					break;
				}

				if(sum>num)
					break;

			}

			sum=0;
			first++;
		}

		System.out.println(count);
	}
}
