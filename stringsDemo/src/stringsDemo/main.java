package stringsDemo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj = "Bug�n hava �ok g�zel";

		System.out.println(mesaj);

		System.out.println("Eleman say�s�: " + mesaj.length());
		System.out.println("5. eleman: " + mesaj.charAt(4));
		System.out.println("Birle�tirilmi� mesaj: " + mesaj.concat("Ya�as�n!"));
		System.out.println("B�y�k 'A' ile Ba�l�yor mu ?: " + mesaj.startsWith("A"));
		System.out.println("Nokta ile bitiyor mu ?: " + mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 4, karakterler, 0); //0 dan ba�la 4.indexe kadar karakterler char[] aktar karakterlerin 0. indexinden ba�layarak.
		System.out.println(karakterler);
		System.out.println("Ba�tan Ka��nc� indexte?: " + mesaj.indexOf('a')); //ilk buldu�unu getirir.
		System.out.println("Sondan Ka��nc� indexte?: " + mesaj.lastIndexOf('a')); //ilk buldu�unu getirir.
	}

}
