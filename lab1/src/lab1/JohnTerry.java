package lab1;

public class JohnTerry {
	String name;
	String position;
	String friend[];
		
	
	public JohnTerry() {
		name = "JohnTerry";
		position = "Arrow";
		friend = new String[] {"test1","test2"};

	}
	public String getname(){
		return name;
	}
	public String getposition(){
		return position;
	}
	public String[] getfriend(){
		return friend;
	}

}
