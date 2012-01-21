package com.amelie.driving;

import com.google.android.maps.GeoPoint;

/**
 * Represents a major placemark along a driving route.
 * 
 */
public interface Placemark
{
	public abstract GeoPoint getLocation();

	public abstract String getInstructions();

	public abstract String getDistance();

}