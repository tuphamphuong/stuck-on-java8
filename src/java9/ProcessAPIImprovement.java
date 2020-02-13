package java9;

/**
 * Created by Tu Pham Phuong - phamptu@gmail.com on 2/13/20.
 */
public class ProcessAPIImprovement {
    public static void main(String[] args) {
        // Two new interfcase in Process API:
        // java.lang.ProcessHandle
        // java.lang.ProcessHandle.Info
        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println("Current Process Id: = " + currentProcess.info());
    }
}
