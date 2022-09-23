public class Main {

    public static void main(String[] args){
        //ejercicioIf();
        //ejercicioWhile();
        //ejercicioDoWhile();
        //ejercicioFor();
        ejercicioSwich();
    }
    public static void ejercicioIf(){
        int numeroIF = 0;

        if(numeroIF > 0){
            System.out.println("Es mayor que 0");
        } else if (numeroIF < 0) {
            System.out.println("Es menor que 0");
        }else {
            System.out.println("Es 0");
        }
    }
    public static void ejercicioWhile(){
        int numeroWhile = 0;

        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
    }
    public static void ejercicioDoWhile(){
        int numeroDoWhile = 2;
        do{
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile < 3);

    }
    public static void ejercicioFor(){
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }
    }
    public static void ejercicioSwich(){
        var estacion = "verano";
        switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("Aprende a escribir");
        }
    }
}
