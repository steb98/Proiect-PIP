package bere;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Productie p1 =  new Neagra();
		ProducatorBere b1 = new Silva(p1,"Silva neagra");
		b1.distilare();
		b1.imbuteliere();
		b1.printDetalii();
		
		
		Productie p2 = new Blonda();
		ProducatorBere b2 = new Ciuc(p2,"Ciuc Blonda");
		
		b2.distilare();
		b2.imbuteliere();
		b2.printDetalii();
		

	}

}
