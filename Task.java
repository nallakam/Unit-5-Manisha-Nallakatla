public class Task implements Priority{

    private String name;
    private int priority;
    private boolean isComplete;

    public Task(String name, int priority){
        this.name = name;
        isComplete = false;
        this.priority = priority;
    }

    public void setPriority(int PriorityLevel){
        this.priority = priorityLevel;
    }
    public int getPriority(){
        return priority;
    }

    public void doTask(){
        System.out.println("Doing task... Working...");
        isComplete = true;
        this.setPriority(null);
    }

    public String toString(){
        return "Task: " + name "\nPriority: " + this.getPriority;
    }
}