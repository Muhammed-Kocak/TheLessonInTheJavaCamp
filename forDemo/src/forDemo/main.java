package forDemo;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("For döngüsü");
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("Döngü bitti");
	
		System.out.println("While döngüsü");	
		int i = 2;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("Do while döngüsü");
		int j = 100;
		do {
			System.out.println(j);
			j+=2;
		} while (j<10);
	
	}

}
