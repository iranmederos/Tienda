package com.latam.alura.prueba;

import com.latam.alura.tienda.dao.PedidoDAO;
import com.latam.alura.tienda.modelo.Pedido;
import com.latam.alura.tienda.utils.JPAUtils;
import jakarta.persistence.EntityManager;

import java.io.FileNotFoundException;

public class PruebaDeDesempeno {
    public static void main(String[] args) throws FileNotFoundException {
//		LoadRecords.cargarRegistros();
        EntityManager em = JPAUtils.getEntityManager();

        PedidoDAO pedidoDao = new PedidoDAO(em);
        Pedido pedidoConCliente = pedidoDao.consultarPedidoConCliente(2l);

        em.close();

//		System.out.println(pedido.getFecha());
//		System.out.println(pedido.getItems().size());
        System.out.println(pedidoConCliente.getCliente().getNombre());
    }
}
