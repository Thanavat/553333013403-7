package compare;

import java.util.Arrays;
public class TestCar {

	
	public static void main(String[] args) {
		Car[] CarArrays = new Car[] {
				new Car("Honda","ö������䫤�",43000),
				new Car("Kubota","ö������",60000),
				new Car("LA","ö�ѡ��ҹ",2000)};
				Arrays.sort(CarArrays);
				System.out.println(Arrays.toString(CarArrays));
}
}