public class Principal {
    public static void main(String[] args) {
        // Se crea una sola tienda y se registran sus clientes.
        Tienda tienda = new Tienda("Tienda de conveniencia", "Carlos Castaneda",
                "Av. Luis Moya 345");

        Cliente felipe = new Cliente("Felipe Calderon", "Las Lomas 123", "calde@msn.com");
        Cliente enrique = new Cliente("Enrique Peña", "5 de Mayo 321", "quique@gmail.com");
        Cliente andres = new Cliente("Andres Lopez", "Palacio Nacional 321", "peje@yahoo.com");
        Cliente xochitl = new Cliente("Xochitl Gelatinas", "Danone 123", "xochitl@precidencia.gob.mx");

        tienda.agregarCliente(felipe);
        tienda.agregarCliente(enrique);
        tienda.agregarCliente(andres);
        tienda.agregarCliente(xochitl);

        // Primer reporte: todos los clientes todavía están sin ventas.
        tienda.reporte("Reporte de clientes sin ventas");

        // Ventas de Felipe Calderon.
        felipe.agregarVenta(new VentaContado("Martillo", 10.0, 60.50, 10.0, "Sacabrocados"));
        felipe.agregarVenta(new VentaCredito("Pala", 2.0, 1170.55, 3.0, 10.0));

        // Ventas de Enrique Peña.
        enrique.agregarVenta(new VentaCredito("Clavo", 2.5, 160.34, 2.0, 20.0));
        enrique.agregarVenta(new VentaCredito("Cinta de Aislar", 5.0, 71.34, 6.0, 20.0));
        enrique.agregarVenta(new VentaContado("Pinzas", 10.0, 650.33, 20.0, "Taladro"));

        // Venta de Andres Lopez.
        andres.agregarVenta(new VentaContado("Thiner", 50.0, 65.00, 10.0, "Aerosol"));

        // Segundo reporte: se muestran las ventas y los acumulados.
        tienda.reporte("Reporte de ventas de los clientes");
    }
}
