package linkedList;

public class Task<String> {
    public String singleTask;
    public Task nextTask;

    public Task(String singleTask, Task nextTask ){
        this.singleTask = singleTask;
        this.nextTask = nextTask;
    }

    public Task(String singleTask){
        this.singleTask = singleTask;
    }
}
