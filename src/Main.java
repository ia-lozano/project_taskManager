//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import Stack.Stack;
import Queue.Queue;
import linkedList.linkedList;


public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        taskManager();

        scanner.close();
        // Do not delete the next square bracket, belongs to the main() method!
    }

    // Workspace outside the main() method...

    /**
     * Function para administrar tareas urgentes
     * usando un Stack que toma un String como parametro...
     */
    public static boolean prioTasks() throws Exception {
        boolean running = true;
        Stack<String> urgentes = new Stack<String>();
        urgentes.push("Pagar facturas por vencer");
        urgentes.push("Firmar documentos urgentes");
        urgentes.push("Molestar a Calamardo");

        while (running){
            System.out.println("1: Agregar tarea urgente");
            System.out.println("2: Completar tarea urgente");
            System.out.println("3: Mostrar lista de tareas urgentes");
            System.out.println("4: Regresar");
            System.out.println("Tareas prioritarias: Seleccione una opcion: ");
            String option = scanner.nextLine();

            switch (option){
                case "1": {
                    System.out.println("Nueva tarea urgente: ");
                    String task = scanner.nextLine();
                    urgentes.push(task);
                    System.out.println("Tarea " + task +  " agregada con exito.");
                    System.out.println();
                    break;
                }

                case "2": {
                    System.out.println("Completando tarea urgente....");
                    urgentes.pop();
                    System.out.println();
                    break;
                }

                case "3": {
                    System.out.println("Tareas urgentes por hacer:");
                    urgentes.show();
                    System.out.println();
                    break;
                }

                case "4": {
                    System.out.println("Regresando al menu principal...");
                    running = false;
                    System.out.println();
                    taskManager();
                    break;
                }

                default: {
                    System.out.println("Opcion invalida");
                    System.out.println();
                    break;
                }
            }
        }
        return running;
    }

    /**
     * Function para administrar las tareas diarias
     * usando un Queue con un String como parametro
     */
    public static boolean regTasks() throws Exception{
        boolean running = true;
        Queue<String> regulares = new Queue<String>();
        regulares.push("Revisar pedidos pendientes de entrega");
        regulares.push("Hacer llamadas de seguimiento");
        regulares.push("Seguimiento a tickets abiertos");

        while(running){
            System.out.println("1: Completar tarea diaria");
            System.out.println("2: Mostrar lista de tareas pendientes");
            System.out.println("3: Regresar");
            System.out.println("Tareas diarias: Seleccione una opcion: ");
            String option = scanner.nextLine();

            switch (option){

                case "1": {
                    System.out.println("Completando tarea....");
                    regulares.pop();
                    System.out.println();
                    break;
                }

                case "2": {
                    System.out.println("Tareas diarias por hacer:");
                    regulares.show();
                    System.out.println();
                    break;
                }

                case "3": {
                    System.out.println("Regresando al menu principal...");
                    running = false;
                    System.out.println();
                    taskManager();
                    break;
                }

                default: {
                    System.out.println("Opcion invalida");
                    System.out.println();
                    break;
                }
            }
        }
        return running;
    }

    /**
     * Function para administrar otras tareas
     * que puede ir surgiendo durante el dia
     * usando una Lista
     */
    public static boolean otherTasks() throws Exception{
        boolean running = true;
        linkedList<String> otras = new linkedList<String>();
        otras.insertAtFirstPosition("Revisar cartera vencida");
        otras.insertAtFirstPosition("Actualizar cotizaciones");
        otras.insertAtLastPosition("Contestar correos");

        while(running){
            System.out.println("1: Agregar tarea al inicio de la lista");
            System.out.println("2: Agregar tarea al final de la lista");
            System.out.println("3: Eliminar tarea");
            System.out.println("4: Encontrar tarea");
            System.out.println("5: Mostrar todas las tareas de la lista");
            System.out.println("6: Regresar");
            System.out.println("Tareas diarias: Seleccione una opcion: ");
            String option = scanner.nextLine();

            switch (option){

                case "1": {
                    System.out.println("Nueva tarea por completar: ");
                    String task = scanner.nextLine();
                    otras.insertAtFirstPosition(task);
                    System.out.println(task + " agregada con exito!");
                    System.out.println();
                    break;
                }

                case "2": {
                    System.out.println("Nueva tarea para completar mas tarde: ");
                    String task = scanner.nextLine();
                    otras.insertAtFirstPosition(task);
                    System.out.println(task + " agregada con exito!");
                    System.out.println();
                    break;
                }

                case "3": {
                    System.out.println("Inserte el indice de la tarea a eliminar");
                    Integer index = Integer.parseInt(scanner.nextLine());
                    otras.delete(index);
                    System.out.println("Tarea eliminada con exito");
                    System.out.println();
                    break;
                }

                case "4": {
                    System.out.println("Inserte el indice de la tarea a encontrar");
                    Integer index = Integer.parseInt(scanner.nextLine());
                    System.out.println(otras.find(index));
                    System.out.println();
                    break;
                }

                case "5": {
                    System.out.println("Otras tareas por hacer: ");
                    otras.show();
                    System.out.println();
                    break;
                }

                case "6": {
                    System.out.println("Regresando al menu principal...");
                    running = false;
                    System.out.println();
                    taskManager();
                    break;
                }

                default: {
                    System.out.println("Opcion invalida");
                    System.out.println();
                    break;
                }
            }
        }
        return running;
    }

    public static void taskManager() throws Exception {
        System.out.println("Bienvenido al administrador de tareas 3000!");
        System.out.println("*==========================================*");

        System.out.println("1. Administrar tareas diarias");
        System.out.println("2. Administrar tareas urgentes");
        System.out.println("3. Administrar otras tareas");
        System.out.println("0. Cerrar aplicacion");
        System.out.println("Seleccione una opcion: ");

        String option = scanner.nextLine();

        boolean running = true;
        while(running){
            switch(option) {
                case "1": {
                    regTasks();
                    System.out.println();
                    break;
                }
                case "2": {
                    prioTasks();
                    System.out.println();
                    break;
                }
                case "3": {
                    otherTasks();
                    System.out.println();
                    break;
                }
                case "0": {
                    System.out.println("Cerrando Task Manager....");
                    running = false;
                    break;
                }
                default:{
                    System.out.println("Opcion invalida, error critico CERRANDO APLICACION");
                    System.out.println();
                    running = false;
                    break;
                }

            }
        }
    }

// Main method square bracket DO NOT touch!
}
