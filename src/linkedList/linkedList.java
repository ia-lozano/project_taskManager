package linkedList;

public class linkedList<String> {
    Task<String> firstTask;

    public linkedList(){
        this.firstTask = null;
    }

    public boolean isEmpty(){
        return (this.firstTask == null);
    }

    public linkedList(Task firstTask){
        this.firstTask = firstTask;
    }

    public Task getFirst(){
        return firstTask;
    }

    public void insertAtFirstPosition(String task){
        Task taskToInsert = new Task(task);
        taskToInsert.nextTask = firstTask;
        firstTask = taskToInsert;
    }

    public void insertAtLastPosition(String task){
        Task taskToInsert = new Task(task);
        if (this.isEmpty()){
            this.insertAtFirstPosition(task);
        } else {
            Task currentTask = firstTask;
            while (currentTask.nextTask != null){
                currentTask = currentTask.nextTask;
            }
            currentTask.nextTask = taskToInsert;
        }
    }

    public Task find(Integer index){
        if (index < 0 || this.isEmpty()){
           return null;
        }
        Task<String> currentTask = firstTask;
        int currentIndex = 0;

        while(currentTask != null && currentIndex < index){
            currentTask = currentTask.nextTask;
            currentIndex++;
        }
        // Ternary operator
        System.out.println("Consultando: " + currentTask);
        return (currentIndex == index) ? currentTask : null;
    }

    public void delete(int index) throws Exception{
        if (this.isEmpty()) {
            throw new Exception("No mas tareas por hacer");
        }

        if (index <= 0) {
            throw new Exception("Indice no valido");
        }

        if (index == 1) {
            // Deleting the first task
            firstTask = firstTask.nextTask;
            return;
        }

        Task<String> currentTask = firstTask;

        // Traverse to the task just before the one to be deleted
        for (int i = 1; i < index - 1; i++) {
            if (currentTask == null || currentTask.nextTask == null) {
                throw new Exception("La tarea indicada no existe");
            }
            currentTask = currentTask.nextTask;
        }

        // Ensure the task to delete exists
        if (currentTask.nextTask == null) {
            throw new Exception("La tarea indicada no existe");
        }

        // Bypass the task to delete
        currentTask.nextTask = currentTask.nextTask.nextTask;
        System.out.println("Tarea compleatada con exito");
    }

    public void show(){
        Task currentTask = this.firstTask;
        while(currentTask != null){
            System.out.println(currentTask.singleTask);
            currentTask = currentTask.nextTask;
        }
    }
}
