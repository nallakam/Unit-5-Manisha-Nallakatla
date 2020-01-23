public class SloganClient {
    public static void main(String[] args) {
        Slogan subway = new Slogan("Eat fresh!");
        Slogan mcdonalds = new Slogan("I'm lovin' it.");

        System.out.println(subway.getSlogan());
        System.out.println(Slogan.getCount());
    }
}