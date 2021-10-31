/*
 * Tyler Beetle
 */
public class ProcessScheduler {

	private LLQueue<Process> processes;
	private Process curProcess;
	
	public ProcessScheduler()
	{
		this.processes = new LLQueue<Process>();
		this.curProcess = null;
	}
	public Process getCurrentProcess()
	{
		return curProcess;
	}
	public void addProcess(Process aProcess)
	{
		if(curProcess == null)
			curProcess = aProcess;
		else
			processes.enqueue(aProcess);
	}
	public void runNextProcess()
	{
		curProcess = processes.dequeue();
	}
	public void cancelCurrentProcess()
	{
		curProcess = processes.dequeue();
	}
	public void printProcessQueue()
	{
		processes.print();
	}
}
