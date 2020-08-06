public class Lookup {
    String nameInput;
    String adjective;
    String noun;
    String adverb;
    String pronounce;

    public Lookup(String nameInput,String pronounce, String adjective, String noun, String adverb) {
        this.nameInput = nameInput;
        this.adjective = adjective;
        this.noun = noun;
        this.adverb = adverb;
        this.pronounce = pronounce;
    }
    public String pronounce(){
        return pronounce;
    };

    public String getNameInput() {
        return nameInput;
    }

    public String getAdjective() {
        return adjective;
    }

    public String getNoun() {
        return noun;
    }

    public String getAdverb() {
        return adverb;
    }
    public String synonym(){
        return synonym();
    }

    @Override
    public String toString() {
        return "Lookup{" +
                ", adjective='" + adjective + '\'' +
                ", noun='" + noun + '\'' +
                ", adverb='" + adverb + '\'' +
                '}';
    }
}
