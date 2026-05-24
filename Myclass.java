public class Myclass {
    int x;
    int y;

    public void add(){
        x = 2;
        y = 3;
        System.out.println(x+y);
    
    }
    public static void main(String[] args){
        Myclass obj = new Myclass();
        obj.add();
        
    }
}
