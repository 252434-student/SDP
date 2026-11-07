package assignment6;

public class TotalSizeVisitor implements Visitor{
    long totalByteSize;

    @Override
    public void visit(FileNode fileNode) {
        totalByteSize += fileNode.fileByteSize;
    }

    @Override
    public void visit(DirectoryNode directoryNode) {
        for(Element element : directoryNode.directory){
            element.accept(this);
        }
    }

    public void getTotalByteSize() {
        System.out.println("Total file size (in bytes) = "+totalByteSize);
    }
}
