package net.agent;

public class AgentAData {

	public static void main(String[] args) {
		
		Agent a=new Agent();
		a.setAid(101);
		a.setAname("Atish");
		a.setAdept("Special Agent");
		a.setAcountry("CHINA");
		
		System.out.println(a.getAid()+" "+a.getAname()+" "+a.getAdept()+" "+a.getCountry());

	}

}
