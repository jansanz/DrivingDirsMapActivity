package com.amelie.driving.impl;

import com.amelie.driving.Placemark;
import com.google.android.maps.GeoPoint;

public class PlacemarkImpl implements Placemark
{
	private GeoPoint location;
	private String instructions;
	private String distance;
	
	public void setLocation(GeoPoint location) {
		this.location = location;
	}

	public GeoPoint getLocation() {
		return location;
	}
	
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getDistance() {
		return distance;
	}
}
