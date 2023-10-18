package facturas;

public abstract class Factura implements Facturable {
    protected String cliente;
    protected String fecha;

    public Factura (String cliente, String fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
    }
    // Implementación de los métodos de la interfaz
    public abstract double calcularTotal();

    public abstract String generarDetalle();

    }

