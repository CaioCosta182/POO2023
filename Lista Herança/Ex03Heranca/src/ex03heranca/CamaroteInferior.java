package ex03heranca;
    public class CamaroteInferior extends Vip {
        
        private String localizacao;
        
    public CamaroteInferior(double valor,double adicional,  String localizacao) {
        super(valor, adicional );
        this.localizacao = localizacao;
    }
    public String  local(){
        return "segundo andar.";
    }
    public double valorCamaroteInferior(){
    return   valor + adicional;
    }
    
}
