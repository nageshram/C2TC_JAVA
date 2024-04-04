 package nagesh_corejava.tnsif;

public class ClassAndObject {
	private String name;
	private int age;
	private long phno;
	public String group;
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public ClassAndObject(String name, int age, long phno) {
		super();
		this.name = name;
		this.age = age;
		this.phno = phno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String toString() {
		return "ClassAndObject [name=" + name + ", age=" + age + ", phno=" + phno + "]";
	}
}
