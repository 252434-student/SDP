import assignment6.*;

public class Main {
    public void main(String[] args){
        TotalSizeVisitor totalSizeVisitor = new TotalSizeVisitor();
        SearchVisitor searchVisitor = new SearchVisitor();
        StatisticsVisitor statisticsVisitor = new StatisticsVisitor();

        DirectoryNode dir1 = new DirectoryNode("dir1");
        dir1.add(new FileNode("file1",1024));
        dir1.add(new FileNode("file2",1024));
        dir1.add(new FileNode("file3",1024));
        dir1.add(new FileNode("file4",1024));
        dir1.add(new FileNode("file5",1024));
        DirectoryNode dir2 = new DirectoryNode("dir2");
        dir2.add(new FileNode("file6",1024));
        dir2.add(new FileNode("file7",1024));
        dir2.add(new FileNode("file8",1024));
        dir1.add(dir2);


        totalSizeVisitor.visit(dir1);
        totalSizeVisitor.getTotalByteSize();

        searchVisitor.setPattern("file2");
        searchVisitor.visit(dir1);
        searchVisitor.getPath();

        statisticsVisitor.visit(dir1);
        statisticsVisitor.getCount();
    }
}
