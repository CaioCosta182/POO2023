package classeabstrata;
    public class Comissionado extends Empregado{
        
        private double totalVendas;
        private double taxaComissao;

    public Comissionado(double totalVendas, double taxaComissao) {
        this.totalVendas = totalVendas;
        this.taxaComissao = taxaComissao;
    }

    public Comissionado(String n, String sn, String doc, double totalVendas, double taxaComissao) {
        super(n, sn, doc);
        this.totalVendas = totalVendas;
        this.taxaComissao = taxaComissao;
    }
        
        
        
    @Override
    public double vencimento() {
        
            return (this.totalVendas * this.taxaComissao);
        
    }
    
}
