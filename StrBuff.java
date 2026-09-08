public class StrBuff {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        sb.insert(5, " Java");
        sb.replace(0, 5, "Hi");
        sb.delete(2, 7);

        System.out.println(sb);
    }
}