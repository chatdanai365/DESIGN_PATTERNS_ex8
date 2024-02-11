
public class ImageManager {
	private Strategy_q1 strategy_q1;

	public void setStrategy(Strategy_q1 strategy_q1) {
		this.strategy_q1 = strategy_q1;
	}

	public void show() {
		this.strategy_q1.showImage();
	}
}
