import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Apple {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[] args) throws Exception{
        //正常的调用
        Apple apple = new Apple();
        apple.setPrice(5);
        System.out.println("Apple Price:" + apple.getPrice());
        //使用反射调用
        /*
        Constructor是一个类,位于java.lang.reflect包下，它代表某个类的构造方法，用来管理所有的构造函数的类.
         */
        /*
        获取Constructor类对象
        一共有4种方法,全部都在Class类中:

        1. getConstructors()：获取类中的公共方法

        2. getConstructor(Class[] params): 获取类的特定构造方法           ,params参数指定构造方法的参数类型

        3. getDeclaredConstructors(): 获取类中所有的构造方法              (public、protected、default、private)

        4. getDeclaredConstructor(Class[] params): 获取类的特            定构造方法,params参数指定构造方法的参数类型
         */
        ////使用反射第一步:获取操作类Apple所对应的Class对象
        Class clz = Class.forName("Apple");
        //获取方法的method对象
        Method setPriceMethod = clz.getMethod("setPrice", int.class);
        //获取默认构造函数
        Constructor appleConstructor = clz.getConstructor();
        //通过默认的构造函数创建Apple类的实例
        Object appleObj = appleConstructor.newInstance();
        //使用invoke来第哦啊用方法setprice
        setPriceMethod.invoke(appleObj, 14);
        Method getPriceMethod = clz.getMethod("getPrice");
        System.out.println("Apple Price:" + getPriceMethod.invoke(appleObj));
    }
}