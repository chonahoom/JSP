
public class GoodsDelete extends GoodsMethod {
	String yes_no_select;
	boolean delFlag = true;
	
	 public GoodsDelete(){
	      
	         System.out.print("삭제하실 상품명을 입력하세요 : ");
	         searchName=scan.nextLine();   
	         
	      
	   }
	 public void matchMethod(){										//다형성 구현 부모 메소드 오버라이딩
		 searchFail=0;
		 for(int i = 0 ;i < Menulist.size();i++){
	         
	         if(searchName.equals(Menulist.get(i).getter_goodsName())){
	            System.out.println("<<찾은 상품 정보>>");
	            System.out.println("상품명 : " + Menulist.get(i).getter_goodsName());
	            System.out.println("재고 : " + Menulist.get(i).getter_goodsCount());
	            System.out.println("가격 : " +Menulist.get(i).getter_goodsPrice());
	            System.out.print("삭제하실 상품이 존재합니다 . ");
	            System.out.print("삭제하시겠습니까?(y or n) : ");
	            yes_no_select = scan.nextLine();        
	            if(yes_no_select.equals("y")){   
	            	if(Menulist.size() == 1){
		            	   searchFail++; 				//등록된 상품이 1개밖에 없을때  searchFail == Menulist.size() 가 성립하지 않게 하기 위함임.
		            }
	               Menulist.remove(i);
	               System.out.println("삭제되었습니다.");
	               
	               
	            }else{
	            	System.out.println("메인화면으로 돌아갑니다.");
	            	break;
	            }
	        
	         }else{
	            searchFail++;                     //삭제하고자 하는 상품명이 각 인덱스에 없으면 1씩 증가
	         }
	      }
	      if(searchFail == Menulist.size()){            //모든 인덱스에 없으면 그 길이는 컬렉션의 길이와 같으므로, 찾고자하는 상품명이 없음
	         System.out.println("삭제하실 상품이 존재하지 않습니다."); 
	      }
	 }
}
