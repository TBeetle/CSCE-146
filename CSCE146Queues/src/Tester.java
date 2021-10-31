/*
 * Tyler Beetle
 */
public class Tester {

	public static void main(String[] args) {
		QueueI<Integer> q;
		//q = new QueueI<Integer>();
		q = new ArrayQueue<Integer>();
		for(int i=0; i<10;i++)
			q.enqueue(i);
			q.print();
	}

}
