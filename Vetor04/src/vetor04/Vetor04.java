package vetor04;

import java.util.Arrays;

public class Vetor04 {
    public static void main(String[] args) {
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        int busca = 8;
        
        for(int v:vet){
            System.out.print(v + " ");
        }
        int p = Arrays.binarySearch(vet, busca);

        if (p < 0){
            System.out.println("\nValor " + busca + " não encontrado!");
        } else {
             System.out.println("\nEncontrei o valor " + busca + " na posição " + p);
        }
    }    
}
