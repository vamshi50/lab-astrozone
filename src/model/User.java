package model;

//Type your code here
public class User{
	public String name;
	 public int d;
	public int m;
	

	public User(String name,String date,String month,String gender)
	{
		this.name=name;
		d=Integer.parseInt(date);
		m=Integer.parseInt(month);
	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getD() {
		return d;
	}


	public void setD(int d) {
		this.d = d;
	}


	public int getM() {
		return m;
	}


	public void setM(int m) {
		this.m = m;
	}
	
	
}
