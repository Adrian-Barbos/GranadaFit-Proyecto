package database;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {
        Connection miCon = ConexionDB.conectar();

        try {
            String sql = "INSERT INTO productos (nombre, marca, precio, stock) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = miCon.prepareStatement(sql);
            ps.setString(1, "Creatina Monohidrato");
            ps.setString(2, "MyProtein");
            ps.setDouble(3, 29.99);
            ps.setInt(4, 50);

            ps.executeUpdate();
            System.out.println("¡Producto guardado con éxito!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}