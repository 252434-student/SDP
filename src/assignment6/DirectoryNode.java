package assignment6;

import java.util.ArrayList;

public class DirectoryNode implements Element{
    String directoryName;
    ArrayList<Element> directory = new ArrayList<>();

    public DirectoryNode(String name){
        this.directoryName = name;
    }

    public void add(Element element){
        directory.add(element);
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
