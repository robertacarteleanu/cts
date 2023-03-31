package S6_activitate;

public class Burger {
    private String chifla;
    private String carne;
    private String sos;
    private String legume;
    private String condimente;
    public Burger(BurgerBuilder builder){
        this.chifla= builder.chifla;
        this.carne= builder.carne;
        this.sos= builder.sos;
        this.legume= builder.legume;
        this.condimente= builder.condimente;

    }

    public void setChifla(String chifla) {
        this.chifla = chifla;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setSos(String sos) {
        this.sos = sos;
    }

    public void setLegume(String legume) {
        this.legume = legume;
    }

    public void setCondimente(String condimente) {
        this.condimente = condimente;
    }

    public static BurgerBuilder builder(){
        return new BurgerBuilder();
    }
    public static class BurgerBuilder implements Builder{
        private String chifla;
        private String carne;
        private String sos;
        private String legume;
        private String condimente;

        public BurgerBuilder setChifla(String chifla) {
            this.chifla = chifla;
            return this;
        }

        public BurgerBuilder setCarne(String carne) {
            this.carne = carne;
            return this;
        }

        public BurgerBuilder setSos(String sos) {
            this.sos = sos;
            return this;
        }

        public BurgerBuilder setLegume(String legume) {
            this.legume = legume;
            return this;
        }

        public BurgerBuilder setCondimente(String condimente) {
            this.condimente = condimente;
            return this;
        }

        @Override
        public Burger build() {
            return new Burger(this);
        }
    }

    @Override
    public String toString() {
        return "Burger{" +
                "chifla='" + chifla + '\'' +
                ", carne='" + carne + '\'' +
                ", sos='" + sos + '\'' +
                ", legume='" + legume + '\'' +
                ", condimente='" + condimente + '\'' +
                '}';
    }
}
