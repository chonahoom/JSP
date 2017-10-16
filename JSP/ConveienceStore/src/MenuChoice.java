public class MenuChoice {
   
   public static void main(String[] args) {
      int choice = 0;
      
      GoodsMethod method = new GoodsMethod();
      while(true){
         MainMenu.menu();
         try{
         choice = MainMenu.keyboard.nextInt();
         MainMenu.keyboard.nextLine();
         
         
         
         if(choice<MENU_BAR.INPUT || choice > MENU_BAR.EXIT)      	 
        	 throw new MenuChoiceException(choice); 
        	 switch(choice){
         case MENU_BAR.INPUT:   
        	method = new GoodsInsert();
            method.matchMethod();
            break;
         case MENU_BAR.UPDATE:
        	 method = new GoodsUpdate();
             method.matchMethod();
        	 break;
         case MENU_BAR.SEARCH:
        	 method = new GoodsSearch();
             method.matchMethod();
            break;
         case MENU_BAR.DELETE:
        	 method = new GoodsDelete();
             method.matchMethod();
            break;
         case MENU_BAR.LIST:
        	 method = new GoodsList();
        	 method.matchMethod();
            break;   
         case MENU_BAR.EXIT:
            System.out.println("���α׷� ����");
            return;   
            }
         }catch (MenuChoiceException e) {
                e.showWrongCode();
                System.out.println("�޴��� �ٽ� ������ �ּ���.");
             }
         } 
      }
   }

