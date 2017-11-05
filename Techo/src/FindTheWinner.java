
public class FindTheWinner {
public static void main(String[] args) {
	
	int[] andrea={1,2,3};
	int[] maria={2,1,3};
	String s="odd";
	winner(andrea,maria,s);
}

static String winner(int[] andrea, int[] maria, String s){
	String winner=null;

	int suma=0,summ=0,tempm = 0,tempa=0;
	for(int i=0;i<andrea.length;i++){
		if(s=="even"){
			if(i%2==0){
				suma=tempa+(andrea[i]-maria[i]);
				tempa=suma;
				}	
		}
		else{
			if(i/2!=0){
				suma=tempa+(maria[i]-andrea[i]);
				tempa=suma;
			}
				
		}
		
	}
	
	for(int i=0;i<maria.length;i++){
		if(s=="even"){
			if(i%2==0){
				summ=tempm+(maria[i]-andrea[i]);
				tempm=summ;
				}	
		}
		
		else{
			if(i%2!=0){
				summ=tempm+(maria[i]-andrea[i]);
				tempm=summ;
			}
				
		}
	}
	if(tempm>tempa)
		winner="maria";
	else if(tempm<tempa)
		winner="andrea";
	else if(tempm==tempa)
		winner="tie";
	
	
	System.out.println(winner);
	return winner;


}
}
