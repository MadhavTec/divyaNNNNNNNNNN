import java.util.Arrays;

public class TwoCircles {

	
	public static void main(String[] args) {
		String[] s={"12","0","21","14","0","23"};
		
		String[] s2={"35","0","13","10","0","38"};
		
		String[] s3={"0","26","8","0","9","25"};
		
		
		int s1[]={0,45,8,0,94,9};
		String s1s[]=Arrays.stream(s1)
				.mapToObj(String::valueOf)
				.toArray(String[]::new);
		
		
		String[] s4={"0","5","9","0","9","7"};
		String[] s5={"0","15","11","0","20","16"};
		String[] s6={"26","0","10","39","0","23"};
		String[] s7={"37","0","5","30","0","11"};
		String[] s8={"41","0","0","28","0","13"};
		
		
		circles(s);
		circles(s1s);
		circles(s2);
		circles(s3);
		
		System.out.println("----------------------------");
		
		circles(s4);
		circles(s5);
		circles(s6);
		circles(s7);
		circles(s8);
		
		
	}
	static String circles(String[] info){
		
			int x=Math.abs(Integer.valueOf(info[0].toString())-Integer.valueOf(info[3].toString()));
			int y=Math.abs(Integer.valueOf(info[1].toString())-Integer.valueOf(info[4].toString()));
		
			int radiusdif=Math.abs(Integer.valueOf(info[2].toString())-Integer.valueOf(info[5].toString()));
		
			
			int radius1=Integer.valueOf(info[2].toString());
			int radius2=Integer.valueOf(info[5].toString());
			
			double distance = Math.pow((x*x+y*y),0.5);
			
			if(x==0&&y==0)
				System.out.println("Concentric");
			
			else if(distance==radiusdif)
				System.out.println("Touching");
			else if(distance>(radius1+radius2))
				System.out.println("Disjoint-Outside");
			else if(distance<(radius1+radius2))
				System.out.println("Intersecting");
			else
				System.out.println("Disjoint-Inside");
			
				
		return null;
		
	}
}
