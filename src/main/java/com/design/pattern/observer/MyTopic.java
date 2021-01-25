package com.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyTopic implements Subject {
	List<Observer> observers = new ArrayList<>();
	String message;

	@Override
	public void register(Observer obj) {
		Objects.requireNonNull(obj);
		synchronized (observers) {
			observers.add(obj);
		}
	}

	@Override
	public void unregister(Observer obj) {
		Objects.requireNonNull(obj);
		synchronized (observers) {
			// every concreate class which emplement Observer should have comparable
			// as document of java api "remove" does.
			observers.remove(obj);
		}
	}

	@Override
	public void notifyObservers() {
		synchronized (observers) {
			for (Observer observer : observers) {
				observer.update();
			}
		}
	}

	@Override
	public Object getUpdate(Observer obj) {
		// TODO Auto-generated method stub
		return this.message;
	}

	public void postMessage(String msg) {
		System.out.println("Message Posted to Topic:" + msg);
		this.message = msg;
		notifyObservers();
	}

}
