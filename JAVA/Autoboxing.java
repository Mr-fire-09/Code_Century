public class Autoboxing {

    public static void main(String[] args) {

        int x = 5;
        float y = 3.14f;
        long z = 6000;

        Integer intObj = x;
        Float floatObj = y;
        Long longObj = z;

        System.out.println(intObj);
        System.out.println(floatObj);
        System.err.println(longObj);

    }

}
