
public class GoodsSearch extends GoodsMethod {
	public GoodsSearch(){
	      
	      
	      System.out.print("�˻��Ͻ� ��ǰ���� �Է��ϼ��� : ");
	      searchName=scan.nextLine();
	      
	      if(Menulist.size() == 0){
	         System.out.println("��ǰ�� ����� �ּ���.");
	      }
	}
	public void matchMethod(){
		searchFail=0;
	      for(int i = 0 ;i < Menulist.size();i++){
	          
	          if(searchName.equals(Menulist.get(i).getter_goodsName())){
	             
	             System.out.print("<<ã�� ��ǰ ����>>");
	             System.out.println("��ǰ�� : " + Menulist.get(i).getter_goodsName());
	             System.out.println("��� : " + Menulist.get(i).getter_goodsCount());
	             System.out.println("���� : " +Menulist.get(i).getter_goodsPrice());
	             
	          } else{
	             searchFail++;  }                        //index�� �ϳ��� ��ȸ�ϴµ�, �� �ε�����   searchName ������ 1�� ����
	      } 
	       if(searchFail == Menulist.size()){            //��� �ε����� ������ �� ���̴� �÷����� ���̿� �����Ƿ�, ã�����ϴ� ��ǰ���� ����
	          System.out.println("�˻��Ͻ� ��ǰ���� �������� �ʽ��ϴ�.");  
	       }
 }
}
