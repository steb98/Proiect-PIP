package bere;

public abstract class ProducatorBere {
	
	private final Productie productie;
	private final String numeBere;
	
	public ProducatorBere(Productie p,String nume) {
		numeBere=nume;
		productie = p;
	}
	
	public abstract void distilare();
	public abstract void imbuteliere();
	
	public void printDetalii() {
		System.out.println("Bere: "+numeBere+" Productie: "+productie.tip());
	}
}
