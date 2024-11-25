public enum Vehiculo {
AUTOMOVIL{

    @Override
    public void obtenerNumeroMatricula(){
        System.out.println("A1l12");

    }

    } ,
MOTOCICLETA{

    @Override
    public void obtenerNumeroMatricula(){
        System.out.println("LS12W3");
    }

    },
BICICLETA{

    @Override
    public void obtenerNumeroMatricula(){
        System.out.println("32LSW1");
    }
    }
}
