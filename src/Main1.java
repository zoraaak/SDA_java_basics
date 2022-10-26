public class Main1 {
    public static void main(String[] args) {

    Rabbit krolik1=new Rabbit(50, "Hanek", true);
    krolik1.changeName("Stanislaw");
    krolik1.viewName();
        System.out.println(krolik1.viewName());
        krolik1.changeSoftness(false);
        System.out.println(krolik1.viewSoftness());
        krolik1.changeLenght(30);
        System.out.println(krolik1.viewLenght());
        System.out.println(krolik1.convert(30));
    }
}
