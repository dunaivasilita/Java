
public class Fibonaci_3 {

	public static void main(String[] args) {
		int numarFebonaci = 20;
        int[] febonaci = new int[numarFebonaci];
        febonaci[0] = 1;
        febonaci[1] = 1;
        for(int i=2; i < numarFebonaci; i++){
        	febonaci[i] = febonaci[i-1] + febonaci[i-2];
        }
        int suma=0;
        double media =0.0;
        
        for(int i=0; i< numarFebonaci; i++){
        	
        			suma=suma+febonaci[i];
        			if(i==0) {
        				media=0;
        			}else media=suma/20;
                System.out.print(febonaci[i] + " " );
               
                
        }

 System.out.println( "\nMedia este de: " +media);
	}

}
