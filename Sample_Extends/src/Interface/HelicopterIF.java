package Interface;

public class HelicopterIF implements IFlyingObject  {
	@Override
	public void fly() {
		System.out.println("プロペラで飛びます");
	}
}
