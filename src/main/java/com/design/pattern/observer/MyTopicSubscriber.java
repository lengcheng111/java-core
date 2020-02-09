package com.design.pattern.observer;

// TODO make this class to have comparable
public class MyTopicSubscriber implements Observer {
	private Subject topic;
	String name;

	public MyTopicSubscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update() {
		Object msg = topic.getUpdate(this);
		if (msg == null) {
			System.out.println(name + ":: No new message");
		} else {
			System.out.println(name + ":: Consuming message::" + msg);
		}
	}

	@Override
	public void setSubject(Subject sub) {
		this.topic = sub;
	}

}
