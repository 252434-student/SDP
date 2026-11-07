package assignment6;

public class StatisticsVisitor implements Visitor{
    int fileCount, directoryCount;

    @Override
    public void visit(FileNode fileNode) {
        this.fileCount++;
    }

    @Override
    public void visit(DirectoryNode directoryNode) {
        this.directoryCount++;
        for(Element e : directoryNode.directory){
            e.accept(this);
        }
    }

    public void getCount(){
        System.out.println("File count: "+fileCount+"\n"
                +"Directory count: "+directoryCount);
    }
}
