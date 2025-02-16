package application;

import entities.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            List<Task> list = new ArrayList<>();

            System.out.println("==== Task List ====");
            int i = 0;
            while (i != 4) {
                System.out.println("Choose an option:");
                System.out.println("1 - View tasks\n2 - Create a task\n3 - Delete a task\n4 - Exit the Task List");
                int op = sc.nextInt();
                switch (op) {
                    case 1:
                        if (list.isEmpty()) {
                            System.out.println("Task list is empty");
                        }
                        for (Task task : list) {
                            System.out.println("#" + (list.indexOf(task) + 1) + " - "  + task.getTaskDescription());
                        }
                        break;
                    case 2:
                        sc.nextLine();
                        System.out.print("Task: ");
                        String task = sc.nextLine();
                        list.add(new Task(task, false));
                        break;
                    case 3:
                        System.out.print("Write the task ID to be deleted: ");
                        int id = sc.nextInt();
                        if (id < 1 || id > list.size()) {
                            System.out.println("Invalid ID! Please enter a valid task ID.");
                        } else {
                            list.remove(id - 1);
                            System.out.println("Task removed successfully!");
                        }
                        break;
                    case 4:
                        System.out.println("==== Task List closed ====");
                        i = 4;
                        break;
                    default:
                        System.out.println("Please insert a valid number!!");
                }
            }
        sc.close();
    }
}
