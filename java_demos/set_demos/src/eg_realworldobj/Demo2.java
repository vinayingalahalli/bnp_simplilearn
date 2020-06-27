package eg_realworldobj;

import java.util.Set;
import java.util.TreeSet;

import com.model.Bus;

public class Demo2 {

	public static void main(String[] args) {
		Set<Bus> busList = new TreeSet<>();
		busList.add(new Bus(121, "abc travels", 122.33, 2.3f, "sleeper"));
		busList.add(new Bus(120, "xyz travels", 112.33, 4.3f, "semi-sleeper"));
		busList.add(new Bus(110, "java travels", 192.33, 3.3f, "seater"));
		busList.add(new Bus(211, "jee travels", 142.33, 4.3f, "sleeper"));
		busList.add(new Bus(129, "pqr travels", 142.33, 3.3f, "semi-sleeper"));
		busList.add(new Bus(122, "sss travels", 122.33, 1.3f, "sleeper"));
		busList.add(new Bus(120, "xyz travels", 112.33, 4.3f, "semi-sleeper"));
		busList.add(new Bus(129, "pqr travels", 142.33, 3.3f, "semi-sleeper"));
		busList.add(new Bus(129, "pqr travels", 142.33, 3.3f, "semi-sleeper"));
		busList.add(new Bus(999, "new travels", 142.33, 4.3f, "semi-sleeper"));
		
		System.out.println("Printing all the buses");
		printBusList(busList);

	}
	
	public static void printBusList(Set<Bus> busList) {
		for(Bus b:busList) {
			System.out.println(b);
		}
	}

}
