public class GoodsUpdate extends GoodsMethod{
	String yes_no_select;
	int count;
	boolean delFlag = true;
	
	 public GoodsUpdate(){
	      
	         System.out.print("�����Ͻ� ��ǰ���� �Է��ϼ��� : ");
	         searchName=scan.nextLine();   
	         
	      
	   }
	 public void matchMethod(){
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
	            	System.out.print("������ ��� ���� �Է��Ͻÿ� : ");
	            	count= scan.nextInt();
	            	scan.nextLine();
	               Menulist.get(i).setter_goodsCount(count);
	               System.out.println("����Ǿ����ϴ�.");
	               
	            }else{
	            	System.out.println("����ȭ������ ���ư��ϴ�.");
	            	break;
	            }
	        
	         }else{
	            searchFail++;                   		//�����ϰ��� �ϴ� ��ǰ���� �� �ε����� ������ 1�� �����ϱ�
	         }
	      }
	      if(searchFail == Menulist.size()){            //��� �ε����� ������ �� ���̴� �÷����� ���̿� �����Ƿ�, ã�����ϴ� ��ǰ���� ����
	         System.out.println("�����Ͻ� ��ǰ�� �������� �ʽ��ϴ�."); 
	      }
	 }
}
