public class JapaneseFlower implements AbstractFlower{
    private String name;

    public JapaneseFlower(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
