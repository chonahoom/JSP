public class Goods {

      private String goodsName;							//���� ���� 
      private int goodsCount;
      private int goodsPrice;
      Goods(){
       this("�̸�����",0,0);
      }      
     Goods(String name, int price){      				//������ �����ε� .
        this(name,0,price);
     }
      
      Goods(String name, int count, int price){
         
         this.goodsName=name;
         this.goodsCount=count;
         this.goodsPrice=price;
         
      
      }
      public String getter_goodsName(){					//Getter����
          return goodsName;
       }
       public int getter_goodsCount(){
          return goodsCount;
       }
       public int getter_goodsPrice(){
          return goodsPrice;
       }
      
      public void setter_goodsName(String goodsName){	//Setter ����
         this.goodsName = goodsName;
      }
      public void setter_goodsCount(int goodsCount){
         this.goodsCount = goodsCount;
      }
      public void setter_goodsPrice(int goodsPrice){
         this.goodsPrice = goodsPrice;
      }
      
      
      
      
      
     
}
 
 

