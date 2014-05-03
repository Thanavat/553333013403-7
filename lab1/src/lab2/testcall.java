package lab2;

public class testcall {

	public static void main(String[] args) {
		ArrayList num = new ArrayList();
		ArrayListStack als = new ArrayListStack();
		num.add("111");
		num.add("222");
		als.push("aaaaa");
		als.push("aaaab");
		als.push("aaaac");
		als.push("aaaad");
		als.push("aaaae");
		als.pop();
		System.out.println(als.peek());

	}

}
