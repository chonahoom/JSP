package codility;

import java.util.Arrays;


public class SpiralArray {
    int data[][];
    int row;
    int col;    
    public static final int UP=0, RIGHT=1, DOWN=2, LEFT=3; 
    String msg;
    public SpiralArray(int row, int col) {
        super();
        this.row = row;
        this.col = col;
        this.data= new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
                data[i][j]=-1;
        }
        msg=null;
    }
    public void fill(){
        int x=0, y=0, way=RIGHT;        
        if(data==null) {
            System.out.println("Cannot fill SpiralArray!");
            return;
        }       

        for(int i=0;i<row*col;i++){         
            data[y][x]=i;           
            switch(way){
                case UP:
                    if(y==0 || data[y-1][x]!=-1){
                        way=RIGHT;
                        x+=1;
                    }else{
                        y-=1;
                    }
                    break;
                case DOWN:
                    if(y==row-1 || data[y+1][x]!=-1){
                        way=LEFT;
                        x-=1;
                    }else{
                        y+=1;
                    }
                    break;
                case RIGHT:
                    if(x==col-1 || data[y][x+1]!=-1){
                        way=DOWN;
                        y+=1;
                    }else{
                        x+=1;
                    }
                    break;
                case LEFT:
                    if(x==0 || data[y][x-1]!=-1){
                        way=UP;
                        y-=1;
                    }else{
                        x-=1;
                    }
                    break;                  
            }           
        }
    }
    public void show(){     
        if(data==null || msg!=null) {
            System.out.println("Cannot print SpiralArray!");
            return;
        }

        msg="";
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
                msg+=String.format(" %4d", data[i][j]);
            msg+="\n";
        }
        System.out.println(msg);
        msg=null;
    }
    public static void main(String[] args) {
        int row, col;
        SpiralArray spiralArray = new SpiralArray(6, 6);
        spiralArray.fill();
        spiralArray.show();
    }
}