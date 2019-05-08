package ewfwef;

// underweight no; otherwise canGiveBlood

class Person {
	
	public String fullname;
	public String role;
	public double weight;
	public double height;
	public double bmi;
	public String interpretation;
	public String canGiveBlood;
	
	public Person(String fullname, String role, double weight, double height) {
		
		this.fullname =fullname;
		this.role = role;
		
		this.weight = weight;
		this.height = height;
		
		this.bmi = (weight)/(height *height);
		
		if (bmi > 30)
			interpretation = "obese";
		else if (bmi <= 30 && bmi >=25)
			interpretation = "Overeight";
		else if (bmi >= 18.5 && bmi <= 24.9)
			interpretation = "Normal";
			else
				interpretation = "Underwieight";
		
		if (bmi < 18.5)
			canGiveBlood = "No, I can't give blood.";
		else
			canGiveBlood = "He Can give blood.";
	}
	
	void tellUsAboutYourself() {
		System.out.println("My name is"+fullname+". My role here in scholl is "+ role +". My BMI is"+ bmi+"which is "+ interpretation+ canGiveBlood);
	}
}

 


public class PersonDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person Alex = new Person("Alex", "ICT Trainer", 65.0,1.72);
		Person Mariya = new Person("Mariva", "student", 60.0,1.52);
		Person Lian = new Person("Lian", "Student", 50, 1.72);
		
		Alex.tellUsAboutYourself();
		Mariya.tellUsAboutYourself();
		Lian.tellUsAboutYourself();
	}

}
