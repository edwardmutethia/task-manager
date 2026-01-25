package com.edwardmurithi;

/*
  Task Manager
  Author: Edward Murithi
  Email: edwardmurithi.dev@gmail.com

 */
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private static ArrayList<String> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args ) {
        while (true) {
            System.out.println("\n----TASK MANAGER----\n");
            System.out.println("1. Add new task.");
            System.out.println("2. View task.");
            System.out.println("3. Mark task COMPLETE.");
            System.out.println("4. Search/Find Task.");
            System.out.println("5. Delete a Task");
            System.out.println("6. Save & Exit App.");

            System.out.print("\nSelect an Option: ");

            try {
                int option = Integer.parseInt(scanner.nextLine());

                switch (option) {
                    case 1 -> addTask();
                    case 2 -> viewTask();
                    case 3 -> {
                        System.out.println("Exiting the Application");
                        return;
                    }
                    default -> System.out.println("Invalid Option");
                }
            } catch (Exception e) {
                System.out.println("An Error Occurred");
            }
        }
    }

    public static void viewTask() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + tasks.get(i));
        }
    }

    public static void addTask() {
        System.out.println("\n********* Add Tasks *********\n");

        int addedCount = 0;

        while (true) {
            System.out.print("Add Task: ");
            String task = scanner.nextLine().trim();

            if (task.equalsIgnoreCase("q")) {
                break;
            }

            if (task.isBlank()) {
                System.out.println("Task cannot be empty.");
            }

            tasks.add(task);
            addedCount++;
        }

        if (addedCount > 0) {
            System.out.println(addedCount + " task(s) added successfully.");
        } else {
            System.out.println("No task ware added.");
        }
    }


}
