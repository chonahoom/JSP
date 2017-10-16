
public class GoodsInsert extends GoodsMethod{
	int input_choice;
	
	 public GoodsInsert() {
		 MainMenu.insert_Menu();
		 try{
		 input_choice = MainMenu.keyboard.nextInt();
         MainMenu.keyboard.nextLine();
         
         if(input_choice<1 || input_choice > 2)      	 
        	 throw new MenuChoiceException(input_choice); 
         
         switch(input_choice){
         		case 1:   
         			System.out.print("��ǰ���� �Է��ϼ��� : ");
		             goodsName= scan.nextLine();
		             System.out.print("������ �Է��ϼ��� : ");
		             goodsPrice = scan.nextInt();
		             scan.nextLine();
		            break;
		         case 2:
		        	 System.out.print("��ǰ���� �Է��ϼ��� : ");
		             goodsName= scan.nextLine();
		             System.out.print("��� �Է��ϼ��� : ");
		             goodsCount = scan.nextInt();
		             scan.nextLine();
		             System.out.print("������ �Է��ϼ��� : ");
		             goodsPrice = scan.nextInt();
		             scan.nextLine();
		        	 break;
   
         }}catch (MenuChoiceException e) {
             e.showWrongCode();
             System.out.println("�Է¹���� �ٽ� ������ �ּ���.");
          }
                   
         
         
         
      } 
	 public void matchMethod(){	 
		 searchFail=0;
	      for(int i = 0 ;i < Menulist.size();i++){
	    	  
	          if(goodsName.equals(Menulist.get(0).getter_goodsName())){
	             
	             System.out.println("<<�̹� �ִ� ��ǰ ����>>");
	             System.out.println("��ǰ�� : " + Menulist.get(i).getter_goodsName());
	             System.out.println("��� : " + Menulist.get(i).getter_goodsCount());
	             System.out.println("���� : " +Menulist.get(i).getter_goodsPrice());
	             
	          } else{
	             searchFail++;  }                        //index�� �ϳ��� ��ȸ�ϴµ�, �� �ε�����   searchName ������ 1�� ����
	      } 
	       if(searchFail == Menulist.size()){            //��� �ε����� ������ �� ���̴� �÷����� ���̿� �����Ƿ�, ã�����ϴ� ��ǰ���� ����
	    	   switch(input_choice){
	    	   case 1:
	    		   parameter_Second();
	    		   break;
	    	   case 2:
	    		   parameter_Third();
		    	   break;
	    	   }
	    	   
	    	   System.out.println("<<��� ��ǰ ����>>");
	           System.out.println("��ǰ�� : "+goodsName);
	           System.out.println("��� : "+ goodsCount);
	           System.out.println("���� : "+ goodsPrice);
	           
	       }
	       
	      
  }
	 public void parameter_Second(){
		   Menulist.add(new Goods(goodsName,goodsPrice));
	   }
	 public void parameter_Third(){
		   Menulist.add(new Goods(goodsName,goodsCount,goodsPrice));
	   }
	 
}
