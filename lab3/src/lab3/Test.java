package lab3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//animalsTest();
		//shapesTest();
		//slavesTest();		
		chessTest();
	}
	
	public static void animalsTest() {
		Animal a = new Animal("Bob");
		Animal b = new Dog("Ray");
		Cat c = new Cat();
		Dog d = new Dog("Rex");
		Cat c2 = new Cat("Rob");
		
		a.eat();
		b.eat();
		c.eat();
		d.eat();
		
		//a.bark();
		//b.bark();
		//c.bark();
		d.bark();
		
		c.meow();
		//a.meow();
		
		System.out.println(c2.getName());
		
		System.out.println(c.getName());
		c.setName("Alice");
		System.out.println(c.getName());		
	}
	
	public static void shapesTest() {
		Shape cylinder = new Cylinder(5, 10);
		Shape sphere = new Sphere(7);
		Shape cube = new Cube(4);
		
		System.out.println(cylinder.volume());
		System.out.println(cylinder.surfaceArea());
		
		System.out.println(sphere.volume());
		System.out.println(sphere.surfaceArea());
		
		System.out.println(cube.volume());
		System.out.println(cube.surfaceArea());		
	}

	public static void slavesTest() {
		Employee slave1 = new Employee("Tom", 450, 4, "ab303");
		Employee slave2 = new Employee("Jerry", 500, 2, "ex605");
		Employee slave3 = new Employee("Tom", 450, 4, "ab303");
		Employee slave4 = new Employee("Rob", 450, 4, "ab303");
		
		System.out.println(slave1.equals(slave2));
		System.out.println(slave1.equals(slave3));
		System.out.println(slave1.equals(slave4));
		
		System.out.println(slave2);
		
		Employee[] slaves1 = new Employee[2];
		slaves1[0] = slave1;
		slaves1[1] = slave2;
		
		Employee[] slaves2 = new Employee[2];
		slaves2[0] = slave3;
		slaves2[1] = slave4;
		
		Manager uberSlave1 = new Manager("Bob", 1200, 7, "xx99", slaves1, 2);
		Manager uberSlave2 = new Manager("Bob", 1200, 7, "xx99", slaves2, 2);
		
		System.out.println(uberSlave1);
		System.out.println(uberSlave2);
		
		System.out.println(uberSlave1.equals(uberSlave2));
	}
	
	public static void chessTest() {
		Piece pewka = new Pawn('W');
		System.out.println(pewka.isLegalMove(new Position('A', 2), new Position('A', 4)));
		System.out.println(pewka.isLegalMove(new Position('A', 2), new Position('A', 5)));
		System.out.println("-----");
		
		Piece kon = new Knight('W');
		System.out.println(kon.isLegalMove(new Position('B', 1), new Position('C', 3)));
		System.out.println(kon.isLegalMove(new Position('B', 1), new Position('C', 4)));
		System.out.println("-----");
		
		Piece slon = new Bishop('W');
		System.out.println(slon.isLegalMove(new Position('C', 1), new Position('E', 3)));
		System.out.println(slon.isLegalMove(new Position('C', 1), new Position('D', 3)));
		System.out.println("-----");
		
		Piece ladya = new Rock('W');
		System.out.println(ladya.isLegalMove(new Position('H', 1), new Position('H', 6)));
		System.out.println(ladya.isLegalMove(new Position('H', 1), new Position('G', 3)));
		System.out.println("-----");
		
		Piece koroleva = new Queen('W');
		System.out.println(koroleva.isLegalMove(new Position('D', 1), new Position('D', 7)));
		System.out.println(koroleva.isLegalMove(new Position('D', 1), new Position('F', 5)));
		System.out.println("-----");
		
		Piece korol = new King('W');
		System.out.println(korol.isLegalMove(new Position('E', 1), new Position('F', 2)));
		System.out.println(korol.isLegalMove(new Position('E', 1), new Position('G', 1)));
	}
}
