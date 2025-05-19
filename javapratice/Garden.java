public class Garden{
    int  appleprice=20;
    int applecount=5;
    void total_money()
    {
        int total_money=appleprice*applecount;
        System.out.println("sum of apples is:"+total_money);
    }

    public static void main (String args[])
    {
        Garden obj1=new Garden();
        obj1.total_money();
    }
}