package synch_eg;

public class SynchMain {

	public static void main(String[] args) {
		new Messages("hey hi ", "how are you doing today?");
		new Messages("good afternoon ", "i am doing good");
		new Messages("hello everyone ", "i am doing ok on saturday and getting trained");
		new Messages("afternoon ", "IDK when this guy is gonna leave us for lunch");
		new Messages("saturday ", "train train and train");
		new Messages("have a nice day ", "have fun with training with late lunch");
	}

}
//yield()
//wait() vs sleep()
//wait() notify() notifyAll()
//consumer - producer problem
//why wait() notify() and notifyAll() are in Object class not in Thread class