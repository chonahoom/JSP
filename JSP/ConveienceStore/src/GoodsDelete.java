
public class GoodsDelete extends GoodsMethod {
	String yes_no_select;
	boolean delFlag = true;
	
	 public GoodsDelete(){
	      
	         System.out.print("�����Ͻ� ��ǰ���� �Է��ϼ��� : ");
	         searchName=scan.nextLine();   
	         
	      
	   }
	 public void matchMethod(){										//������ ���� �θ� �޼ҵ� �������̵�
		 searchFail=0;
		 for(int i = 0 ;i < Menulist.size();i++){
	         
	         if(searchName.equals(Menulist.get(i).getter_goodsName())){
	            System.out.println("<<ã�� ��ǰ ����>>");
	            System.out.println("��ǰ�� : " + Menulist.get(i).getter_goodsName());
	            System.out.println("��� : " + Menulist.get(i).getter_goodsCount());
	            System.out.println("���� : " +Menulist.get(i).getter_goodsPrice());
	            System.out.print("�����Ͻ� ��ǰ�� �����մϴ� . ");
	            System.out.print("�����Ͻðڽ��ϱ�?(y or n) : ");
	            yes_no_select = scan.nextLine();        
	            if(yes_no_select.equals("y")){   
	            	if(Menulist.size() == 1){
		            	   searchFail++; 				//��ϵ� ��ǰ�� 1���ۿ� ������  searchFail == Menulist.size() �� �������� �ʰ� �ϱ� ������.
		            }
	               Menulist.remove(i);
	               System.out.println("�����Ǿ����ϴ�.");
	               
	               
	            }else{
	            	System.out.println("����ȭ������ ���ư��ϴ�.");
	            	break;
	            }
	        
	         }else{
	            searchFail++;                     //�����ϰ��� �ϴ� ��ǰ���� �� �ε����� ������ 1�� ����
	         }
	      }
	      if(searchFail == Menulist.size()){            //��� �ε����� ������ �� ���̴� �÷����� ���̿� �����Ƿ�, ã�����ϴ� ��ǰ���� ����
	         System.out.println("�����Ͻ� ��ǰ�� �������� �ʽ��ϴ�."); 
	      }
	 }
}
