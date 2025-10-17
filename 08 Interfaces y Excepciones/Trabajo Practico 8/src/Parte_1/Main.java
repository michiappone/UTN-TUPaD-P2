
package Parte_1;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Michael", "michi@example.com");
        Pedido pedido = new Pedido(cliente);

        Producto p1 = new Producto("Mouse Gamer", 5000);
        Producto p2 = new Producto("Teclado Mecánico", 10000);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        System.out.println("Total sin descuento: $" + pedido.calcularTotal());

        PagoConDescuento metodoPago = new TarjetaCredito();
        double totalConDescuento = metodoPago.aplicarDescuento(pedido.calcularTotal());
        metodoPago.procesarPago(totalConDescuento);

        pedido.cambiarEstado("Pagado");
    }
    
}
