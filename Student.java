import java.util.UUID;


public class Student {
	private String ID; 
	private Answer answer; 
	public Student(int i) {
	}
	public void student(){
		this.ID = UUID.randomUUID().toString();
	}
	public void setAnswer(String a){
		answer = new Answer(a);
	}
	public Answer getAnswer(Object object){
		return answer; 
	}
	public String getID() {
		return this.ID;
	}
	
}

