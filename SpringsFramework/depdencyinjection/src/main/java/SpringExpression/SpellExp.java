package SpringExpression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bean1")
public class SpellExp {
	@Value("#{99+63}")
private int x;

	@Value("#{(89>85)?4.5:4.4}")
private double y;
	//static method
@Value("#{T(java.lang.Math).sqrt(25)}")
	private double pow;
//example for variable
@Value("#{T(java.lang.Math).PI}")
private long staticvariable;
@Value("#{4>3}")
private boolean i;
@Value("#{new java.lang.String('spider')}")
private String stringtype;

	public String getStringtype() {
	return stringtype;
}

public void setStringtype(String stringtype) {
	this.stringtype = stringtype;
}

	public boolean isI() {
	return i;
}

public void setI(boolean i) {
	this.i = i;
}

	public double getStaticvariable() {
	return staticvariable;
}

public void setStaticvariable(long staticvariable) {
	this.staticvariable = staticvariable;
}

	public double getPow() {
	return pow;
}

public void setPow(double pow) {
	this.pow = pow;
}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "SpellExp [x=" + x + ", y=" + y + ", pow=" + pow + ", staticvariable=" + staticvariable + ", i=" + i
				+ ", stringtype=" + stringtype + "]";
	}
}
