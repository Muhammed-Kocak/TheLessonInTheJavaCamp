package arraysDemo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Array olmayan Baþlangýç");
		
		String ogrenci1 = "Engin";
		String ogrenci4 = "Derin";
		String ogrenci5 = "Salih";
		String ogrenci6 = "Muhammed";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci4);
		System.out.println(ogrenci5);
		System.out.println(ogrenci6);
		
		System.out.println("-------------------");
		
		System.out.println("Array Baþlangýç");
		String[] ogrenciler = new String[4];
		
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Muhammed";
		
		System.out.println("For");
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("Foreach");
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
