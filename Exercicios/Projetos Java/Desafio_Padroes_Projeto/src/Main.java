import facade.Facade;

public class Main {
    public static void main(String[] args) {
        /*Singleton*/
//        Singleton singleton = Singleton.getInstancia();
//        System.out.println(singleton);
//
//        singleton = Singleton.getInstancia();
//        System.out.println(singleton);
//
//        Singleton2 singleton2 = Singleton2.getInstancia();
//        System.out.println(singleton2);
//
//        singleton2 = Singleton2.getInstancia();
//        System.out.println(singleton2);
//
//        Singleton3 singleton3 = Singleton3.getInstancia();
//        System.out.println(singleton3);
//
//        singleton3 = Singleton3.getInstancia();
//        System.out.println(singleton3);

        /* Strategy */
//        Comportamento normal = new ComportamentoNormal();
//        Comportamento defensivo = new ComportamentoDefensivo();
//        Comportamento agressivo = new ComportamentoAgressivo();
//
//        Robo robo = new Robo();
//        robo.setComportamento(normal);
//        robo.mover();

        /* Facade */
    Facade facade = new Facade();
    facade.migrarCliente("Arthur", "18207270");

    }
}
