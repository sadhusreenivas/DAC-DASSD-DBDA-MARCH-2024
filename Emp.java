package collections;

public class Emp {

	private int eid;
	private String ename;
	private double esal;
	private static String org = "C-DAC";
	
	public Emp(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public double getEsal() {
		return esal;
	}

	public static String getOrg() {
		return org;
	}

	
}
