package bere;

public class Bruna implements Productie {

private final String tipBere;
	
	Bruna(){
		this.tipBere = "Bruna";
		
	}

	@Override
	public String tip() {
		// TODO Auto-generated method stub
		return tipBere;
	}

	@Override
	public void Produ() {
		// TODO Auto-generated method stub
		System.out.println("Producem bere bruna");
		
	}

}
