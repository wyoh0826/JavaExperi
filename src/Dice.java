import java.util.Random;

public class Dice {

	public static void main(String[] args){
		
		Random rand = new Random();
		
		for(int skill = 2; skill <= 10; skill++){
			int[] count = new int[13];
			int num = 10000000;
			
			for(int i = 0; i < 13; i++){
				count[i] = 0;
			}
			
			for(int i = 0; i < num; i++){
				
				int d0 = 0;
				int d1 = 0;
				for(int j = 0;j < skill; j++){
					int d = 1+rand.nextInt(6);
					if(d > d0) d0 = d;
					else if(d > d1) d1 = d;
				}
				int x = d0+d1;
				count[x] = count[x]+1;
			}
			for(int i = 1; i < 13; i++){
				System.out.print((double)count[i]/num+" ");
			}
			System.out.println();
		}
	}
}
