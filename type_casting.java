import java.lang.*;
class type_casting
{
    public static void main (String args[])
    {
        //winding casting 
        //byte ->Short->char->int->long->float->double->
        //Narrowing Casitng 
        //double->float->long->int->char->short->byte

        int a=10;
        double b=a, d=25.5385;
        int c=(int)d;

        System.out.println("Int:"+a);
        System.out.println("Double:"+b);
        System.out.println("Double:"+d);
        System.out.println("Int:"+c);




    }
}