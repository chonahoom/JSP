import java.util.Scanner;

public class MainMenu {
   
   public static Scanner keyboard = new Scanner(System.in);
   
      public static void menu(){
    	 System.out.println(); 
         System.out.println("●메뉴를 선택하세요●");
         System.out.println("① 상품 등록");
         System.out.println("② 재고 변경");
         System.out.println("③ 상품 검색");
         System.out.println("④ 상품 제거");
         System.out.println("⑤ 상품 목록");   
         System.out.println("⑥ 종　  료"); 
      }
      public static void insert_Menu(){
    	 System.out.println(); 
    	 System.out.println("●입력방법을 고르시오●");
 		 System.out.println("① 상품명,가격입력");
 		 System.out.println("② 상품명,재고,가격입력");
      }
   }