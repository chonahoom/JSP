
public class GoodsSearch extends GoodsMethod {
	public GoodsSearch(){
	      
	      
	      System.out.print("검색하실 상품명을 입력하세요 : ");
	      searchName=scan.nextLine();
	      
	      if(Menulist.size() == 0){
	         System.out.println("상품을 등록해 주세요.");
	      }
	}
	public void matchMethod(){
		searchFail=0;
	      for(int i = 0 ;i < Menulist.size();i++){
	          
	          if(searchName.equals(Menulist.get(i).getter_goodsName())){
	             
	             System.out.print("<<찾은 상품 정보>>");
	             System.out.println("상품명 : " + Menulist.get(i).getter_goodsName());
	             System.out.println("재고 : " + Menulist.get(i).getter_goodsCount());
	             System.out.println("가격 : " +Menulist.get(i).getter_goodsPrice());
	             
	          } else{
	             searchFail++;  }                        //index를 하나씩 조회하는데, 이 인덱스에   searchName 없으면 1씩 증가
	      } 
	       if(searchFail == Menulist.size()){            //모든 인덱스에 없으면 그 길이는 컬렉션의 길이와 같으므로, 찾고자하는 상품명이 없음
	          System.out.println("검색하신 상품명이 존재하지 않습니다.");  
	       }
 }
}
