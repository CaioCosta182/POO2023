package ex03heranca;
public class Ex03Heranca {

    public static void main(String[] args) {
        
        Ingresso ingresso = new Ingresso(100);
        Vip vip = new Vip(100, 50);
        CamaroteInferior camInferior = new CamaroteInferior(100, 200, "Segundo" );
        CamaroteSuperior camSuperior = new CamaroteSuperior(100,200,250);
        
        System.out.println("O ingreso normal custa: R$ "+ ingresso.getValor());
        System.out.println("O ingresso Vip custa: R$ " + vip.adicionaVip());
        System.out.println("O ingresso camarote inferior custa: R$ " + camInferior.valorCamaroteInferior() + " e está localizado no "+ camInferior.local());
        System.out.println("O ingresso camarote superior custa: R$ " + camSuperior.calculaSuperior());
    }
    
}
