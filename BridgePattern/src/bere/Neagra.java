package bere;

public class Neagra implements Productie{
	
	private final String tipBere;
	
	Neagra(){
		this.tipBere = "Neagra";
		
	}

	@Override
	public String tip() {
		// TODO Auto-generated method stub
		return tipBere;
	}

	@Override
	public void Produ() {
		// TODO Auto-generated method stub
		System.out.println("Producem bere neagra");
		
	}

}
