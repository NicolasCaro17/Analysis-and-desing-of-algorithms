/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import co.edu.usbbog.ing.sis.ofertaLaboral.controlador.persistencia.PanaderiaBD;
import co.edu.usbbog.ing.sis.ofertaLaboral.modelo.Panaderia;
import co.edu.usbbog.ing.sis.ofertaLaboral.modelo.Venta;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nico_
 */
public class Prueba {

    PanaderiaBD b = new PanaderiaBD();

//    /**
//     * Test of agregar method, of class PanaderiaBD.
//     */
//    @Test
//    public void testAgregar1A() {
//     Panaderia panaderia = new Panaderia(6, "Doritos", "25/abril/2021", "Margarita", 150000, 500);
//        System.out.println(b.agregar(panaderia));
//    }
//
//    @Test
//    public void testAgregar1B() {
//     Panaderia panaderia = new Panaderia(7, "Doritos", "25/abril/2021", "Margarita", 600000, 500);
//     System.out.println(b.agregar(panaderia));
//    }
//    @Test
//    public void testAgregar1C() {
//     Panaderia panaderia = new Panaderia(8, "Doritos", "25/abril/2021", "Margarita", 90000000, 500);
//     System.out.println(b.agregar(panaderia));
//    }
//    
//    @Test
//    public void testAgregar1D() {
//     Panaderia panaderia = new Panaderia(9, "Doritos", "25/abril/2021", "Margarita", 0, 500);
//     System.out.println(b.agregar(panaderia));
//    }
//    @Test
//    public void testAgregar1E() {
//     Panaderia panaderia = new Panaderia(10, "Doritos", "25/abril/2021", "Margarita", -150000, 500);
//      System.out.println(b.agregar(panaderia));
//    }
//    @Test
//    public void testAgregar1F() {
//     Panaderia panaderia = new Panaderia(11, "Doritos", "25/abril/2021", "Margarita", -600000, 500);
//      System.out.println(b.agregar(panaderia));
//    }
//    @Test 
//    public void testAgregar1G() {
//     Panaderia panaderia = new Panaderia(12, "Doritos", "25/abril/2021", "Margarita", -90000000, 500);
//      System.out.println(b.agregar(panaderia));
//    }
//
//    @Test
//    public void testAgregar2A() {
//     Panaderia panaderia = new Panaderia(13, "Doritos", "25/abril/2021", "Margarita", 500, 150000);
//        System.out.println(b.agregar(panaderia));
//    }
//
//    @Test
//    public void testAgregar2B() {
//     Panaderia panaderia = new Panaderia(14, "Doritos", "25/abril/2021", "Margarita", 500, 600000);
//     System.out.println(b.agregar(panaderia));
//    }
//    @Test
//    public void testAgregar2C() {
//     Panaderia panaderia = new Panaderia(15, "Doritos", "25/abril/2021", "Margarita", 500, 90000000);
//     System.out.println(b.agregar(panaderia));
//    }
//    
//    @Test
//    public void testAgregar2D() {
//     Panaderia panaderia = new Panaderia(16, "Doritos", "25/abril/2021", "Margarita", 600000, 0);
//     System.out.println(b.agregar(panaderia));
//    }
//    @Test
//    public void testAgregar2E() {
//     Panaderia panaderia = new Panaderia(17, "Doritos", "25/abril/2021", "Margarita", 0, 150000);
//      System.out.println(b.agregar(panaderia));
//    }
//    @Test
//    public void testAgregar2F() {
//     Panaderia panaderia = new Panaderia(18, "Doritos", "25/abril/2021", "Margarita", 500,-600000);
//      System.out.println(b.agregar(panaderia));
//    }
//    @Test 
//    
//    public void testAgregar2G() {
//     Panaderia panaderia = new Panaderia(19, "Doritos", "25/abril/2021", "Margarita", 500,  -90000000);
//      System.out.println(b.agregar(panaderia));
//    }
//    
//    @Test 
//    public void testAgregarV1(){
//      Venta c = new Venta(5, "25/08/2000", 150000); 
//        System.out.println(b.agregarV(c));
//    }
//    @Test 
//    public void testAgregarV2(){
//      Venta c = new Venta(6, "25/08/2000", 600000); 
//       System.out.println(b.agregarV(c));
//    }
//    @Test 
//    public void testAgregarV3(){
//      Venta c = new Venta(7, "25/08/2000", 90000000);   
//       System.out.println(b.agregarV(c));
//    }
//    @Test 
//    public void testAgregarV4(){
//      Venta c = new Venta(8, "25/08/2000", 0);   
//       System.out.println(b.agregarV(c));
//    }
//    @Test 
//    public void testAgregarV5(){
//      Venta c = new Venta(9, "25/08/2000", -150000); 
//     System.out.println(b.agregarV(c));  
//    }
//    @Test 
//    public void testAgregarV6(){
//      Venta c = new Venta(10, "25/08/2000", -90000000); 
//      System.out.println(b.agregarV(c)); 
//    }
   @Test
    public void assest1A() {
        int id = 22;
        String producto = "Doritos";
        String fecha_vencimiento = "25/abril/2021";
        String marca = "Margarita";
        int precio = -1500;
        int cantindad = 500;
        Panaderia panaderia = new Panaderia(id, producto, fecha_vencimiento, marca, precio, cantindad);
        assert precio > 0 : "El Precio debe ser positivo";

        System.out.println(b.agregar(panaderia));
    }

    @Test
    public void assest2A() {

        int id = 22;
        String producto = "Doritos";
        String fecha_vencimiento = "25/abril/2021";
        String marca = "Margarita";
        int precio = 1500;
        int cantindad = 500;
        Panaderia panaderia = new Panaderia(id, producto, fecha_vencimiento, marca, precio, cantindad);
        assert precio > 0 : "El Precio debe ser positivo";

        System.out.println(b.agregar(panaderia));
    }

    @Test
    public void assest3A() {
        int id = 23;
        String producto = "Doritos";
        String fecha_vencimiento = "25/abril/2021";
        String marca = "Margarita";
        int precio = 15000;
        int cantidad = -500;
        Panaderia panaderia = new Panaderia(id, producto, fecha_vencimiento, marca, precio, cantidad);
        assert cantidad > 0 : "La Cantidad no puede ser negativa";

        System.out.println(b.agregar(panaderia));
    }

    @Test
    public void assest4A() {
        int id = 24;
        String producto = "Doritos";
        String fecha_vencimiento = "25/abril/2021";
        String marca = "Margarita";
        int precio = 15000;
        int cantidad = 500;
        Panaderia panaderia = new Panaderia(id, producto, fecha_vencimiento, marca, precio, cantidad);
        assert precio > 0 : "La Cantidad no puede ser negativa";

        System.out.println(b.agregar(panaderia));
    }

    @Test
    public void assest5A() {
        int id = 19;
        String producto = "Doritos";
        String fecha_vencimiento = "25/abril/2021";
        String marca = "Margarita";
        int precio = 15000;
        int cantidad = 500;
        Panaderia panaderia = new Panaderia(id, producto, fecha_vencimiento, marca, precio, cantidad);
        assert (id > 20) : "El Dato que se esta tratando de ingresar ya existe dentro de la base de datos";
        System.out.println(b.agregar(panaderia));
    }

    @Test
    public void assest6A() {
        int id = 24;
        String producto = "Doritos";
        String fecha_vencimiento = "25/abril/2021";
        String marca = "Margarita";
        int precio = 15000;
        int cantidad = 500;
        Panaderia panaderia = new Panaderia(id, producto, fecha_vencimiento, marca, precio, cantidad);
        assert (id > 20) : "El Dato que se esta tratando de ingresar ya existe dentro de la base de datos";
        System.out.println(b.agregar(panaderia));
    }

    @Test
    public void assest7A() {
        String producto = "";
        String fecha_vencimiento = "25/abril/2021";
        String marca = "Sonria";
        int precio = 15000;
        int cantidad = 500;
        Panaderia panaderia = new Panaderia(24, producto, fecha_vencimiento, marca, precio, cantidad);
        assert producto.equalsIgnoreCase("Doritos") : "El nombre no puede estar vacio ";
        System.out.println(b.modificar(panaderia, 24));

    }

    @Test
    public void assest8A() {
        String producto = "";
        String fecha_vencimiento = "25/abril/2021";
        String marca = "Sonria";
        int precio = 15000;
        int cantidad = 500;
        Panaderia panaderia = new Panaderia(24, producto, fecha_vencimiento, marca, precio, cantidad);
        assert producto.equalsIgnoreCase("papitas") : "El nombre no puede estar vacio ";
        System.out.println(b.modificar(panaderia, 24));

    }

    @Test
    public void assest9A() {
        String producto = "Papitas";
        String fecha_vencimiento = "";
        String marca = "Sonria";
        int precio = 15000;
        int cantidad = -500;
        Panaderia panaderia = new Panaderia(24, producto, fecha_vencimiento, marca, precio, cantidad);
        assert fecha_vencimiento.equalsIgnoreCase("25/abril/2021") : "Por favor corrija la fecha de vencimiento";
        System.out.println(b.modificar(panaderia, 24));

    }

    @Test
    public void assest10A() {
        int id = -1;
        assert id > 0 : "el id no puede ser negativo";
        b.eliminar(id);
    }

    @Test
    public void assest1B() {
        int id = 23;
        assert id > 0 : "el id no puede ser negativo";
        b.eliminar(id);

    }

    @Test
    public void assest2B() {

    }

    @Test
    public void assest3B() {
        String producto = "Papitas";
        String fecha_vencimiento = "";
        String marca = "Sonria";
        int precio = 15000;
        int cantidad = -500;
        Panaderia panaderia = new Panaderia(24, producto, fecha_vencimiento, marca, precio, cantidad);
        assert cantidad > 0 : "Por favor corrija la cantidad";
        System.out.println(b.modificar(panaderia, 24));
    }

    @Test
    public void assest4B() {
        String producto = "PAPOTAS";
        String fecha_vencimiento = "";
        String marca = "Sonria";
        int precio = 15000;
        int cantidad = -500;
        Panaderia panaderia = new Panaderia(24, producto, fecha_vencimiento, marca, precio, cantidad);
        assertNotNull("Este objeto existe", panaderia);
    }

    @Test
    public void assest5B() {
        String producto = "PAPOTAS";
        String fecha_vencimiento = "25/abril/2005";
        String marca = "Sonria";
        int precio = 15000;
        int cantidad = -500;
        Panaderia panaderia = new Panaderia(26, producto, fecha_vencimiento, marca, precio, cantidad);
        assertTrue(b.agregar(panaderia));
    }
    
    @Test
    public void assest6B() {
        String producto = "PAPOTAS";
        String fecha_vencimiento = "25/abril/2005";
        String marca = "Sonria";
        int precio = 15000;
        int cantidad = -500;
        Panaderia panaderia = new Panaderia(26, producto, fecha_vencimiento, marca, precio, cantidad);
        int id = 10 ;
        String fecha = "20/02/2000";
        int total = 50000;
        Venta venta = new Venta(id, fecha, total);
        assertEquals(panaderia,venta);
    }
      @Test
    public void assest7B() {
        String producto = "PAPOTAS";
        String fecha_vencimiento = "25/abril/2005";
        String marca = "Sonria";
        int precio = 15000;
        int cantidad = -500;
        Panaderia panaderia = new Panaderia(26, producto, fecha_vencimiento, marca, precio, cantidad);
        String producto2 = "PAPOTAS";
        String fecha_vencimiento2 = "25/abril/2005";
        String marca2 = "Sonria";
        int precio2 = 15000;
        int cantidad2 = -500;
        Panaderia panaderia2 = new Panaderia(27, producto2, fecha_vencimiento2, marca2, precio2, cantidad2); 
        assertEquals(panaderia,panaderia2);
    }
    
       @Test
    public void assest8B() {
        String producto = "PAPOTAS";
        String fecha_vencimiento = "25/abril/2005";
        String marca = "Sonria";
        int precio = 15000;
        int cantidad = -500;
        Panaderia panaderia = new Panaderia(26, producto, fecha_vencimiento, marca, precio, cantidad);
        String producto2 = "PAPOTAS";
        String fecha_vencimiento2 = "25/abril/2005";
        String marca2 = "Sonria";
        int precio2 = 15000;
        int cantidad2 = -500;
        Panaderia panaderia2 = new Panaderia(27, producto2, fecha_vencimiento2, marca2, precio2, cantidad2); 
        assertEquals(panaderia,panaderia);
    }
    
       @Test
    public void assest9B() {
        int id = 10 ;
        String fecha = "20/02/2000";
        int total = 50000;
        Venta venta = new Venta(id, fecha, total);
        assertTrue(b.agregarV(venta));   
    } 
        public void assest10B() {
        int id = 11 ;
        String fecha = "20/02/2000";
        int total = 50000;
        Venta venta = new Venta(id, fecha, total);
        assertFalse(b.agregarV(venta));
        }
    
    
    
    
   
}
