package pregatireTest.builder.Farmacie;

public class Factura {
    private boolean hasNumarPungi;
    private boolean isPlataCuCard;
    private boolean hasCardFidelitate;
    private boolean isCotaTVA;

    public Factura(FacturaBuilder builder){
        this.hasNumarPungi=builder.hasNumarPungi;
        this.isPlataCuCard=builder.isPlataCuCard;
        this.hasCardFidelitate=builder.hasCardFidelitate;
        this.isCotaTVA=builder.isCotaTVA;

    }
    public boolean isHasNumarPungi() {
        return hasNumarPungi;
    }

    public boolean isPlataCuCard() {
        return isPlataCuCard;
    }

    public boolean isHasCardFidelitate() {
        return hasCardFidelitate;
    }

    public boolean isCotaTVA() {
        return isCotaTVA;
    }
    public static FacturaBuilder builder(){
        return new FacturaBuilder();
    }
    public static class FacturaBuilder{
        private boolean hasNumarPungi;
        private boolean isPlataCuCard;
        private boolean hasCardFidelitate;
        private boolean isCotaTVA;


        public FacturaBuilder setHasNumarPungi(boolean hasNumarPungi) {
            this.hasNumarPungi = hasNumarPungi;
            return this;

        }

        public FacturaBuilder setPlataCuCard(boolean plataCuCard) {
            isPlataCuCard = plataCuCard;
            return this;
        }

        public FacturaBuilder setHasCardFidelitate(boolean hasCardFidelitate) {
            this.hasCardFidelitate = hasCardFidelitate;
            return this;
        }

        public FacturaBuilder setCotaTVA(boolean cotaTVA) {
            this.isCotaTVA = cotaTVA;
            return this;
        }
        public Factura build(){
            return new Factura(this);
        }
    }

    @Override
    public String toString() {
        return "Factura{" +
                "hasNumarPungi=" + hasNumarPungi +
                ", isPlataCuCard=" + isPlataCuCard +
                ", hasCardFidelitate=" + hasCardFidelitate +
                ", osCotaTva=" + isCotaTVA +
                '}';
    }
}
