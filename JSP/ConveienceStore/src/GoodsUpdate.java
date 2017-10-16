public class GoodsUpdate extends GoodsMethod{
	String yes_no_select;
	int count;
	boolean delFlag = true;
	
	 public GoodsUpdate(){
	      
	         System.out.print("변경하실 상품명을 입력하세요 : ");
	         searchName=scan.nextLine();   
	         
	      
	   }
	 public void matchMethod(){
		 searchFail=0;
		 for(int i = 0 ;i < Menulist.size();i++){
	         
	         if(searchName.equals(Menulist.get(i).getter_goodsName())){
	            System.out.println("<<찾은 상품 정보>>");
	            System.out.println("상품명 : " + Menulist.get(i).getter_goodsName());
	            System.out.println("재고 : " + Menulist.get(i).getter_goodsCount());
	            System.out.println("가격 : " +Menulist.get(i).getter_goodsPrice());
	            System.out.print("변경하실 상품이 존재합니다 . ");
	            
	            System.out.print("변경하시겠습니까?(y or n) : ");
	            yes_no_select = scan.nextLine();        
	            if(yes_no_select.equals("y")){           
	            	System.out.print("변경할 재고 수를 입력하시오 : ");
	            	count= scan.nextInt();
	            	scan.nextLine();
	               Menulist.get(i).setter_goodsCount(count);
	               System.out.println("변경되었습니다.");
	               
	            }else{
	            	System.out.println("메인화면으로 돌아갑니다.");
	            	break;
	            }
	        
	         }else{
	            searchFail++;                   		//삭제하고자 하는 상품명이 각 인덱스에 없으면 1씩 증가하구
	         }
	      }
	      if(searchFail == Menulist.size()){            //모든 인덱스에 없으면 그 길이는 컬렉션의 길이와 같으므로, 찾고자하는 상품명이 없음
	         System.out.println("변경하실 상품이 존재하지 않습니다."); 
	      }
	 }
}
