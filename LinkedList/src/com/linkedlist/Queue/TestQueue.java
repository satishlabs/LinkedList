package com.linkedlist.Queue;

public class TestQueue {
	public static void main(String[] args) {
		QueueTest queue = new QueueTest(100);
		queue.enqueue(10); 
        queue.enqueue(20); 
        queue.enqueue(30); 
        queue.enqueue(40); 
        
        System.out.println(queue.dequeue() +  
                     " dequeued from queue\n"); 
        
        System.out.println("Front item is " +  
                               queue.front()); 
           
        System.out.println("Rear item is " +  
                                queue.rear());
	}
}
