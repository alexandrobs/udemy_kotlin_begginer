public class Teste {

    public void ternario(){
        int valor = 10;
        //com operador ternario
        String str = valor == 10 ? "Sim" : "Não";

        //sem operador ternario
        String a;
        if (valor == 10){
            a = "Sim";
        } else {
            a = "Não";
        }
    }

    public static void main(String[] args) {
        System.out.println("Olá mundo");
    }
}
