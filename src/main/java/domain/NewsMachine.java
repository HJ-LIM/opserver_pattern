package domain;

import java.util.ArrayList;

import lombok.Getter;


@Getter
public class NewsMachine implements Publisher {
	private ArrayList<Observer> observers;
	private String title;
	private String news;

	public NewsMachine() {
		observers = new ArrayList<>();
	}

	@Override
	public void add(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void delete(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		observers.forEach(observer -> {
			observer.update(title , news);
		});
	}

	public void setNewsInfo(String title , String news){
		this.title = title;
		this.news = news;
		notifyObserver();
	}
}