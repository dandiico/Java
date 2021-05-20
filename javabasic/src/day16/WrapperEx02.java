package day16;

public class WrapperEx02 {

	public static void main(String[] args) {

		// Wrapper > 기본형
		Integer i = new Integer(10);
		int ii = i.intValue();
		System.out.println(ii);
		
		Character c = new Character('c');
		char cc = c.charValue();
		System.out.println(cc);
		
		Double d = new Double(3.14);
		double dd = d.doubleValue();
		System.out.println(dd);
		
		Boolean b = new Boolean(true);
		boolean bb = b.booleanValue();
		
	}

}
