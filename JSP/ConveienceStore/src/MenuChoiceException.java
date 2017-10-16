
public class MenuChoiceException extends Exception {

	private static final long serialVersionUID = 1L;
	int wrongCode;
	
	public MenuChoiceException(int choice){
		super("메뉴 선택 오류");
		wrongCode=choice;
	}
	
	public void showWrongCode(){
		System.out.println(wrongCode+"는 선택할 수 있는 메뉴에 존재하지 않습니다.");
	}

}