package net.agent;

public final class Agent extends Raw {
	public int aid(int id) {
		return (setAid(id));
			
	}
	public String AgentName(String aname)
	{
		return (setAname(aname));
	}
	public String AgentDept(String adept) {
		return (setAcountry(adept));
	}
	public String AgentCountry(String acountry) {
		return (setAcountry(acountry));
	}
	public int getid() {
		return (getAid());
	}
	public String getName() {
		return (getAname());
	}
	public String getDept() {
		return (getAdept());
	}
	public String getCountry() {
		return (getAcountry());
	}
	
	
	
	

}
