import kr.tpc.BookVO;

public class TCP11 {
	public static void main(String[] args) {
		// å 1���� �����ϱ����� [��ü�� ����]�Ͻÿ�.
		BookVO b = new BookVO();
		b.title="���̽�";
		b.price=16000;
		b.company="������";
		b.page=700;
		
		System.out.print(b.title+"\t");
		System.out.print(b.price+"\t");
		System.out.print(b.company+"\t");
		System.out.println(b.page);
		
		BookVO c = new BookVO();
		c.title="����Ŭ";
		c.price=16000;
		c.company="�������ۺ���";
		c.page=560;
		
		System.out.print(c.title+"\t");
		System.out.print(c.price+"\t");
		System.out.print(c.company+"\t");
		System.out.println(c.page);
	}
}
