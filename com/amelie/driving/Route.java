package com.amelie.driving;

import java.util.List;

import com.google.android.maps.GeoPoint;

/**
 * Represents the driving directions path.
 * The route consists of a ordered list of geographical points and major placemarks.
 * 
 */
public interface Route
{
	public abstract String getTotalDistance();

	public abstract List<GeoPoint> getGeoPoints();

	public abstract List<Placemark> getPlacemarks();

}