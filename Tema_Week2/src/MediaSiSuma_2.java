
public class MediaSiSuma_2 {

	public static void main(String[] args) {
		int variabila1 = 1;
		int variabila2 = 100;
		int suma = 0;
		double media=1;
		
		for(int i=variabila1; i<=variabila2; i++) {
			suma+=i;
			if(i==0) {
				media=0;
			}else media = suma/i;
		}
	   
		
		System.out.println("Suma numerelor de la 1 la 100 -> "+suma );
		System.out.println("Media numerelor de la 1 la 100 ->"+media);
	}

}
