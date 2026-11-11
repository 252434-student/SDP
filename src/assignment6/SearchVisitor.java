package assignment6;

public class SearchVisitor implements Visitor{
    String path = "";
    String pattern;
    boolean match = false;

    public void setPattern(String pattern){
        this.pattern = pattern;
    }

    @Override
    public void visit(FileNode fileNode) {
        if(fileNode.fileName.contains(pattern) && !match){
            this.path += fileNode.fileName;
            match = true;
        }
    }

    @Override
    public void visit(DirectoryNode directoryNode) {
        if(!match) {
            path += directoryNode.directoryName + "/";
            for (Element e : directoryNode.directory) {
                e.accept(this);
            }
        }
    }

    public void getPath(){
        if(match) {
            System.out.println(this.path);
        }
        else{
            System.out.println("No match found.");
        }
    }
}
