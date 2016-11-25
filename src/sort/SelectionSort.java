package sort;

import java.util.List;

public class SelectionSort<T> implements Sortable<T> {

	@Override
	public void sort(List<T> list, Comperator<T> comp) {
		int minimum;
		for(int i=0;i< list.size();++i){
			minimum = i;
			for(int e =i+1;e< list.size();++e){
				if(comp.compare(list.get(e), list.get(minimum)) < 0){
					minimum = e;
				}
			}
			swap(list,i,minimum);
		}
	}
	
	private void swap(List<T> list,int i,int e){
		T memorizeObj = list.get(i);
		list.set(i, list.get(e));
		list.set(e, memorizeObj);
	}

}
