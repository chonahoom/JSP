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
	             
	             System.out.print("<<ã�� ��ǰ ����>>");
	              System.out.println("��ǰ�� : " 	+ Menulist.get(i).getter_goodsName());
	              System.out.println("��� : " 	+ Menulist.get(i).getter_goodsCount());
	              System.out.println("���� : " 	+ Menulist.get(i).getter_goodsPrice());
	             
	          } else{
	             searchFail++;  }                        //index�� �ϳ��� ��ȸ�ϴµ�, �� �ε�����   searchName ������ 1�� ����
	      } 
	       if(searchFail == Menulist.size()){            //��� �ε����� ������ �� ���̴� �÷����� ���̿� �����Ƿ�, ã�����ϴ� ��ǰ���� ����
	          System.out.println("�˻��Ͻ� ��ǰ���� �������� �ʽ��ϴ�.");  
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
//   �϶�, c�� �˻����� ��� for���� �ε����� ���� ��ŭ ����.
//   �� ���� ���ʴ�� �ϳ��� searchname�� goodsname�� ���ϴµ�
//   �ѹ� ���� searchname c goodsname  a search fail 1
//   �ι� ���� searchname�� c�ε� goodsname�� b search fail 2
//   ���� ���� searchname�� c goodsname c ��ġ�ؼ� search fail 2
//   2==3�� ���� �����Ƿ� �˻��� ��ǰ�� ������ ��

}

   		
