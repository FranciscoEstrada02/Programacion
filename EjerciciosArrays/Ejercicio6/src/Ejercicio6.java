public class Ejercicio6 {
    private int[] array = {1,2,3,4,5};
    private int[] arrayInvertido = new int[5];

    public void invertirArray(){
        int j = 0;
        for(int i = array.length-1; i >= 0; i--){
            arrayInvertido[j]= array[i];
            System.out.println(arrayInvertido[j]);
            j++;
        }
    }
}
