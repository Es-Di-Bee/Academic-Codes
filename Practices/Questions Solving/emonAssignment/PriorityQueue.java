package emonAssignment;

import java.util.Arrays;
public class PriorityQueue {
	
	Data[] d = null;
    int size = 0, rear = 0;

    public PriorityQueue(int sz) {
        d = new Data[sz];
        size = 0;
        rear = -1;
    }
	
	public boolean add(int number, int priority) {
		if (size == d.length) {
            System.err.println("Queue is Full\n");
            return false;
        } else if (size == 0) {
            rear = 0;
        }
        d[rear] = new Data(number, priority);
        rear++;
        ++size;
        return true;
	}
	
	public int remove() {
		int minP = d[0].priority;
		int minNum = d[0].number;
		int index = 0;
		for (int i = 0; i < size; ++i) {
			if (d[i].priority < minP) {
				minP = d[i].priority;
				minNum = d[i].number;
				index = i;
			}
		}
		for (int i = index, j = 0; j < size-index-1; ++j, ++i) {
			int from = i+1;
			d[i] = d[from];
		}
		if(rear == 0) rear = -1;
		else rear--;
		--size;
		
		return minNum;
	}
	
	public void changePriority(int number, int newPriority) {
		for (int i = 0; i < d.length; ++i) {
			if (d[i].number == number) d[i].priority = newPriority;
		}
	}
	
}
