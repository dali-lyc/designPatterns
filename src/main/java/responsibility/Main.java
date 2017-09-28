package responsibility;

/**
 * Created by lyc28724 on 2017/9/27.
 */
public class Main {
    public static void main(String[] args) {
        MyHandler myHandler1 = new MyHandler("h1");
        MyHandler myHandler2 = new MyHandler("h2");
        MyHandler myHandler3 = new MyHandler("h3");

        myHandler1.setHandler(myHandler2);
        myHandler2.setHandler(myHandler3);

        myHandler1.operator();
    }
}
