package pregatireTest.builder.Restaurant;

public class Rezervare {
    private boolean isAsezareLaGeam;
    private boolean hasScaunErgonomic;

    public Rezervare(RezervareBuilder builder){
        this.isAsezareLaGeam= builder.isAsezareLaGeam;
        this.hasScaunErgonomic= builder.hasScaunErgonomic;
    }

    public boolean isAsezareLaGeam() {
        return isAsezareLaGeam;
    }

    public boolean isHasScaunErgonomic() {
        return hasScaunErgonomic;
    }
    public static RezervareBuilder builder(){
        return new RezervareBuilder();
    }
    public static class RezervareBuilder implements Builder{
        private boolean isAsezareLaGeam;
        private boolean hasScaunErgonomic;

        public RezervareBuilder setAsezareLaGeam(boolean asezareLaGeam) {
            isAsezareLaGeam = asezareLaGeam;
            return this;
        }

        public RezervareBuilder setHasScaunErgonomic(boolean hasScaunErgonomic) {
            this.hasScaunErgonomic = hasScaunErgonomic;
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
                "isAsezareLaGeam=" + isAsezareLaGeam +
                ", hasScaunErgonomic=" + hasScaunErgonomic +
                '}';
    }
}
