package com.utilclass;

import java.util.ArrayList;
import java.util.List;

public class Queue<E> {
	
	private List<E> elements;
	private boolean empty;
	
	public Queue(){
		elements = new ArrayList<>();
	}
	public void enque(E e){
		elements.add(e);
	}
	
	public E deque(){
		if(elements.size()>0){
			return elements.get(0);			
		}
		return null;
	}
	
	public int size(){
		return elements.size();
	}

}
