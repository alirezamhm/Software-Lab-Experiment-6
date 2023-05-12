public class Client {
    private AbstractGardenCreator gardenCreator;
    private AbstractFlower flower;
    private AbstractTree tree;

    public Client(AbstractGardenCreator gardenCreator) {
        this.gardenCreator = gardenCreator;
        this.flower = gardenCreator.createFlower();
        this.tree = gardenCreator.createTree();
    }
}
