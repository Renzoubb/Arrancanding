package PACKAGE_NAME;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class CarritoComprasTest {
    CarritoCompras carrito = new CarritoCompras();
    Producto p1 = new Producto("Celular Huawei p10",31000,"Android 10.0, 3gb RAM, 64gb Memoria");
    Producto p3 = new Producto("Xiaomi Mi band 4","Smartband 0.95",3000,5,1,0.5);
    Producto p2 = new Producto("Mouse HyperX PulseFire Surge", "Mouse gamer con luces RGB", 2300, 5,3);
    Producto p4 = new Producto("Notebook Hp Omen i7","Laptop Omen by HP, intel i7, 8GB RAM",130000,2,1);
    Producto p5 = new Producto("Monitor Samsumg 23","Resolucion 1080x1920, 75Hz, Retardo 1ms",22000,50,1);

    //Test David
    @Test
    public void test_minimo_un_producto_asociado_al_carrito(){
        carrito.agregarProducto(p1);
        int res_obtenido = CarritoCompras.obtenercantidadProductos(carrito);
        int res_esperado = 1;
        assertEquals(res_esperado,res_obtenido);
    }

    @Test
    public void test_obtener_descripcion_producto_agregado_al_carrito(){
        String res_obtenido = CarritoCompras.obtenerdetalle(p1);
        String res_esperado = "Celular Huawei p10 31000.0 Android 10.0, 3gb RAM, 64gb Memoria";
        assertEquals(res_esperado,res_obtenido);
    }
    //Test Diego Atencia
    @Test
    public void test_cantidad_de_producto_debe_ser_menor_a_stock(){
        boolean resultado = CarritoCompras.cantidad_no_mayor_stock(p2);
        boolean esperado = true;
        assertEquals(esperado,resultado);
    }

    @Test
    public void test_producto_debe_tener_Nombre_y_Descripcion(){
        boolean resultado = CarritoCompras.nombre_y_descripcion(p2);
        boolean esperado = true;
        assertEquals(esperado,resultado);
    }


//Test Diego Di Leo

    @Test
    public void test_verificar_descuento_realizado_sobre_producto_en_el_carrito(){
        double resultado = CarritoCompras.realizardescuento(p3);
        double esperado = 1500;
        assertEquals(esperado,resultado,0);
    }
    @Test
    public void controlar_cantidad_de_producto_no_sea_nula(){
        //boolean resultado_obtenido = Producto.controlCantidad(p4);
        //boolean resultado_esperado = true;
        int resultado_obtenido = p4.getCantidad();
        Assert.assertNotEquals(0,resultado_obtenido);
        //Assert.assertEquals(resultado_esperado,resultado_obtenido);
    }

    //Test Matias
    @Test
    public void agregar_producto_al_carrito_no_afecta_stock(){
        CarritoCompras.agregarProducto(p5);
        assertEquals(50,p5.getStockdisponible());
    }

    @Test
    public void disminuir_stock_de_producto_al_realizar_compra(){
        carrito.agregarProducto(p4);
        carrito.realizarcompra(carrito);
       int obtenido= p4.getStockdisponible();
       int esperado = 1;
        assertEquals(esperado,obtenido);
    }
}