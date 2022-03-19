import java.util.Arrays;
import java.util.Comparator;

public class ArrayLearning {

	public static void main(String[] args) {
		int[] arr = {5,3,10,18,92};
		
		for(int i: arr)
			System.out.println(i);
		Arrays.sort(arr);
		System.out.println("after sorting :");
		for(int i: arr)
			System.out.println(i);
		String[] names = {"vijay","surya","balaji","siva"};
		System.out.println("*************************");
		Arrays.sort(names);
		for(String i: names)
			System.out.println(i);
		
		//Dynamic binding
		
		Comparator comp = new ComparatorDemo();
       Arrays.sort(names,comp);
       System.out.println("**********************");
       for(String i: names)
			System.out.println(i);
       

	}

}
