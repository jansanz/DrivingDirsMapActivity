package com.amelie.driving;

import com.google.android.maps.GeoPoint;

public abstract class DrivingDirections
{
	public interface IDirectionsListener {
		/**
		 * Invoked when driving directions have become available.
		 * 
		 * @param route The route that defines the driving path.
		 */
		public abstract void onDirectionsAvailable (Route route, Mode mode);
		
		/**
		 * Invoked when driving directions are not available.
		 */
		public abstract void onDirectionsNotAvailable ();
	}
	
	public enum Mode {
		DRIVING,
		WALKING
	}

	private Mode mode;
	private IDirectionsListener listener;
	
	/**
	 * Get the driving directions from one point to another.
	 * 
	 * @param startPoint The starting point.
	 * @param endPoint The ending point.
	 * @param mode The driving mode, either driving or walking.
	 * @param listener The object to be notified when the directions are available. It can be null.
	 */
	public void driveTo (GeoPoint startPoint, GeoPoint endPoint, Mode mode, IDirectionsListener listener)
	{
		if ((startPoint == null) || (endPoint == null) || (mode == null)) {
			throw new IllegalArgumentException ("startPoint, endPoint or mode arguments can't be null");
		}
		
		this.mode = mode;
		this.listener = listener;
		
		startDrivingTo(startPoint, endPoint, mode, listener);
	}
	
	/**
	 * Subclasses must override this method and provide their specific implementation to retrieve
	 * the driving directions from one point to another.
	 * 
	 * @param startPoint The starting point.
	 * @param endPoint The ending point.
	 * @param mode The driving mode, either driving or walking.
	 * @param listener The object to be notified when the directions are available. It can be null.
	 */
	protected abstract void startDrivingTo (GeoPoint startPoint, GeoPoint endPoint, Mode mode, IDirectionsListener listener); 
	
	protected void onDirectionsAvailable (Route route)
	{
		if (listener != null) {
			listener.onDirectionsAvailable(route, mode);
		}
	}
	
	protected void onDirectionsNotAvailable ()
	{
		if (listener != null) {
			listener.onDirectionsNotAvailable();
		}
	}
}
