package study14;

public class MemberImp1 implements MemberVO {

	@Override
	public void insert() {
		System.out.println("저장처리");
	}

	@Override
	public void select() {
		System.out.println("출력처리");
	}

	@Override
	public void update() {
		System.out.println("수정처리");
	}

	@Override
	public void delete() {
		System.out.println("삭제처리");
	}

	public static void main(String[] args) {
		MemberImp1 member = new MemberImp1();
		member.insert();
		member.select();
	}

}
