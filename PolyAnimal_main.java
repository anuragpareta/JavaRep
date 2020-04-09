package inheritancePkg;

public class PolyAnimal_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MetOverloading_AnimalEx3i anml;

		anml = new MetOverloading_AnimalEx3i();
		anml.whoAmI();

		anml = new MetOverloading_DogEx3ii();
		anml.whoAmI();

		anml = new MetOverloading_CatEx3iii();
		anml.whoAmI();

	}

}
