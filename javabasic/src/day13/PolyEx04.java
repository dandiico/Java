package day13;
// 매개변수의 다형성
class Product {
	int price;	// 제품의 가격
	int point;	// 제품구매시 제공하는 보너스 점수
	Product(int price){
		this.price = price;
		point = (int)(price/10.0); // 포인트는 제품가격의 10%
	}
	
}

class Tv extends Product{	// price, point
	Tv(){
		super(100); // 부모클래스에 100을 던져서 초기화
	}
	@Override
	public String toString() {
		return "Tv";
	}
}
class Computer extends Product { // price, point
	Computer(){
		super(200);
	}
	@Override // Object로 부터 물려받은것
		public String toString() {
			return "Computer";
		}
}

class Buyer{
	int money = 1000;	// 고객의 돈
	int point = 0;	// 고객이 갖고 있는 포인트 점수 저장

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return; // 메소드 강제종료
		}
		
		money -= p.price;
		point += p.point;
		System.out.println(p + "를 구입하셨습니다.");
	}
	

}
public class PolyEx04 {
	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		
		//System.out.println(tv); //toString() 호출
		
		b.buy(tv);
		b.buy(com);
		
		
		System.out.println(b.money);
		System.out.println("현재 남은 돈은" + b.money +"입니다");
		System.out.println("현재 보너스 포인트는" + b.point +"입니다");
		
	}
}
