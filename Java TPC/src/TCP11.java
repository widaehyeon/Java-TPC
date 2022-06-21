import kr.tpc.BookVO;

public class TCP11 {
	public static void main(String[] args) {
		// 책 1권을 저장하기위해 [객체를 생성]하시오.
		BookVO b = new BookVO();
		b.title="파이썬";
		b.price=16000;
		b.company="에이콘";
		b.page=700;
		
		System.out.print(b.title+"\t");
		System.out.print(b.price+"\t");
		System.out.print(b.company+"\t");
		System.out.println(b.page);
		
		BookVO c = new BookVO();
		c.title="오라클";
		c.price=16000;
		c.company="이지스퍼블리싱";
		c.page=560;
		
		System.out.print(c.title+"\t");
		System.out.print(c.price+"\t");
		System.out.print(c.company+"\t");
		System.out.println(c.page);
	}
}
