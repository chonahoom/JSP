
public class MenuChoiceException extends Exception {

	private static final long serialVersionUID = 1L;
	int wrongCode;
	
	public MenuChoiceException(int choice){
		super("�޴� ���� ����");
		wrongCode=choice;
	}
	
	public void showWrongCode(){
		System.out.println(wrongCode+"�� ������ �� �ִ� �޴��� �������� �ʽ��ϴ�.");
	}

}