package ewfwef;

public class StudentBefore {

    
		int rollno;
		String name;
		String city;
		
		StudentBefore(int rollno, String name, String city){
			this.rollno = rollno;
			this.name = name;
			this.city= city;
			
		}
	//	public String toString() {
	//		return rollno +"   "+name + "   "+ city;
		//}
		public static void main(String []args) {
			StudentBefore s1 = new StudentBefore(101, "Raj", "lucknow");
			StudentBefore s2 = new StudentBefore(102, "vijay", "ghaziabad");
			System.out.println(s1);
			System.out.println(s2);
		}
		
	}

