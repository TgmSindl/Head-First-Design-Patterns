package headfirst.designpatterns.combining.observer;

/**
 * @author bethrobson
 * comments tgmsindl
 * 
 * Pattern: Factory 
 * Vererbt an CountingDuckFactory und DuckFactory
 * 
 */
public abstract class AbstractDuckFactory {
 
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
