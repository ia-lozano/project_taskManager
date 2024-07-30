package Stack;

public class Stack<String> {
    public static final int CAPACITY = 100;

    private String[] tasks;
    private int size = 0;

    public Stack() {
        this.tasks = (String[]) new Object[this.CAPACITY];
    }

    public boolean isEmpty(){
        return(this.size == 0);
    }

    public int size(){
        if(this.isEmpty()) {
            System.out.println("No hay tareas pendientes");
        } else {
            System.out.println("Quedan " + this.size + " tareas pendientes en el stack");
        }
        return (this.size);
    }

    public void push(String task){
        this.tasks[this.size] = task;
        this.size++;
    }

    public String pop() throws Exception{
        String doneTask = null;
        if(this.isEmpty()){
            throw new Exception("No hay tareas pendientes en el stack");
        }
        this.size--;
        doneTask = this.tasks[this.size];
        System.out.println(doneTask + " se ha completado con exito");
        return doneTask;
    }

    public String peek() throws Exception{
        String currentTask = null;
        if (this.isEmpty()){
            throw new Exception("No hay tareas pendientes em el stack");
        }
        currentTask = this.tasks[this.size-1];
        System.out.println("Prioridad: " + currentTask);
        return currentTask;
    }

    public void show(){
        if(this.isEmpty()){
            System.out.println("No hay tareas pendientes en el stack");
        } else {
            for (int i = this.size - 1; i>=0; i--){
                System.out.println(tasks[i]);
            }
            System.out.println();
        }
    }
}
