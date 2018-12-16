
public class TranzactieAdaugareInCont {
	 int sumaDoritaAdaugare;
	 int sumaCont = 2000;
	public void AdaugareNumerar(int sumaDoritaAdaugare) {
		this.sumaDoritaAdaugare= sumaDoritaAdaugare;
		
	}
	public int getSumaDoritaAdaugare()
	{
	return sumaDoritaAdaugare;
	}
	public void setSumaDoritaAdaugare(int sumaDoritaAdaugare)
	{
	this.sumaDoritaAdaugare = sumaDoritaAdaugare;
	}
	public String AdaugareNumerar() {
		int sumaNoua= sumaCont+sumaDoritaAdaugare;
		
		return sumaDoritaAdaugare+ " lei. In cont sunt "+sumaNoua+ " lei.";
	}

}
