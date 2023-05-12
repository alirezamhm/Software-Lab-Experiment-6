public class JapaneseGardenCreator implements AbstractGardenCreator {
    @Override
    public JapaneseTree createTree() {
        return new JapaneseTree("Sakura");
    }

    @Override
    public JapaneseFlower createFlower() {
        return new JapaneseFlower("Ume");
    }
}
