package repetitivos;

public class ejercicios_clase_18112021 {

	public static void main(String[] args) {
		int i = 0;
		while(i<10) {
			i++;
			if(i%4==0 || i%8==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
