public class Ejercicio7 {
    private int[] arrayPredeterminado = {3,27,28,49,100,34,3,98,43,12,89,12,36,56};

    private int[] arrayNuevo = new int[14];

    public void rellenarArray(){
        for(int i = 0; i < arrayNuevo.length; i++){
            if(arrayPredeterminado[i] > 25 && arrayPredeterminado[i] % 2 == 0){
                arrayNuevo[i] = arrayPredeterminado[i];

            }
            System.out.println(arrayNuevo[i]);

        }

    }
}
