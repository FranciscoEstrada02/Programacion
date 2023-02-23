import java.util.HashMap;


public class Ejercicio8 {
    HashMap<Character, Integer> hashMap = new HashMap<>();
    private Character[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public void recorrer() {
        for (int i = 0; i < letras.length; i++) {
            hashMap.put(letras[i], i);
        }
    }

    public void asignar(int dni) {
        int valor = dni % 23;
        Object[] keys = hashMap.keySet().toArray();
        if(){
            System.out.println("VALOR NO VALIDO");
        }else if (hashMap.containsValue(valor)) {
            System.out.printf("%d%s", dni, keys[valor]);
        }
    }
}
