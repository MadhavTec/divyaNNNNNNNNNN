import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BuyingShowTickets {
	public static void main(String[] args) {
		int[] tickets={5,5,2,3};
		//int[] tickets={1,1,1,1};
		int p=3;
		waitingTime(tickets, p);


	}

	static long waitingTime(int[] tickets,int p){

		List<Integer> list = Arrays.stream(tickets).boxed().collect(Collectors.toList());
		int time=0;
		boolean found=false;

		while(!found)	{
			for(int i:list){

				list.set(list.indexOf(i), i-1);

				if(list.get(p)==0){
					found=true;
					break;

				}
				time++;

			}
			System.out.println(list);


		}
		System.out.println(time);
		return time ;
	}
}
