public class main {
    public static void main (String[] args){

        //instanciar la clase

        cuenta miCuenta = new cuenta("123456", "Ahorro",150000);
        System.out.println("Saldo minimo: " +miCuenta.getSaldoMinimo());
        miCuenta.consignar(80000);
        System.out.println("Saldo Actual: "+miCuenta.getSaldoActual());
        miCuenta.retirar(250000);
        System.out.println("Saldo Actual: "+miCuenta.getSaldoActual());
        System.out.println(miCuenta.toString());
        System.out.println("----------------------------------------");

        cuenta pedroCuenta= new cuenta ("585858","prestamo",5000);
        System.out.println(pedroCuenta.toString());


    }
}
