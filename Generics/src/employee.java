public class employee{
	
	private String name;
	private String department;
	
	public employee(String name,String department) {
		
		this.department = department;
		this.name = name;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	public String toString() {
		return "name :" + name + '\n' +"department : " + department;
	}
}