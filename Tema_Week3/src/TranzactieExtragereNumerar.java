
public class TranzactieExtragereNumerar {
 int sumaCont = 2000;
 int sumaDoritaExtragere;
 int sumaDoritaAdaugare;
	public void ExtragereNumerar(int sumaDoritaExtragere) {
		this.sumaDoritaExtragere= sumaDoritaExtragere;
		
	}
	public int getSumaDoritaExtragere()
	{
	return sumaDoritaExtragere;
	}
	public void setSumaDorita(int sumaDoritaExtragere)
	{
	this.sumaDoritaExtragere = sumaDoritaExtragere;
	}
	public String ExtragereNumerar() {
		if(sumaCont>sumaDoritaExtragere) {
			int sumaRamasa = sumaCont-sumaDoritaExtragere;
		return sumaDoritaExtragere+ " lei. In cont au ramas "+sumaRamasa+" lei.";
	}else 
		return sumaDoritaExtragere+ " nu este sufient credit";
	}
	
	
	
	

}
