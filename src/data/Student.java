package data;

public class Student {
	private String fname;
	private String lname;
	private int sn;
	private String prog;
	
	
	
	public Student(String fname, String lname, int sn, String prog) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.sn = sn;
		this.prog = prog;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getSn() {
		return sn;
	}
	public void setSn(int sn) {
		this.sn = sn;
	}
	public String getProg() {
		return prog;
	}
	public void setProg(String prog) {
		this.prog = prog;
	}
	
	@Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + ", sn=" + sn + ", prog=" + prog + "]";
	}
	
	

}
