
public class RestaurantVegetarian extends Restaurant {
	
	double venit;
	double impozit;
	RestaurantVegetarian(int Clienti, float pretMeniu) {
		super(Clienti, pretMeniu);
		
	}
	
	public double CalculeazaVenit() {
	 venit= numarClienti*pretMeniuFix;
		return venit;
	}
    
	public double CalculeazaImpozit() {
		double impozitGeneral;
		double reducereImpozit;
		impozitGeneral=0.2*venit;
		reducereImpozit=0.3*impozitGeneral;
		impozit = impozitGeneral-reducereImpozit;
		return impozit;
	}
	public String toString() {
	      return " Restaurantul Vegetarian are venitul de " + venit+" si plateste impozit = "+ impozit;
	   }
}
