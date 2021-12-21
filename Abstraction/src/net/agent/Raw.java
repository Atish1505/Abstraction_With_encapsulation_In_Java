package net.agent;

public abstract class Raw {
	protected  int aid;
	protected  String aname;
	protected  String adept;
	protected  String acountry;
	
	protected final int getAid() {
		return aid;
	}
	protected final String getAname() {
		return aname;
	}
	protected final String getAdept() {
		return adept;
	}
	protected final String getAcountry() {
		return acountry;
	}
	protected final int setAid(int aid) {
		this.aid = aid;
		return aid;
	}
	protected final String setAname(String aname) {
		this.aname = aname;
		return aname;
	}
	protected final String setAdept(String adept) {
		this.adept = adept;
		return adept;
	}
	protected final String setAcountry(String acountry) {
		this.acountry = acountry;
		return acountry;
	}
	
	
	 

}
