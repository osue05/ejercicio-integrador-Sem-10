/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.practico3;

import javax.swing.JOptionPane;

/**
 *
 * @author Byron
 */
class Inventario {
    
    private final Producto[] productos;
    private int cantidadProductos;

    public Inventario(int capacidad) {
        productos = new Producto[capacidad];
        cantidadProductos = 0;
    }

    public void agregarProducto(Producto producto) {
        if (cantidadProductos < productos.length) {
            productos[cantidadProductos] = producto;
            cantidadProductos++;
        } else {
            JOptionPane.showMessageDialog(null, "Inventario lleno, no se pueden agregar más productos.");
        }
    }

    public void mostrarProductos() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cantidadProductos; i++) {
            sb.append(productos[i].toString());
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public double calcularTotalGanancia() {
        double totalGanancia = 0;
        for (int i = 0; i < cantidadProductos; i++) {
            totalGanancia += productos[i].getPrecioTotal();
        }
        return totalGanancia;
    }    
}
