public class list {
    int a = 10;
    int b = 4;

    void add(int a) {
        this.a = a;   // class variable me value store hogi
        System.out.println(this.a);
    }

    public static void main(String[] args) {

        list obj = new list();

        obj.add(5);

    }
}