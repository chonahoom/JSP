package codility;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // ��ª���������ު�
        // Let's �����󫸣���
        Scanner sc = new Scanner(System.in);
	String line = sc.nextLine();
    String date[] = line.split(" ");
    int x = Integer.parseInt(date[0]);	//��
    int y = Integer.parseInt(date[1]);	//��
    int z = Integer.parseInt(date[2]);  //������
  
    String [][] ���� = null;
    ���� = new String[x][y];
    
    //�� ���� , �� ����, �� ��ġ(��������)
    	
    for(int ������=0;������<z;������++){
    	String block = sc.nextLine();
    	String ���Ӽ�[] = block.split(" ");
    	int ������ = Integer.parseInt(���Ӽ�[0]);
    	int ������ = Integer.parseInt(���Ӽ�[1]);
    	int ����ġ = Integer.parseInt(���Ӽ�[2]);
    	int ����࿡����ġ�°� =0;
    	boolean ��ġ�°� = false;
    	
    	
    	for(int  ��=0;��<x;��++ ){
    		for(int ��=0;��<y;��++){
    				if(����[��][��]=="#" && ��>=����ġ && ��<������+����ġ){
    					����࿡����ġ�°� = ��;
    					��ġ�°�=true;
    					��=x;
    					break;
    				}
    				
    		}
    		
    	}
    	
    	
    	for(int  ��=0;��<x;��++ ){
    		for(int ��=0;��<y;��++){
    				if(��ġ�°�==true && ��>=����ġ && ��<������+����ġ && ��>=x-������-(x-����࿡����ġ�°�) && ��<x-(x-����࿡����ġ�°�) && ����[��][��] != "#" ){
    					����[��][��] = "#";
    				}
    				
    				if(��>=����ġ && ��<������+����ġ && ��>=x-������ && ����[��][��] != "#" && ��ġ�°� == false){
    					����[��][��] = "#";
    				}else if(����[��][��] != "#" && ��ġ�°� == false){
    					����[��][��] = ".";
    				}
    			
    			
    			
    		}
    		
    	}
    	��ġ�°� = false;
    	
    	
    }
    //���� ���
   	for(int ��=0;��<x;��++ ){
   		for(int ��=0;��<y;��++){
   			System.out.print(����[��][��]); 			
   		}
   		System.out.println("");
   		
   	}
    }
}