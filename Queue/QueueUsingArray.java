package com.Queue;

import java.util.Scanner;

public class QueueUsingArray {
	int queue[];
	int front,rear,size;
	public QueueUsingArray(int n) {
		this.size=n;
		queue= new int[n];
		front = 0;
		rear = -1;
	}

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Size of Array : ");
		int n =  sc.nextInt();
		QueueUsingArray q = new QueueUsingArray(n);
		q.enqueue(30);
		q.enqueue(20);
		q.enqueue(86);
		q.display();
		q.dequeue();
		q.front();
		q.display();
		sc.close();
	}

	private void front() {
		if(front>rear) {
			System.out.println("Queue underflow !!!!");
			return;
		}
		System.out.println("Front Element is At : "+queue[front]);
	}

	private void enqueue(int data) {
		if(rear==size-1) {
			System.out.println("Queue overflow can't add Element : "+data);
			return;
		}
		queue[++rear]=data;
		System.out.println("Enqueued : "+data);
	}

	private void dequeue() {
		if(front>rear) {
			System.out.println("Queue Underflow ");
			return;
		}
		int data= queue[front++];
		System.out.println("Dequeued : "+data);
	}

	private void display() {
		if(front>rear) {
			System.out.println("Queue is Empty ");
			return;
		}
		System.out.println("Current Queue : ");
		for(int i=front;i<=rear;i++) {
			System.out.print(queue[i]+" ");
		}
		System.out.println();
	}
}
