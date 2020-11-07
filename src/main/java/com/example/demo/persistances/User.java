package com.example.demo.persistances;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tbl_user")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long userId;
	@Column(name = "name")
	private String name;
	@Column(name = "game_played")
	private Integer gamePlayed;
	@Column(name = "game_won")
	private Integer gameWon;
	@Column(name = "last_game_id")
	private Long lastGameId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getGamePlayed() {
		return gamePlayed;
	}

	public void setGamePlayed(Integer gamePlayed) {
		this.gamePlayed = gamePlayed;
	}

	public Integer getGameWon() {
		return gameWon;
	}

	public void setGameWon(Integer gameWon) {
		this.gameWon = gameWon;
	}

	public Long getLastGameId() {
		return lastGameId;
	}

	public void setLastGameId(Long lastGameId) {
		this.lastGameId = lastGameId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", gamePlayed=" + gamePlayed + ", gameWon=" + gameWon
				+ ", lastGameId=" + lastGameId + ", getUserId()=" + getUserId() + ", getName()=" + getName()
				+ ", getGamePlayed()=" + getGamePlayed() + ", getGameWon()=" + getGameWon() + ", getLastGameId()="
				+ getLastGameId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
