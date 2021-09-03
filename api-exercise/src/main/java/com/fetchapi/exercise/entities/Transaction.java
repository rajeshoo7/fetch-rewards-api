package com.fetchapi.exercise.entities;

import java.time.LocalDateTime;

public class Transaction {
	String payer;
	int points;
	LocalDateTime timestamp;

	public Transaction(String name, int points, LocalDateTime date) {
		this.payer = name;
		this.points = points;
		this.timestamp = date;
	}

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public LocalDateTime getDate() {
		return timestamp;
	}

	public void setDate(LocalDateTime date) {
		this.timestamp = date;
	}

}