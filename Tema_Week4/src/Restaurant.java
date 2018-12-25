
public class Restaurant{
	int numarClienti;
	float pretMeniuFix;
	
     Restaurant(int Clienti, float pretMeniu) {
		this.numarClienti= Clienti;
		this.pretMeniuFix=pretMeniu;
	}
	 public int getnumarClienti() {
	      return numarClienti;
	   }

	 public void setnumarClienti(int Clienti ) {
		 numarClienti = Clienti;
	   }
	 public float getpretMeniuFix() {
	      return pretMeniuFix;
	   }

	 public void setpretMeniuFix(float pretMeniu) {
		 pretMeniuFix = pretMeniu;
	   }
	  public String toString() {
		      return numarClienti + " ," + pretMeniuFix;
		   }


}
