
public class TestRestaurant {

	public static void main(String[] args) {
		RestaurantVegetarian vegetarian = new RestaurantVegetarian(10, 40);
		System.out.println("Restaurantul Vegetarian: venitul - "+vegetarian.CalculeazaVenit()+" lei ,impozit -  "+vegetarian.CalculeazaImpozit()+" lei");
		RestaurantFastFoud fastFoud = new RestaurantFastFoud(25,30);
		System.out.println("Restaurantul FastFoud: venitul - "+fastFoud.CalculeazaVenit()+"lei ,impozit - "+fastFoud.CalculeazaImpozit()+" lei");
		
	}

}
