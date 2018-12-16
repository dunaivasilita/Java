
public class TestAriePerimetru {

	public static void main(String[] args) {
		
		AriePerimetruFiguri patrat = new AriePerimetruFiguri();
		patrat.Patrat(3);
		patrat.ariaPatrat();
		patrat.perimetruPatrat();
		AriePerimetruFiguri triunghi = new AriePerimetruFiguri();
		triunghi.Triunghi(2, 4, 6);
		triunghi.ariaTriunghiDreptunghic();
		triunghi.perimetruTriunghiDreptunghic();
		AriePerimetruFiguri dreptunghi = new AriePerimetruFiguri();
		dreptunghi.Dreptunghi(4, 5);
		dreptunghi.ariaDreptunghi();
		dreptunghi.perimetruDreptunghi();
		AriePerimetruFiguri cerc = new AriePerimetruFiguri();
		cerc.Cerc(2);
		cerc.ariaCerc();
		cerc.lungimeCerc();
	
		if(patrat.ariaPatrat()>Math.max(dreptunghi.ariaDreptunghi(),Math.max(triunghi.ariaTriunghiDreptunghic(), cerc.ariaCerc())) ) {
			System.out.println("Figura cu cea mai mare suprafata este patratul cu latura="+patrat.getLaturaPatrat());
		}if(dreptunghi.ariaDreptunghi()>Math.max(patrat.ariaPatrat(),Math.max(triunghi.ariaTriunghiDreptunghic(), cerc.ariaCerc()))) {
			System.out.println("Figura cu cea mai mare suprafata este dreptunghiul cu laturile:  "+dreptunghi.getLatimeDreptunghi()+" ,"+dreptunghi.getLungimeDreptunghi());
		}if(triunghi.ariaTriunghiDreptunghic()>Math.max(patrat.ariaPatrat(),Math.max(dreptunghi.ariaDreptunghi(), cerc.ariaCerc()))) {
			System.out.println("Figura cu cea mai mare suprafata este triunghiul cu laturile: "+triunghi.getCateta1()+", "+triunghi.getCateta2()+", "+triunghi.getIpotenuza());
		}if(cerc.ariaCerc()>Math.max(patrat.ariaPatrat(),Math.max(dreptunghi.ariaDreptunghi(), triunghi.ariaTriunghiDreptunghic()))) {
			System.out.println("Figura cu cea mai mare suprafata este cercul cu raza="+cerc.getRazaCerc());
		}
		
			
			
			
		//double max= Math.max(Math.max(patrat.ariaPatrat(),dreptunghi.ariaDreptunghi()),Math.max(triunghi.ariaTriunghiDreptunghic(), cerc.ariaCerc()));
		//System.out.println(max);
	

		
	}

}
