public class Usuario {
    public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();

       System.out.println("TV LIGADA?" + smartTv.ligada);
       System.out.println("CANAL ATUAL: " + smartTv.canal);
       System.out.println("VOLUME ATUAL: " + smartTv.volume);

       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.aumentarVolume();
       
       
       System.out.println("Canal Atual: " + smartTv.canal);
       smartTv.mudarCanal(13);
       System.out.println("Canal Atual: " + smartTv.canal);


       System.out.println("Volume atual: " + smartTv.volume);

       smartTv.ligar();
       System.out.println("TV LIGADA? novo status-> " + smartTv.ligada);
  
       smartTv.deligar();
       System.out.println("TV LIGADA? novo status-> " + smartTv.ligada);
        
    
    }
}