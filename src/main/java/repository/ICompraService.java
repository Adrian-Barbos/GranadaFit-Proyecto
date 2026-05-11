package repository;

import model.Producto;
import model.Usuario;

public interface ICompraService {
    /**
     * Tu misión: Validar si hay stock y dinero antes de vender.
     */
    boolean procesarCompra(Usuario usuario, Producto producto, int cantidad);
}