package com.numions;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Producto> productosDelCarrito;


    public int size(){return productosDelCarrito.size();}

    public ShoppingCart() {
        this.productosDelCarrito =new ArrayList<>();
    }

    public List<Producto> getProductosDelCatalogo() {
        return productosDelCarrito;
    }

    public void setProductosDelCatalogo(List<Producto> productosDelCatalogo) {
        this.productosDelCarrito = productosDelCatalogo;
    }

    public void addProduct (Producto prod) {
        productosDelCarrito.add(prod);
        //System.out.print(productosDelCatalogo.size());

    }

    public void removeProduct (int prodId){

        for(int i =0; i<productosDelCarrito.size();i++){
            if (prodId==productosDelCarrito.get(i).id) {
                productosDelCarrito.remove(i);
            }

        }


    }



}
