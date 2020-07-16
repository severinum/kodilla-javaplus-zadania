package com.kodilla.kolekcje.petle;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class TaskManager {
    private List<String> executedTasks;

    public TaskManager(){
        executedTasks = new ArrayList<>();
    }

    // serving list of tasks
    public void executeTasks(Deque<String> theQueue){
        while(theQueue.size() > 0){
            String theTask = theQueue.poll();
            System.out.println("Processing the task: " + theTask);
            executedTasks.add(theTask);
        }
        System.out.println("\nExecuted total: " + executedTasks.size());
    }
}

public class PrzepisywanieKolekcjaKolekcja {

    public static void main(String[] args) {
        // first task's list
        Deque<String> taskQueue1 = new ArrayDeque<>();
        for (int i = 0; i < 5; i++){
            taskQueue1.offer("The first task number " + (i + 1));
        }

        // second task's list
        Deque<String> taskQueue2 = new ArrayDeque<>();
        for (int i = 0; i < 5; i++){
            taskQueue2.offer("The second task number: " + (i + 1));
        }

        TaskManager taskExecutor = new TaskManager();
        taskExecutor.executeTasks(taskQueue1);
        taskExecutor.executeTasks(taskQueue2);
    }
}
