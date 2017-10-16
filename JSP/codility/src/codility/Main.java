package codility;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
	String line = sc.nextLine();
    String date[] = line.split(" ");
    int x = Integer.parseInt(date[0]);	//행
    int y = Integer.parseInt(date[1]);	//열
    int z = Integer.parseInt(date[2]);  //블럭갯수
  
    String [][] 블럭판 = null;
    블럭판 = new String[x][y];
    
    //블럭 높이 , 블럭 가로, 블럭 위치(좌측기준)
    	
    for(int 블럭갯수=0;블럭갯수<z;블럭갯수++){
    	String block = sc.nextLine();
    	String 블럭속성[] = block.split(" ");
    	int 블럭높이 = Integer.parseInt(블럭속성[0]);
    	int 블럭가로 = Integer.parseInt(블럭속성[1]);
    	int 블럭위치 = Integer.parseInt(블럭속성[2]);
    	int 어느행에서겹치는가 =0;
    	boolean 겹치는가 = false;
    	
    	
    	for(int  행=0;행<x;행++ ){
    		for(int 열=0;열<y;열++){
    				if(블럭판[행][열]=="#" && 열>=블럭위치 && 열<블럭가로+블럭위치){
    					어느행에서겹치는가 = 행;
    					겹치는가=true;
    					행=x;
    					break;
    				}
    				
    		}
    		
    	}
    	
    	
    	for(int  행=0;행<x;행++ ){
    		for(int 열=0;열<y;열++){
    				if(겹치는가==true && 열>=블럭위치 && 열<블럭가로+블럭위치 && 행>=x-블럭높이-(x-어느행에서겹치는가) && 행<x-(x-어느행에서겹치는가) && 블럭판[행][열] != "#" ){
    					블럭판[행][열] = "#";
    				}
    				
    				if(열>=블럭위치 && 열<블럭가로+블럭위치 && 행>=x-블럭높이 && 블럭판[행][열] != "#" && 겹치는가 == false){
    					블럭판[행][열] = "#";
    				}else if(블럭판[행][열] != "#" && 겹치는가 == false){
    					블럭판[행][열] = ".";
    				}
    			
    			
    			
    		}
    		
    	}
    	겹치는가 = false;
    	
    	
    }
    //블럭판 출력
   	for(int 행=0;행<x;행++ ){
   		for(int 열=0;열<y;열++){
   			System.out.print(블럭판[행][열]); 			
   		}
   		System.out.println("");
   		
   	}
    }
}