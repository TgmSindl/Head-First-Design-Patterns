package headfirst.designpatterns.combining.observer;

/**
 * @author bethrobson
 * comments tgmsindl
 *
 * Pattern: Observer
 */
public class Quackologist implements Observer {
 
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked.");
	}
 
	public String toString() {
		return "Quackologist";
	}
}
