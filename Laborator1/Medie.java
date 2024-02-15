public class Medie {
    public static void main(String[] args) {
        int[] array = {6, 8 ,2, 7};
        double suma = 0;
        for(int numar : array) {
            suma += numar;
        }
        double medie = suma / array.length;
        System.out.println(medie);
    }
}
