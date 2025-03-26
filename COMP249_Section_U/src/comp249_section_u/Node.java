package comp249_section_u;

public class Node {

    private String data;
    private Node link;

    public Node(String data, Node link) {
        this.data = data;
        this.link = link;
    }

    public String getData() {
        return this.data;
    }

    public Node getLink() {
        return this.link;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setLink(Node link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Data is: " + this.data;
    }

    @Override
    public boolean equals(Object otherObject) {
        Node otherData = (Node) otherObject;
        return this.data.equals(otherData.data);
    }
}
