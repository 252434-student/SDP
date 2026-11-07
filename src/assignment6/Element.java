package assignment6;

public interface Element {
    void accept(TotalSizeVisitor totalSizeVisitor);
    void accept(SearchVisitor searchVisitor);
    void accept(StatisticsVisitor statisticsVisitor);
}
