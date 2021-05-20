package day12;
// 상속을 이용하여 다음 클래스들을 간결한 구조로 재작성하세요.
class Pen{
	private int amount;
	public int getAmount() { return amount; }
	public void setAmount(int amount) { this.amount = amount; }	
}

class SharpPencil extends Pen { 
	private int width; 
}

class BallPen extends Pen { 
private String color;	
public String getColor() { return color; }
public void setColor(String color) { this.color = color; }
}

class FountainPen extends BallPen { // 상속 받았지만 private 되어 있어 우회해서 접근
	public void refill(int n) { setAmount(n); }
}

public class InheritEx02 {

	public static void main(String[] args) {
Object obj;
		
	}

}
