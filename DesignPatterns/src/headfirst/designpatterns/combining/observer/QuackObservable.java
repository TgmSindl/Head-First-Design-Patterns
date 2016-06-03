package headfirst.designpatterns.combining.observer;

/**
 * @author bethrobson
 * comments tgmsindl
 *
 * Pattern: Observer
 */
public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
