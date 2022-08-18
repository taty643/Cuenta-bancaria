public class main {
    public static void main (String[] args){

        //instanciar la clase

        Cuenta miCuenta = new Cuenta( "prestamo", 5000);
        System.out.println("Saldo minimo: " +miCuenta.getSaldoMinimo());
        miCuenta.consignar(monto:8000);
        System.out.println("Saldo Actual: "+miCuenta.getSaldoActual());
        miCuenta.retirar(monto:250000);
        System.out.println("Saldo Actual: "+miCuenta.getSaldoActual());
        System.out.println(miCuenta.toString());
        System.out.println("----------------------------------------");

        Cuenta pedroCuenta= new Cuenta (numero: "585858", tipo: "prestamo", valorInicial: 5000);


    }
}
