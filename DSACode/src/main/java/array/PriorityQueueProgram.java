package array;

import java.util.PriorityQueue;

public class PriorityQueueProgram {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueueData = new PriorityQueue<>();

        priorityQueueData.add(7);
        priorityQueueData.add(9);
        priorityQueueData.add(1);
        priorityQueueData.add(6);
        priorityQueueData.add(13);
        priorityQueueData.add(3);

        System.out.println(priorityQueueData);

        System.out.println(priorityQueueData.poll());

        System.out.println(priorityQueueData);
    }
}
