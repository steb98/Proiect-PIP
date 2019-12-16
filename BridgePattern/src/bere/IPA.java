package bere;

public class IPA implements Productie{

private final String tipBere;
	
	IPA(){
		this.tipBere = "IPA";
		
	}

	@Override
	public String tip() {
		// TODO Auto-generated method stub
		return tipBere;
	}

	@Override
	public void Produ() {
		// TODO Auto-generated method stub
		System.out.println("Producem bere IPA");
		
	}

}
