package pregatireTest.builder.Sportiv;

public class Rezervare {
    private boolean hasMancareInclusa;
    private boolean hasScaunErgonomic;
    private boolean hasBauturaRacoritoareInclusa;
    private boolean isMuzicaAmbientalaPersonalizata;

    public Rezervare(RezervareBuilder builder) {
        this.hasMancareInclusa = builder.hasMancareInclusa;
        this.hasScaunErgonomic =  builder.hasScaunErgonomic;
        this.hasBauturaRacoritoareInclusa =  builder.hasBauturaRacoritoareInclusa;
        this.isMuzicaAmbientalaPersonalizata =  builder.isMuzicaAmbientalaPersonalizata;
    }

    public boolean isHasMancareInclusa() {
        return hasMancareInclusa;
    }

    public boolean isHasScaunErgonomic() {
        return hasScaunErgonomic;
    }

    public boolean isHasBauturaRacoritoareInclusa() {
        return hasBauturaRacoritoareInclusa;
    }

    public boolean isMuzicaAmbientalaPersonalizata() {
        return isMuzicaAmbientalaPersonalizata;
    }
    public static RezervareBuilder builder(){
        return new RezervareBuilder();
    }
    public static class RezervareBuilder implements Builder{
        private boolean hasMancareInclusa;
        private boolean hasScaunErgonomic;
        private boolean hasBauturaRacoritoareInclusa;
        private boolean isMuzicaAmbientalaPersonalizata;

        public RezervareBuilder setHasMancareInclusa(boolean hasMancareInclusa) {
            this.hasMancareInclusa = hasMancareInclusa;
            return this;
        }

        public RezervareBuilder setHasScaunErgonomic(boolean hasScaunErgonomic) {
            this.hasScaunErgonomic = hasScaunErgonomic;
            return this;
        }

        public RezervareBuilder setHasBauturaRacoritoareInclusa(boolean hasBauturaRacoritoareInclusa) {
            this.hasBauturaRacoritoareInclusa = hasBauturaRacoritoareInclusa;
            return this;
        }

        public RezervareBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
            isMuzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
            return this;
        }

        @Override
        public Rezervare build() {
            return new Rezervare(this);
        }
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "hasMancareInclusa=" + hasMancareInclusa +
                ", hasScaunErgonomic=" + hasScaunErgonomic +
                ", hasBauturaRacoritoareInclusa=" + hasBauturaRacoritoareInclusa +
                ", isMuzicaAmbientalaPersonalizata=" + isMuzicaAmbientalaPersonalizata +
                '}';
    }
}
