public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        System.out.println("Canal Atual : " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual : " + smartTv.canal);

        
        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);
        
    }
}