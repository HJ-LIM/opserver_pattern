import domain.NewsMachine;
import domain.bean.AnnualSubscriber;
import domain.bean.EventSubscriber;

public class Main {
	public static void main(String[] args) {
		NewsMachine newsMachine = new NewsMachine();

		new AnnualSubscriber(newsMachine);
		EventSubscriber eventSubscriber = new EventSubscriber(newsMachine);

		newsMachine.setNewsInfo("오늘 한파", "전국 영하 18도 입니다.");
		// newsMachine.delete(eventSubscriber);
		eventSubscriber.withdraw();
		newsMachine.setNewsInfo("벛꽃 축제합니다", "다같이 벚꽃보러~");
	}
}
