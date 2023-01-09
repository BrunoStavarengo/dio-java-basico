public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        

        System.out.println("Tv esta ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);;

        smartTv.ligar();
        System.out.println("Tv esta ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);;

        smartTv.mudarCanal(5);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.desligar();
        System.out.println("Tv esta ligada? " + smartTv.ligada);
    }
}
