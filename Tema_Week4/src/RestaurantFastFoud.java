
public class RestaurantFastFoud extends Restaurant {
	
	double venit;
	double impozit;
	
	public RestaurantFastFoud(int Clienti, float pretMeniu) {
		super(Clienti, pretMeniu);
		
	}
	public double CalculeazaVenit() {
	 venit= numarClienti*pretMeniuFix;
		return venit;
	}
    
	public double CalculeazaImpozit() {
		
		impozit=0.2*venit;
		
		
		return impozit;
	}
	public String toString() {
	      return " Restaurantul Fast Foud are venitul de " + venit+" si plateste impozit = "+ impozit;
	   }
}
