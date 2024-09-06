package bharath;

public class Day3 {

	public static void main(String[] args) {
	int	count=0;
		int num=46;
		for(int i=0;i<num;i++) {
			if(i%2==0) {
				System.out.println("Even number is "+i);
				count++;
				
			}
		}
		System.out.println(count);

	}

}
