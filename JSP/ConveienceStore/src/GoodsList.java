
public class GoodsList extends GoodsMethod {
	public GoodsList(){
		System.out.println("-------------------------");
		System.out.println("|　상품명　||　재고　||　가격　|");
		System.out.println("-------------------------");
	}
	
	public void matchMethod(){	 
		 if(Menulist.size()==0){
   		  System.out.println("|　등록　　상품　　없음　|");
		 }
	      for(int i = 0 ;i < Menulist.size();i++){	
	    	 
	    	  
	        System.out.println("|　"+Menulist.get(i).getter_goodsName()+"　||　"+
	        						Menulist.get(i).getter_goodsCount()+"　||　"+
	        						Menulist.get(i).getter_goodsPrice()+"　|");
	    	  
	      }
	                             
	} 
	             
 
}
