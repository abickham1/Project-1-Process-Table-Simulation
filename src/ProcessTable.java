public class ProcessTable {
    public static boolean killProcess(int pid){
        if(pid == ProcessControlBlock.pid){
            String name = ProcessControlBlock.name;

            return true;
        }
        return false;
    }

    public static void listAllProcesses(){}

    public static boolean changeState(int pid, String newState){
        return false;
    }

    public static void addPCB(ProcessControlBlock newProcess){
    }

}
