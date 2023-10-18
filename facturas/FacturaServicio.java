package facturas;

public class FacturaServicio extends Factura{
    private double costoServicio;

    public FacturaServicio (String cliente, String fecha, double costoServicio){
      super(cliente, fecha);
      this.costoServicio = costoServicio;
    }

    @Override
    public double calcularTotal(){
        //Aplicar el 8% de IVA al costo del servicio
        return costoServicio * 1.08;
    }

    @Override
    public String generarDetalle(){
        return "Factura de Servicios\nCliente: " + cliente + "\nFecha: " + fecha + "\nCosto del Servicio: $" + costoServicio;
    }
}
