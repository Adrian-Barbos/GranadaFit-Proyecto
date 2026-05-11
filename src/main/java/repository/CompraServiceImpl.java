package repository; //

import model.Producto; // Importa el archivo de Adrián
import model.Usuario;  // Importa el archivo de Héctor

public class CompraServiceImpl implements ICompraService {

    @Override
    public boolean procesarCompra(Usuario usuario, Producto producto, int cantidad) {

        // 1. Miramos si Adrián tiene stock suficiente
        // OJO: Si 'stock' te sale en rojo, es que Adrián aún no lo ha creado en Producto.java
        if (producto.stock < cantidad) {
            System.out.println("No hay suficiente stock");
            return false;
        }

        // 2. Miramos si el usuario de Héctor tiene dinero
        if (usuario.saldo < (producto.precio * cantidad)) {
            System.out.println("El usuario no tiene dinero");
            return false;
        }

        // 3. Si todo está bien, restamos (Tu lógica de Cerebro)
        producto.stock -= cantidad;

        return true;
    }
}