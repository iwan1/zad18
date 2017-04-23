package zad18;

public class main {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		String[] napis = new String[5];
		try{
		System.out.println(napis[1].length());
		}catch(NullPointerException e){
			System.out.println("Odowa³anie siê do niezainicjowanej zmiennej!");
		}
	}

}
