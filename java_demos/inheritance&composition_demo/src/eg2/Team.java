package eg2;

public class Team {

	private int tid;
	private String teamName;
	private String teamOrigin;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamOrigin() {
		return teamOrigin;
	}

	public void setTeamOrigin(String teamOrigin) {
		this.teamOrigin = teamOrigin;
	}

	public Team(int tid, String teamName, String teamOrigin) {
		super();
		this.tid = tid;
		this.teamName = teamName;
		this.teamOrigin = teamOrigin;
	}
	public void printTeam() {
		System.out.println("Team Details");
		System.out.println("Tid = "+tid);
		System.out.println("Team Name = "+teamName);
		System.out.println("Team Origin = "+teamOrigin);
	}
}
