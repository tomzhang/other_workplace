package javatest;

import java.util.Random;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class SynchronicQueueTest {
	public static void main(String[] args) {
		SynchronousQueue<Integer> queue = new SynchronousQueue<Integer>();
		new Customer(queue).start();
		new Product(queue).start();
	}

	static class Product extends Thread {
		SynchronousQueue<Integer> queue;

		public Product(SynchronousQueue<Integer> queue) {
			this.queue = queue;
		}

		@Override
		public void run() {
			while (true) {
				int rand = new Random().nextInt(1000);
				System.out.println("������һ����Ʒ��" + rand);
				System.out.println("�ȴ���������ͳ�ȥ...");
				try {
					TimeUnit.SECONDS.sleep(3);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				queue.offer(rand);
			}
		}
	}

	static class Customer extends Thread{  
        SynchronousQueue<Integer> queue;  
        public Customer(SynchronousQueue<Integer> queue){  
            this.queue = queue;  
        }  
        @Override  
        public void run(){  
            while(true){  
                try {  
                    System.out.println("������һ����Ʒ:"+queue.take());  
                } catch (InterruptedException e) {  
                    e.printStackTrace();  
                }  
                System.out.println("------------------------------------------");  
            }  
        }  
    }
}