public class PrintVisitor implements FSVisitor {
    private String prefix = "";

    @Override
    public void visit(File file) {
        System.out.println(prefix + "- " + file.getName() + " (" + file.getSize() + " KB)");
    }
    @Override
    public void visit(Directory directory) {
        System.out.println(prefix + "+ " + directory.getName());
        String oldPrefix = prefix;
        prefix += "  ";
        for (FSElement element : directory.getElements()) {
            element.accept(this);
        }
        prefix = oldPrefix;
    }
}
