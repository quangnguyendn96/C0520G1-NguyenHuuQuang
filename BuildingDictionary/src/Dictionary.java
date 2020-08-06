public class Dictionary {
    String wordInput;
    String method;
    String pronounce;
    Dictionary dictionary;
    String synonym;

    public Dictionary(String wordInput, String pronounce, String method, String synonym) {
        this.wordInput = wordInput;
        this.method = method;
        this.pronounce = pronounce;
        this.synonym = synonym;
    }

    public Dictionary(String pronounce, String method, String synonym) {
        this.method = method;
        this.pronounce = pronounce;
        this.synonym = synonym;
    }

    public String pronounce() {
        return pronounce;
    }

    public String getPronounce() {
        return pronounce;
    }

    public Dictionary getDictionary() {
        return dictionary;
    }

    public String getWordInput() {
        return wordInput;
    }

    public String synonym() {
        return synonym();
    }

    @Override
    public String toString() {
        return "Pronounce= " + pronounce + '\n' +
                method + '\n' +
                "Synonym= " + synonym;
    }
}
