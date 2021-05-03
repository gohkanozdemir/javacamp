package odev3.model;

public class Game {
	private int id;
	private String gameName;
	private double gameUnitPrice;

	public Game() {
	}

	/**
	 * @param id
	 * @param gameName
	 * @param gameUnitPrice
	 */
	public Game(int id, String gameName, double gameUnitPrice) {
		this.id = id;
		this.gameName = gameName;
		this.gameUnitPrice = gameUnitPrice;
	}

	/**
	 * @param gameName
	 * @param gameUnitPrice
	 */
	public Game(String gameName, double gameUnitPrice) {
		this.gameName = gameName;
		this.gameUnitPrice = gameUnitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getGameUnitPrice() {
		return gameUnitPrice;
	}

	public void setGameUnitPrice(double gameUnitPrice) {
		this.gameUnitPrice = gameUnitPrice;
	}

}
