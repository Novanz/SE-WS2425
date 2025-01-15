public class InfoVisitor implements FSVisitor {
    private int depth = 0;
    private int maxDepth = 0;
    private int leafCount = 0;
    private int directoryCount = 0;
    private int totalChildren = 0;

    @Override
    public void visit(File file) {
        leafCount++;
        maxDepth = Math.max(maxDepth, depth);
    }

    @Override
    public void visit(Directory directory) {
        directoryCount++;
        int childCount = directory.getElements().size();
        totalChildren += childCount;

        depth++;
        for (FSElement element : directory.getElements()) {
            element.accept(this);
        }
        depth--;
    }

    public void printStatistics() {
        System.out.println("Maximale Tiefe: " + maxDepth);
        System.out.println("Anzahl Blattknoten: " + leafCount);
        System.out.println("Durchschnittlicher Verzweigungsgrad: " +
            (directoryCount > 0 ? (double)totalChildren/directoryCount : 0));
    }
}
