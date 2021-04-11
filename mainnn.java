package vicky;

public class mainnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Rabbit r = new Rabbit ();
			r.setAnimal("Rabbit");
			r.setName("Tabita");
			r.setJantina("Male");
			r.setColor("Mix black and white");
			r.setAge(3);
			r.setWeight(1.5);
			
			System.out.println ("Animal\t:"+ r.gettypeAnimal());
			System.out.println ("Name \t:"+ r.getName());
			System.out.println ("Jantina\t:"+ r.getJantina());
			System.out.println ("Age \t:"+ r.getAge()+" years old");
			System.out.println ("Color \t:"+ r.getColor());
			System.out.println ("Weight \t:"+ r.getWeight()+"Kg");
	}

}
