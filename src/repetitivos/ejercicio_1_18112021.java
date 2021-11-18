package repetitivos;

public class ejercicio_1_18112021 {

	public static void main(String[] args) {
		int i = 0;
		while(i<20) {
			i++;
			if(i%10==0 || i%20==0) {
				continue;
			}
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
	}

}