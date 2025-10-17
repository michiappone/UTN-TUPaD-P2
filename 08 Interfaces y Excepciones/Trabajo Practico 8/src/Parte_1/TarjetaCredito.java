
package Parte_1;

class TarjetaCredito implements PagoConDescuento {
    @Override
    public double aplicarDescuento(double monto) {
        System.out.println("Aplicando 10% de descuento por tarjeta de crédito...");
        return monto * 0.9;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado con Tarjeta de Crédito por $" + monto);
    }
}

class PayPal implements PagoConDescuento {
    @Override
    public double aplicarDescuento(double monto) {
        System.out.println("Aplicando 5% de descuento por PayPal...");
        return monto * 0.95;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado con PayPal por $" + monto);
    }
}
