import java.util.Arrays;

public class TheArrays {

    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";
        colors[2] = "pink";
        colors[3] = "yellow";
        colors[4] = "green";

        System.out.println(colors);
        System.out.println("Colors in array are: " + Arrays.toString(colors));

        System.out.println("Color at the first index is " + colors[0]);


        int[] numbers = {100, 200};

        // looping through Arrays
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
    }


}
