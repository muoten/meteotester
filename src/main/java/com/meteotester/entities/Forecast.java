package com.meteotester.entities;

public class Forecast {

	String targetdate;
	int daysbefore;
	String source;
	Object latitude;
	Object longitude;
	String place;
	String country;
	String variable;
	Object value;
	String units;
	
	public Forecast(String source, Object latitude, Object longitude,
			String place, String country) {
		this.source = source;
		this.latitude = latitude;
		this.longitude = longitude;
		this.place = place;
		this.country = country;
	}
	
	public String toString() {
		
		if (units.equals("prob.")) {
			
			if (value instanceof Integer)
				value = (Integer) value*100;
			else value = (Double) value*100;
			
			units = "%";
		}
		
		return targetdate + "\t"
				+ daysbefore + "\t" + source + "\t" + latitude
				+ "\t" + longitude + "\t" + place
				+ "\t" + country + "\t" + variable
				+ "\t" + value + "\t" + units + "\n";
	}
	
	public String getTargetdate() {
		return targetdate;
	}
	public void setTargetdate(String targetdate) {
		this.targetdate = targetdate;
	}
	public int getDaysbefore() {
		return daysbefore;
	}
	public void setDaysbefore(int daysbefore) {
		this.daysbefore = daysbefore;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Object getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public Object getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getVariable() {
		return variable;
	}
	public void setVariable(String variable) {
		this.variable = variable;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	
	
}
