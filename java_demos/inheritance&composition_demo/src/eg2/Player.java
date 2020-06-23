package eg2;

public class Player extends Person {

	private String teamName;
	private int ranking;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String name, String teamName, int ranking) {
		super(id, name);
		this.teamName = teamName;
		this.ranking = ranking;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	
	public void printPlayer() {
		System.out.println("Printing Player Details");
		printPerson();
		System.out.println("TeamName = "+teamName);
		System.out.println("Ranking = "+ranking);
	}
	
}
