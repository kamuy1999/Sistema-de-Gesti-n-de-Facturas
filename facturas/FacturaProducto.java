package facturas;

public class FacturaProducto extends Factura {
    private double subtotal;

    public FacturaProducto(String cliente, String fecha, double subtotal){
        super(cliente, fecha);
        this.subtotal = subtotal;
    }

    @Override
    public double calcularTotal(){
        return subtotal;
    }

    @Override
    public String generarDetalle(){
        return "Factura de Producto/nCliente: " + cliente + "/nFecha:  " + fecha + "/nSubtotal: $ " + subtotal;
    }

}

