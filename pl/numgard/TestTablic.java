package pl.numgard;

public class TestTablic {
	
	void table(){
		
		int y = 0;
		int [] indeks = new int[4];
		String [] wyspy = new String[4];
		wyspy[0] = "bermudy";
		wyspy[1] = "fiji";
		wyspy[2] = "azory";
		wyspy[3] = "kozumel";
		indeks[0]= 1;
		indeks[1]= 3;
		indeks[2]= 0;
		indeks[3]= 2;
		int ref;
		while (y<4){
			
			
			ref = indeks[y];
			
			
			System.out.print("wyspa =");
			System.out.println(wyspy[ref]);
			y=y+1;
			
		}
		
		
	}

}




/*package pl.numgard;

public class Test {

	public static void main(String[] args) {
		
		
		TestTablic test = new TestTablic();
		test.table();
		
		
	}

}*/

