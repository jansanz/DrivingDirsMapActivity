package com.amelie.driving;

import com.amelie.driving.impl.DrivingDirectionsGoogleKML;

public class DrivingDirectionsFactory
{
	public static DrivingDirections createDrivingDirections ()
	{
		return new DrivingDirectionsGoogleKML ();
	}
}
