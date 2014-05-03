package lab2;

public class ArrayListStack {

	private ArrayList lst;

    public ArrayListStack() {
         lst = new ArrayList();
    }

    public void push(Object e) {
        lst.add(e);
    }

    public Object peek() {
        return lst.get(0);
    }

    public Object pop() {
        Object obj = lst.get(0);
        lst.remove(0);
        return obj;
    }

	public String toString() {
		String dist = "[";
		for (int i = 0; i < lst.from; i++) {
			if (i == lst.from - 1) {
				dist = dist + lst.get(i) + "]";
			} else {
				dist = dist + lst.get(i) + ",";
			}
		}
		return dist;
	}

}
