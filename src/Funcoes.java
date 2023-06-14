public class Funcoes {
    public static boolean verificaNumerosRepetidos(int V[]){
           int quantidade=0;
            for(int i=0; i<V.length; i++){
                for(int j=0; j< V.length; j++){
                    quantidade=0;
                    if(V[i]==V.length){
                        quantidade++;
                    }
                }if (quantidade > 1) {
                    return true;
                }
            }
        return false;
            }
    public static boolean vericaNumerosConsecutivos (int V[]){
        for(int i=0; i< V.length-2; i++){
            if(V[i]==V[i+1]-1 && V[i]==V[i+2]-2){
                return true;
            }
        }
        return false;
    }
    public static boolean verificaPenultimo (int V[]){
        if(V[V.length-2]==0){
            return true;
        }
        return false;
    }
    public static void codificacao (int V[]){
        for(int i=0; i<V.length; i++){
            switch (V[i]) {
                case 0:
                    System.out.print("!");
                    break;
                case 1:
                    System.out.print("@");
                    break;
                case 2:
                    System.out.print("#");
                    break;
                case 3:
                    System.out.print("$");
                    break;
                case 4:
                    System.out.print("?");
                    break;
                case 5:
                    System.out.print("<");
                    break;
                case 6:
                    System.out.print(">");
                    break;
                case 7:
                    System.out.print("*");
                    break;
                case 8:
                    System.out.print("(");
                    break;
                case 9:
                    System.out.print("_");
                    break;
            }
            System.out.println(" ");
        }
        System.out.println();
    }
}
