package stringsDemo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj = "Bugün hava çok güzel";

		System.out.println(mesaj);

		System.out.println("Eleman sayýsý: " + mesaj.length());
		System.out.println("5. eleman: " + mesaj.charAt(4));
		System.out.println("Birleþtirilmiþ mesaj: " + mesaj.concat("Yaþasýn!"));
		System.out.println("Büyük 'A' ile Baþlýyor mu ?: " + mesaj.startsWith("A"));
		System.out.println("Nokta ile bitiyor mu ?: " + mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 4, karakterler, 0); //0 dan baþla 4.indexe kadar karakterler char[] aktar karakterlerin 0. indexinden baþlayarak.
		System.out.println(karakterler);
		System.out.println("Baþtan Kaçýncý indexte?: " + mesaj.indexOf('a')); //ilk bulduðunu getirir.
		System.out.println("Sondan Kaçýncý indexte?: " + mesaj.lastIndexOf('a')); //ilk bulduðunu getirir.
	}

}
