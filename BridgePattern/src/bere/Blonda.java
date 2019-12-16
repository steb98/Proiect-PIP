package bere;

public class Blonda implements Productie{

private final String tipBere;
	
	Blonda(){
		this.tipBere = "Blonda";
		
	}

	@Override
	public String tip() {
		// TODO Auto-generated method stub
		return tipBere;
	}

	@Override
	public void Produ() {
		// TODO Auto-generated method stub
		System.out.println("Producem bere blonda");
		
	}

}
