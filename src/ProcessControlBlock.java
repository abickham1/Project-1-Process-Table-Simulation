import java.util.HashMap;

public class ProcessControlBlock {
    int pid;
    String state;
    int priority;
    String name;
    int programCounter;
    HashMap<Integer, Integer> registers;

    @Override
    public String toString() {
        return pid + " " + state + " " + priority + " " + name + " " + programCounter;
    }

}
