package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myList = {1,2,3,4,5,6};
		double total = 0;
		double max = myList[0];
		for (double myli : myList) {
			if (max<myli) {
				max = myli;
			}
			total = total+myli;
			System.out.println(myli);
		}
		System.out.println("Toplam= "+ total);
		System.out.println("En büyük sayý= "+ max);
	}
}
