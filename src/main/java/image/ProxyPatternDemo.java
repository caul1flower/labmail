package image;

public class ProxyPatternDemo {
    public static void main(String args[]){
        ProxyImage proxyImage = new ProxyImage("image.jpg");
        proxyImage.display();
    }
}
