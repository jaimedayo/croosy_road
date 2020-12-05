package model;

public class Time implements Comparable<Time>{
protected String date ;
protected int duration ;
	public Time(String date,int duration) {
		this.date=date;
		this.duration=duration;
	}
	
public int compareTo(Time o) {
		
		return 0;
	}
public String getDate() {
	return date;
}
public int getDuration() {
	return duration;
}
}
