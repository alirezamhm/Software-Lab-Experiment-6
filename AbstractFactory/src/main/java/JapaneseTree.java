public class JapaneseTree implements AbstractTree{
    private String name;

    public JapaneseTree(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
