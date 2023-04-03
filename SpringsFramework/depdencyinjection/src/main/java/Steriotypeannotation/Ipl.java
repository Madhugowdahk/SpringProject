package Steriotypeannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ipl {
	@Value("rcb")
private String iplteam;
	@Value("virat")
private String captain;
public String getIplteam() {
	return iplteam;
}
public void setIplteam(String iplteam) {
	this.iplteam = iplteam;
}
public String getCaptain() {
	return captain;
}
public void setCaptain(String captain) {
	this.captain = captain;
}
public Ipl(String iplteam, String captain) {
	super();
	this.iplteam = iplteam;
	this.captain = captain;
}
@Override
public String toString() {
	return "Ipl [iplteam=" + iplteam + ", captain=" + captain + "]";
}

}
