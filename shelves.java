import java.util.ArrayList;

public class shelves {
	int shelveNumber;
	ArrayList<Integer> usedPositions = new ArrayList<Integer>();
	int weight;
	
	
	public shelves(int nr) {
		this.weight = 0;
		this.shelveNumber = nr;
		usedPositions.add(nr);
	}
	public int addProduct(int stocknr) {
		String i = Integer.toString(stocknr);
		String nr1 = i.substring(0,3);
		String nr2 = i.substring(3,6);
		int number1 = Integer.parseInt(nr1);
		int number2 = Integer.parseInt(nr2);
		this.usedPositions.add(number2);
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shelves[] shelve = new shelves[1000];
		for (int i = 0; i < shelve.length; i++) {
		    shelve[i] = new shelves(i);
		}
		
		int a = 1;
		shelve[a].usedPositions.add(123);
		
		for (Integer current: shelve[1].usedPositions) {
	        System.out.println(current);
	    }

	}

}
