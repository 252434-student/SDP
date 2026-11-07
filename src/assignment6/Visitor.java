package assignment6;

public interface Visitor {
    void visit(FileNode fileNode);
    void visit(DirectoryNode directoryNode);
}
