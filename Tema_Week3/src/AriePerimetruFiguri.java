public class AriePerimetruFiguri {
	
private double lungimeDreptunghi, latimeDreptunghi;
private double razaCerc;
public   double pi=3.14;
private double cateta1, cateta2, ipotenuza;
private double laturaPatrat;
	
	public void Dreptunghi(double lungimeDreptunghi, double latimeDreptunghi){
	this.lungimeDreptunghi = lungimeDreptunghi;
	this.latimeDreptunghi = latimeDreptunghi;
	}
	public double getLungimeDreptunghi()
	{
	return lungimeDreptunghi;
	}
	public void setLungime(double lungime)
	{
	this.lungimeDreptunghi = lungime;
	}
	public double getLatimeDreptunghi()
	{
	return latimeDreptunghi;
	}
	public void setLatimeDreptunghi(double latime)
	{
	this.latimeDreptunghi = latime;
	}
	public double ariaDreptunghi()
	{
	return lungimeDreptunghi*latimeDreptunghi;
	}
	public double perimetruDreptunghi()
	{
	return 2*(lungimeDreptunghi+latimeDreptunghi);
	}

	
	public void Cerc(double razaCerc) {
		this.razaCerc=razaCerc;
	}
	public double getRazaCerc()
	{
	return razaCerc;
	}
	public void setRazaCerc(double razaCerc)
	{
	this.razaCerc = razaCerc;
	}
	public double ariaCerc() {
		 return pi*Math.pow(razaCerc, 2);
	}
	public double lungimeCerc()
	{
	return 2*pi*razaCerc;
	}
	public void Triunghi(double cateta1, double cateta2, double ipotenuza){
		this.cateta1 = cateta1;
		this.cateta2 = cateta2;
		this.ipotenuza = ipotenuza;
		}
		public double getCateta1()
		{
		return cateta1;
		}
		public void setCateta1(double cateta1)
		{
		this.cateta1 = cateta1;
		}
		public double getCateta2()
		{
		return cateta2;
		}
		public void setCateta2(double cateta2)
		{
		this.cateta2 = cateta2;
		}
		public double getIpotenuza()
		{
		return ipotenuza;
		}
		public void setIpotenuza(double ipotenuza)
		{
		this.ipotenuza = ipotenuza;
		}
		public double ariaTriunghiDreptunghic()
		{
		return (cateta1*cateta2)/2;
		}
		public double perimetruTriunghiDreptunghic()
		{
		return (cateta1+cateta2+ipotenuza);
		}
		public void Patrat(double laturaPatrat)
		{
			this.laturaPatrat=laturaPatrat;
		}
		public double getLaturaPatrat()
		{
		return laturaPatrat;
		}
		public void setLaturaPatrat(double laturaPatrat)
		{
		this.laturaPatrat = laturaPatrat;
		}
		
		public double ariaPatrat()
		{
		return laturaPatrat*laturaPatrat;
		}
		public double perimetruPatrat()
		{
		return 4*laturaPatrat;
		}
	
}
