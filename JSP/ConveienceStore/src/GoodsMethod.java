import java.util.ArrayList;
import java.util.Scanner;


public class GoodsMethod {
   
  public String goodsName;
  public String searchName;
  public int goodsCount;
  public int goodsPrice;
  public int searchFail;
   
 
  
   public static Scanner scan = new Scanner(System.in);
   
   public static ArrayList <Goods> Menulist = new ArrayList <Goods>();
  
  
   
   public void matchMethod(){
	   searchFail=0;
	   
	   
	   
	      for(int i = 0 ;i < Menulist.size();i++){
	          
	          if(searchName.equals(Menulist.get(i).getter_goodsName())){
	             
	             System.out.print("<<찾은 상품 정보>>");
	              System.out.println("상품명 : " 	+ Menulist.get(i).getter_goodsName());
	              System.out.println("재고 : " 	+ Menulist.get(i).getter_goodsCount());
	              System.out.println("가격 : " 	+ Menulist.get(i).getter_goodsPrice());
	             
	          } else{
	             searchFail++;  }                        //index를 하나씩 조회하는데, 이 인덱스에   searchName 없으면 1씩 증가
	      } 
	       if(searchFail == Menulist.size()){            //모든 인덱스에 없으면 그 길이는 컬렉션의 길이와 같으므로, 찾고자하는 상품명이 없음
	          System.out.println("검색하신 상품명이 존재하지 않습니다.");  
	       }
   }
   
   
   
   
      
   
  
   
//   index 0
//   name: a
//
//   index 1
//   name: b
//
//   index 2
//   name: c
//
//   일때, c를 검색했을 경우 for문은 인덱스의 길이 만큼 돈다.
//   그 다음 차례대로 하나씩 searchname과 goodsname을 비교하는데
//   한번 돌때 searchname c goodsname  a search fail 1
//   두번 돌때 searchname은 c인데 goodsname은 b search fail 2
//   세번 돌때 searchname은 c goodsname c 일치해서 search fail 2
//   2==3은 같지 않으므로 검색한 상품이 나오게 됨

}

   		
