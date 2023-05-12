public class IranianGardenCreator implements AbstractGardenCreator {
    @Override
    public IranianTree createTree() {

        return new IranianTree("Chenar");
    }
    @Override
    public IranianFlower createFlower() {
        return new IranianFlower("Mikhak");
    }
}
