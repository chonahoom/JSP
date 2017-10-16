
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
         			System.out.print("상품명을 입력하세요 : ");
		             goodsName= scan.nextLine();
		             System.out.print("가격을 입력하세요 : ");
		             goodsPrice = scan.nextInt();
		             scan.nextLine();
		            break;
		         case 2:
		        	 System.out.print("상품명을 입력하세요 : ");
		             goodsName= scan.nextLine();
		             System.out.print("재고를 입력하세요 : ");
		             goodsCount = scan.nextInt();
		             scan.nextLine();
		             System.out.print("가격을 입력하세요 : ");
		             goodsPrice = scan.nextInt();
		             scan.nextLine();
		        	 break;
   
         }}catch (MenuChoiceException e) {
             e.showWrongCode();
             System.out.println("입력방법을 다시 선택해 주세요.");
          }
                   
         
         
         
      } 
	 public void matchMethod(){	 
		 searchFail=0;
	      for(int i = 0 ;i < Menulist.size();i++){
	    	  
	          if(goodsName.equals(Menulist.get(0).getter_goodsName())){
	             
	             System.out.println("<<이미 있는 상품 정보>>");
	             System.out.println("상품명 : " + Menulist.get(i).getter_goodsName());
	             System.out.println("재고 : " + Menulist.get(i).getter_goodsCount());
	             System.out.println("가격 : " +Menulist.get(i).getter_goodsPrice());
	             
	          } else{
	             searchFail++;  }                        //index를 하나씩 조회하는데, 이 인덱스에   searchName 없으면 1씩 증가
	      } 
	       if(searchFail == Menulist.size()){            //모든 인덱스에 없으면 그 길이는 컬렉션의 길이와 같으므로, 찾고자하는 상품명이 없으
	    	   switch(input_choice){
	    	   case 1:
	    		   parameter_Second();
	    		   break;
	    	   case 2:
	    		   parameter_Third();
		    	   break;
	    	   }
	    	   
	    	   System.out.println("<<등록 상품 정보>>");
	           System.out.println("상품명 : "+goodsName);
	           System.out.println("재고 : "+ goodsCount);
	           System.out.println("가격 : "+ goodsPrice);
	           
	       }
	       
	      
  }
	 public void parameter_Second(){
		   Menulist.add(new Goods(goodsName,goodsPrice));
	   }
	 public void parameter_Third(){
		   Menulist.add(new Goods(goodsName,goodsCount,goodsPrice));
	   }
	 
}
