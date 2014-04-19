package lab2;

public class ArrayList {
	private Object sumdata[] = new Object[1];
	private int from = 0;

	public void add(Object obj) {
		add(from, obj);
	}

	public void add(int b, Object obj) {
		ensureCapacity(from + 1);
		for (int i = from - 1; i >= b; i--) {
			sumdata[i + 1] = sumdata[i];
		}
		sumdata[b] = obj;
		from++;
	}

	public void ensureCapacity(int capacity) {
		if (capacity > sumdata.length) {
			int s = 2 * sumdata.length;
			Object[] arr = new Object[s];
			for (int i = 0; i < from; i++) {
				arr[i] = sumdata[i];
			}
			sumdata = arr;
		}
	}

	public void remove(int i) {
		for (int j = i; j < from - 1; j++) {
			sumdata[j] = sumdata[j + 1];
		}
		sumdata[from - 1] = null;

	}

	public void addFirst(Object obj) {
		add(0, obj);
	}

	public void addLast(Object obj) {
		add(from, obj);
	}

	public static void main(String[] args) {
		ArrayList num = new ArrayList();
		num.add("111");
		num.add("222");
		System.out.println(num);

	}

	public String toString() {
		String dist = "[";
		for (int i = 0; i < from; i++) {
			if (i == from - 1) {
				dist = dist + sumdata[i] + "]";
			} else {
				dist = dist + sumdata[i] + ",";
			}
		}
		return dist;
	}
}
