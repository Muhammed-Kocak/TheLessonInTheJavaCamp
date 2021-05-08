package switchDemo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'A';
		
		switch(grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;
		case 'C':
			System.out.println("Ýyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Deðil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Malesef Kaldýnýz");
			break;
		default:
			System.out.println("Yanlýþ giriþ yaptýnýz.");
		}
	}

}
