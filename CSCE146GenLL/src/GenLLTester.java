/*
 * Tyler Beetle
 */
public class GenLLTester {

	public static void main(String[] args) {
		GenLL<Integer> iLL = new GenLL<Integer>();
		//GenLL<int> = iLL2 = new GenLL<>int>();
		GenLL<Double> dLL = new GenLL<Double>();
		GenLL<String> sLL = new GenLL<String>();
		for(int i=4;i>=0;i--)
		{
			iLL.add(i);
			dLL.add((double)i);
			sLL.add("I is "+i);
		}
		iLL.print();
		dLL.print();
		sLL.print();
		
		sLL.gotoNext();
		sLL.removeCurrent();
		sLL.print();
	}

}
