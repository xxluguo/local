package pojo;

public class Paper {
    private String size;
    private String provider;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "size='" + size + '\'' +
                ", provider='" + provider + '\'' +
                '}';
    }
}
