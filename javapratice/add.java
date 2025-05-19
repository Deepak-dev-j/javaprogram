public class add{
    void sum(int num1,int num2){
        System.err.println(num1+num2);

    }
    void mul(int num1,int num2){
        System.out.println(num1*num2);
    }
    void div(int num1,int num2){
        System.out.println(num1/num2);
    }
    public static void main (String args[]){
        add obj=new add();
        obj.sum(10,2);
        obj.mul(3,4);
        obj.div(4,2);

    }
}