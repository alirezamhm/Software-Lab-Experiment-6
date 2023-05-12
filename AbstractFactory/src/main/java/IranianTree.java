public class IranianTree implements AbstractTree{
    private String name;

    public IranianTree(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
