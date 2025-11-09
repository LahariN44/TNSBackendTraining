public class Student {
    // Instance variable
	int rollno;
	String sname;
	String branch;
	
	// Static variable
	static String CollegeName = "AVN";
	
	// Method
	void print() {
		// local variable
		String msg="These are the TNS Students";
		System.out.println(msg);
		System.out.println("The Student Details are : " + rollno + " " + sname + " " + branch + " " + CollegeName);
	}

}
