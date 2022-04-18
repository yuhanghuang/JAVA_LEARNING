import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Car{
    public void run(){
        System.out.println("----running");
    }
    public Car() {
        // TODO Auto-generated constructor stub
        System.out.println("Car()");
    }
    public Car(int i){
        System.out.println("Car(i)");

    }
}
public class Temp1 {
    public static void main(String[] args) {
        Class<Car> clazz = Car.class;
        try {
            Constructor<Car> constructor = clazz.getConstructor();
            Car car =  constructor.newInstance();
            Constructor<Car> constructor2= clazz.getConstructor(int.class);
            Car car2 = constructor2.newInstance(2);
            car.run();
            car2.run();
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}