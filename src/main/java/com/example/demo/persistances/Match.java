package com.example.demo.persistances;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_match")
public class Match {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "match_id")
	private Long matchId;
	@Column(name = "user1_id")
	private Long user1Id;
	@Column(name = "user2_id")
	private Long user2Id;
	@Column(name = "match_start_time")
	private Timestamp matchStartTime;

	public Long getMatchId() {
		return matchId;
	}

	public void setMatchId(Long matchId) {
		this.matchId = matchId;
	}

	public Long getUser1Id() {
		return user1Id;
	}

	public void setUser1Id(Long user1Id) {
		this.user1Id = user1Id;
	}

	public Long getUser2Id() {
		return user2Id;
	}

	public void setUser2Id(Long user2Id) {
		this.user2Id = user2Id;
	}

	public Timestamp getMatchStartTime() {
		return matchStartTime;
	}

	public void setMatchStartTime(Timestamp matchStartTime) {
		this.matchStartTime = matchStartTime;
	}

	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", user1Id=" + user1Id + ", user2Id=" + user2Id + ", matchStartTime="
				+ matchStartTime + "]";
	}

}
