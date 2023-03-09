package demo;

public class Runner {

	static int max = 150;
	static int physics = 75;
	static int chemistry = 65;
	static int biology = 115;

	public static void main(String[] args) {

		display();

		percent();

//		int sum1 = sum(12, 4);
//		System.out.println("SUM1: " + sum1);

	}

	public static void display() {
		System.out.println("Physics: " + physics + " / " + max);
		System.out.println("Chemistry: " + chemistry + " / " + max);
		System.out.println("Biology: " + biology + " / " + max);
		System.out.println("Total: " + (physics + chemistry + biology) + " / " + (max * 3));
	}

	public static void percent() {
		System.out.println("Percenatge: " + (physics + chemistry + biology) * 100 / 450 + "% ");
	}

}
