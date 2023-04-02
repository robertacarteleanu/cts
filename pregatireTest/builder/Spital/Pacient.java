package pregatireTest.builder.Spital;

public class Pacient {
    private boolean isMicDejunInclus;
    private boolean hasPapuciAfara;
    private boolean hasHalatInterior;
    public Pacient(PacientBuilder builder){
        this.isMicDejunInclus= builder.isMicDejunInclus;
        this.hasHalatInterior= builder.hasHalatInterior;
        this.hasPapuciAfara= builder.hasPapuciAfara;

    }

    public void setMicDejunInclus(boolean micDejunInclus) {
        isMicDejunInclus = micDejunInclus;
    }

    public void setHasPapuciAfara(boolean hasPapuciAfara) {
        this.hasPapuciAfara = hasPapuciAfara;
    }

    public void setHasHalatInterior(boolean hasHalatInterior) {
        this.hasHalatInterior = hasHalatInterior;
    }

    public static PacientBuilder builder(){
        return new PacientBuilder();
    }
    public static class PacientBuilder implements Builder{
        private boolean isMicDejunInclus;
        private boolean hasPapuciAfara;
        private boolean hasHalatInterior;

        public PacientBuilder setMicDejunInclus(boolean micDejunInclus) {
            isMicDejunInclus = micDejunInclus;
            return this;
        }

        public PacientBuilder setHasPapuciAfara(boolean hasPapuciAfara) {
            this.hasPapuciAfara = hasPapuciAfara;
            return this;
        }

        public PacientBuilder setHasHalatInterior(boolean hasHalatInterior) {
            this.hasHalatInterior = hasHalatInterior;
            return this;
        }

        @Override
        public Pacient build() {
            return new Pacient(this);
        }
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "isMicDejunInclus=" + isMicDejunInclus +
                ", hasPapuciAfara=" + hasPapuciAfara +
                ", hasHalatInterior=" + hasHalatInterior +
                '}';
    }
}
