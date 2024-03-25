
class  Animal{}
class Mammal extends Animal{}
class reptile extends Animal{} 

public class DogInstanceOf extends Animal{
	public static void main(String[] args) {
		Animal a = new Animal();
		Mammal m = new Mammal();
		reptile r = new reptile();
		DogInstanceOf d = new DogInstanceOf();
		
		System.out.println(a instanceof Animal);	//true
		System.out.println(m instanceof Mammal);	//true
		System.out.println(r instanceof reptile);	//true
		System.out.println(d instanceof DogInstanceOf); //true
		System.out.println(d instanceof Animal); 	//true
		System.out.println(a instanceof DogInstanceOf); //false
	}
}

