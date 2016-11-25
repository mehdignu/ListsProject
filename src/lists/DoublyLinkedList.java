package lists;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import data.*;
import lists.SinglyLinkedList.Node;
public class DoublyLinkedList<T> implements Listable<T> {

	private Node head;
	private Node tail;
	
	private class Node{
		T data;
		Node next;
		Node prev;
	}
	
	@Override
	public void add(T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int index) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printAll() {
		System.out.println(this.getClass().getSimpleName());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addFirst(T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addLast(T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search(String f, String l, int s, String p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sort1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sort2() {
		// TODO Auto-generated method stub
		
	}
	
	

}
