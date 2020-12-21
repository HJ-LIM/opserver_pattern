package domain.bean;

import domain.Observer;
import domain.Publisher;

public class AnnualSubscriber implements Observer {
	private String newsString;

	public AnnualSubscriber(Publisher publisher) {
		publisher.add(this);
	}

	@Override
	public void update(String title, String news) {
		this.newsString = title + " \n ---------- \n " + news;
		display();
	}

	private void display() {
		System.out.println("\n\n 오늘의 뉴스 \b ======================================= \n\n " + newsString);
	}
}
