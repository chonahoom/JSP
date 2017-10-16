public class Goods {

      private String goodsName;							//정보 은닉 
      private int goodsCount;
      private int goodsPrice;
      Goods(){
       this("이름없음",0,0);
      }      
     Goods(String name, int price){      				//생성자 오버로딩 .
        this(name,0,price);
     }
      
      Goods(String name, int count, int price){
         
         this.goodsName=name;
         this.goodsCount=count;
         this.goodsPrice=price;
         
      
      }
      public String getter_goodsName(){					//Getter구현
          return goodsName;
       }
       public int getter_goodsCount(){
          return goodsCount;
       }
       public int getter_goodsPrice(){
          return goodsPrice;
       }
      
      public void setter_goodsName(String goodsName){	//Setter 구현
         this.goodsName = goodsName;
      }
      public void setter_goodsCount(int goodsCount){
         this.goodsCount = goodsCount;
      }
      public void setter_goodsPrice(int goodsPrice){
         this.goodsPrice = goodsPrice;
      }
      
      
      
      
      
     
}
 
 

