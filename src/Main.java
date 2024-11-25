public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Parqueadero");

        Cliente cliente = new Cliente();
        cliente. setNombre("Crithina");
        cliente. setApellido("Martinez");

        Empleado empleado = new Empleado();
        empleado.setNombre("Fernado");
        empleado.setApellido("Ortega");

        System.out.println("Tipo de vehiculo: ");
        Vehiculo vehiculo = Vehiculo.AUTOMOVIL;
        System.out.println("Numero de matricula");
        System.out.println("numero de matricula");
        vehiculo.obtenerNumeroMatricula();

        System.out.println("Estado: ");
        Espacio espacio = Espacio.RESERVADO;

        Parqueadero parqueadero = new Parqueadero();
        parqueadero.setNumeroDePiso(3);

        Plaza plaza = new Plaza();
        plaza. setIdePlaza("14");

        TiempoUso tiempo = new TiempoUso();
        tiempo.setHoraDeIngreso ("7,30");
        tiempo.setHoraDeRetiro("10,45");
        tiempo.setTiempoTranscurrido("11.15");
        PagoTotal pagoTotal = new PagoTotal();
        pagoTotal. setMontoTotal("32.5");

        System.out.println("subcripcion ");
        Suscripcion suscripcion = new Suscripcion();
        suscripcion.verificarCuentaDeSuscripcion("registrada");

        System.out.println("pago con: ");
        MetodoPago metodoPago = MetodoPago.TARJETA;



    }
}