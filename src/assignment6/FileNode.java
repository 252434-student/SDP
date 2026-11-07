package assignment6;

public class FileNode implements Element{
    String fileName;
    long fileByteSize;

    public FileNode(String name, long byteSize){
        this.fileName = name;
        this.fileByteSize = byteSize;
    }

    @Override
    public void accept(TotalSizeVisitor totalSizeVisitor) {
        totalSizeVisitor.visit(this);
    }

    @Override
    public void accept(SearchVisitor searchVisitor) {
        searchVisitor.visit(this);
    }

    @Override
    public void accept(StatisticsVisitor statisticsVisitor) {
        statisticsVisitor.visit(this);
    }
}
