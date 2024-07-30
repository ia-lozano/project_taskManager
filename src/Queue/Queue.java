package Queue;

public class Queue<String> {
    public static final int CAPACITY = 100;
    private String[] regTasks;
    private int size = 0;

    public Queue(){
        this.regTasks = (String[]) new Object[this.CAPACITY];
    }

    public boolean isEmpty(){
        return(this.size == 0);
    }

    public int size(){
        return (this.size);
    }

    public void push(String regTask){
        this.regTasks[this.size] = regTask;
        this.size++;
    }

    public String pop() throws Exception{
        if (this.isEmpty()){
            throw new Exception("Ya no hay mas tareas regulares por hoy");
        }
        String doneTask = this.regTasks[0];
        for (int i=0; i<this.size; i++){
            regTasks[i] = regTasks[i+1];
        }
        this.regTasks[this.size] = null;
        this.size--;
        System.out.println(doneTask + " se ha completado con exito");
        return doneTask;
    }

    public String peek() throws Exception{
        if(this.isEmpty()){
            throw new Exception("No more regular tasks to do.");
        }
        String regTask = this.regTasks[0];
        System.out.println("Siguiente tarea: " + regTask);
        return regTask;
    }

    public void show(){
        if(this.isEmpty()){
            System.out.println("No hay mas tareas por hoy.");
        } else {
            for(int i=0; i<this.size; i++){
                System.out.println(regTasks[i]);
            }
        }
        System.out.println();
    }
}
