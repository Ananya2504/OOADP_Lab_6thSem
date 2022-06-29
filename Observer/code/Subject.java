public abstract class Subject {
	abstract void attach(Observer o);
	abstract void detach(Observer o);
	abstract void notifyObservers();
}
