package org.b3log;

public class CoverageTest {

    public CoverageTest() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    
    public static int  testadd(int x, int y){
        int c = 0;
        if(x == 10){
            c = x + y;
        }else{
            c = (x + y)*2;
        }
        return c;
    }
}
