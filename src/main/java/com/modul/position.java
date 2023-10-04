package com.modul;

import java.io.Serializable;

public class position implements Serializable {
	
	private double latitude;//cordoone x
	private double longitude;//y
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLangitude() {
		return longitude;
	}
	public void setLangitude(double langitude) {
		this.longitude = langitude;
	}
	public position(double latitude, double langitude) {
		super();
		this.latitude = latitude;
		this.longitude = langitude;
	}
	

}
