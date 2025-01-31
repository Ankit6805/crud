package com.observer;

public class ObserverPatternExample {

	public static void main(String[] args) {
		ConcreteSubjects subject =new ConcreteSubjects();
		
		Observer observer1 =new ConcreteObserver("Observer 1");
		Observer observer2 =new ConcreteObserver("Observer 2");
		
		subject.addObserver(observer1);
		subject.addObserver(observer2);
		
		subject.setState("state changed to 'X' ");

	}

}
