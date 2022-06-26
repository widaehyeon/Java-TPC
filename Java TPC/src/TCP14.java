import kr.tpc.MemberVO;

public class TCP14 {
	public static void main(String[] args) {
		
		MemberVO m = new MemberVO();
		
		m.setName("È«±æµ¿");
		m.setAge(1000);
		m.setTel("010-1111-1111");
		m.setAddr("¼­¿ï");
		
		System.out.print(m.getName()+"\t");
		System.out.print(m.getAge()+"\t");
		System.out.print(m.getTel()+"\t");
		System.out.print(m.getAddr()+"\t");
	}	
}
