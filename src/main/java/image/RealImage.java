package image;

public class RealImage implements Image{
    private String fileName;
    public RealImage(String filename) {
        this.fileName = filename;
    }
    public void loadFromDisk() {
        System.out.println(fileName + " loaded from the disk");
    }
    @Override
    public void display() {
        System.out.println(fileName + " is displayed");
    }
}
