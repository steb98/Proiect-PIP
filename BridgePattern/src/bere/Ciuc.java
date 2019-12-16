package bere;

public class Ciuc extends ProducatorBere{
	
	private final Productie productie;
	private final String numeBere;
	
	Ciuc(Productie p,String nume){
		super(p,nume);
		this.productie=p;
		this.numeBere=nume;
	}

	@Override
	public void distilare() {
		// TODO Auto-generated method stub
		System.out.println("Distilare pt "+productie.tip());
		
	}

	@Override
	public void imbuteliere() {
		// TODO Auto-generated method stub
		System.out.println("Se imbuteliaza "+productie.tip()+" conform "+this.numeBere);
		
	}

}
