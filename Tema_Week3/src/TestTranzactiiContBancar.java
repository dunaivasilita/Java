
public class TestTranzactiiContBancar {

	public static void main(String[] args) {

		TranzactieExtragereNumerar extragereBani = new TranzactieExtragereNumerar();
		extragereBani.ExtragereNumerar(100);
		System.out.println("Suma extrasa "+extragereBani.ExtragereNumerar());
		
		TranzactieAdaugareInCont adaugareBani = new TranzactieAdaugareInCont();
		adaugareBani.AdaugareNumerar(100);
		System.out.println("Suma adaugata "+adaugareBani.AdaugareNumerar());

	}

}
