public class IranianFlower implements AbstractFlower{
    private String name;

    public IranianFlower(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
