package com.springjdbc.npjt.modal;

public class Players {

	private int playerId;
	private String playerName;
	private int playerAge;

	public Players(int playerId, String playerName, int playerAge) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerAge = playerAge;
	}

	public Players() {
		super();
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerAge() {
		return playerAge;
	}

	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}

	@Override
	public String toString() {
		return "Players [playerId=" + playerId + ", playerName=" + playerName + ", playerAge=" + playerAge + "]";
	}

}
