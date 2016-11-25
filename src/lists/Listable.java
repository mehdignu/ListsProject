package lists;
import data.*;
public interface Listable<T> {
	public void addFirst(T data);
	public void addLast(T data);
	public T get(int index);
	public void printAll();
	public int getSize();
	public void delete(int index);
	public void clear();
	public void search(String f, String l, int s,String p);
	public void sort1();
	public void sort2();
	public void add(T data);
}
