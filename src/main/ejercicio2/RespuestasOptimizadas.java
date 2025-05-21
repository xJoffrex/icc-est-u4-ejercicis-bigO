package main.ejercicio2;

import java.util.HashSet;
import java.util.Set;

public class RespuestasOptimizadas {
    // El estudiante debe escribir aquí las versiones optimizadas y las
    // complejidades

    // 1. Versión optimizada de tieneDuplicados (Complejidad anotada en la variable)
    public static String tieneDuplicadosComplejidad = "O(n)"; // Ej: "O(n)"

    public static boolean tieneDuplicadosOpt(int[] arr) {
        Set<Integer> vistos = new HashSet<>();
        for (int i = 0 ; i < arr.length; i++){
                if (!vistos.add(arr[i])==false){
                    return true;
                }
                   
            }
        return false;
    }

    // 2. Versión optimizada de contarMayores (Complejidad anotada en la variable)
    public static String contarMayoresComplejidad = "O(n2)"; // Ej: "O(n)"

    public static int contarMayoresOpt(int[] arr, int x) {
        int count = 0;
        int max;
    
        if (arr.length == 0) {
            return 0;
        }
    
        max = arr[0] - 1;
    
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                if (arr[i] > x) {
                    count++;
                }
                max = arr[i];
            }
        }
    
        return count;

    }

    // 3. Versión optimizada de encontrarMaximo (Complejidad anotada en la variable)
    public static String encontrarMaximoComplejidad = ""; // Ej: "O(n)"

    public static int encontrarMaximoOpt(int[] arr) {
        if (arr.length == 0) {
            return -1; 
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

