package application;

public class Vote {

	private String voterName;
	private String candidate;
	
	public Vote(String name, String candidate) {
		this.candidate = candidate;
		this.voterName = name;
	}
	
	public void setVoter(String name) {
		this.voterName = name;
	}
	
	public String getVoter() {
		return voterName;
	}
	
	public void setCandidate(String candidate) {
		this.candidate = candidate;
	}
	
	public String getCandidate() {
		return candidate;
	}
}
