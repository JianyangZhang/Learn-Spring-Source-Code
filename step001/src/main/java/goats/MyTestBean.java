package goats;

public class MyTestBean {
	private String testStr;
	
	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}
	
	public void printMe() {
		System.out.println(testStr);
	}
}

