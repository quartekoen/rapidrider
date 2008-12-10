

public class SimpleLoc {
	
	private double myLat;
	private double myLon;

	public SimpleLoc() {
		myLat = Double.NaN;
		myLon = Double.NaN;
	}

	public SimpleLoc(double lat, double lon) {
		myLat = lat;
		myLon = lon;
	}

	public double getLat() {
		return myLat;
	}

	public double getLon() {
		return myLon;
	}

	public void setLat(double lat) {
		myLat = lat;
	}

	public void setLon(double lon) {
		myLon = lon;
	}

	public String printLoc() {
		return String.valueOf(myLat) + ", " + String.valueOf(myLon);
	}

	// This function doesn't look correct to me.  TODO test.
	public double distanceTo(SimpleLoc tar) {
		double latDif = Math.abs(myLat) - Math.abs(tar.getLat() );
		double lonDif = Math.abs(myLon) - Math.abs(tar.getLon() );
		System.out.println(myLat + " " + myLon + " " + latDif + " " + 
				lonDif + " " + latDif * latDif + " " + lonDif * lonDif );
		double dist = Math.sqrt( 
			 ( (Math.abs(myLat) - Math.abs(tar.getLat()) ) * ( Math.abs(myLat) - Math.abs(tar.getLat()) ) ) +
			 ( (Math.abs(myLon) - Math.abs(tar.getLon()) ) * ( Math.abs(myLon) - Math.abs(tar.getLon()) ) )
			 );
		return dist;
	}
}