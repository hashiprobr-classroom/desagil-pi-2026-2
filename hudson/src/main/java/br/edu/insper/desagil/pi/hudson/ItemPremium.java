package br.edu.insper.desagil.pi.hudson;

public class ItemPremium extends Item {
    public ItemPremium(String nome, double minimo) {
        super(nome, minimo);
    }

    @Override
    public void fazLance(Comprador comprador, double oferta) {
        if (oferta >= 1000000) {
            super.fazLance(comprador, oferta);
        }
    }
}
