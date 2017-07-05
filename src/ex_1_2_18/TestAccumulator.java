package ex_1_2_18;

public class TestAccumulator {
	
	public static void main(String[] args) {
		Accumulator accumulator = new Accumulator();
		for(int x = 0 ;x<10 ;x++){
			accumulator.addDataValue(x);
			System.out.println(accumulator.var());
		}
	}

}
