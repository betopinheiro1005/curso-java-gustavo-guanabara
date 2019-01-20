package testefuncao;
public class TesteFuncao {
    
    /* static void soma(int a, int b){
            int s = a + b;
            System.out.println("A soma é " + s);
    }

    public static void main(String[] args) {
        soma(5, 19);
    } */
    
    static int soma(int a, int b){
            int s = a + b;
            return s;
    }

    public static void main(String[] args) {
        System.out.println("Começou o programa");
        int sm = soma(23, 18);
        System.out.println("A soma é " + sm);
    } 
    
}
