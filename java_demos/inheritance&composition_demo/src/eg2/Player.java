package eg2;

public class Player extends Person {

	// private String teamName;
	private int ranking;
	private Team team;

	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String name, int ranking, Team team) {
		super(id, name);
		this.ranking = ranking;
		this.team = team;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public void printPlayer() {
		System.out.println("Printing Player Details");
		printPerson();
		System.out.println("Ranking = " + ranking);
		// System.out.println("TeamName = "+teamName);
		team.printTeam();

	}

}
