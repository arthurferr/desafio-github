package singleton;

public class Singleton3 {

    private static class Singleton3InstanceHolder{
        public static Singleton3 instancia3 = new Singleton3();
    }

    private Singleton3(){
        super();
    }

    public static Singleton3 getInstancia(){
        return Singleton3InstanceHolder.instancia3;
    }
}
