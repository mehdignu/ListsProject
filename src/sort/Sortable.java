package sort;

import java.util.Comparator;
import java.util.List;

public interface Sortable<T> {
	void sort(List<T> list, Comperator<T> comp);
}
