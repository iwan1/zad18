package zad18;

public class main {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		String[] napis = new String[5];
		try{
			System.out.println(napis[1].length());
		}catch(NullPointerException e){
			System.out.println("Odowa�anie si� do niezainicjowanej zmiennej!");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Odwo�anie si� poza zakres tablicy!");
		}
		try{
			System.out.println(napis[7].length());
		}catch(NullPointerException e){
			System.out.println("Odowa�anie si� do niezainicjowanej zmiennej!");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Odwo�anie si� poza zakres tablicy!");
		}
	}

}
