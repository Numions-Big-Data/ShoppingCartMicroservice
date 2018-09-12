package com.numions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //Se devuele un string , un json etc...
public class ShoppingCartController {

    ShoppingCart cart = new ShoppingCart();

    @GetMapping("ShoppingCart")
    public ResponseEntity<String> viewShoppingCart(){

        String var1 = "Estas viendo la lista de productos del carrito \n";
        String var2 = "";
        if (cart.getProductosDelCatalogo().size()==0){
            var2 = "No hay productos \n";
        }
        else {
            for (int i=0;i<cart.size();i++){
                var2 += cart.getProductosDelCatalogo().get(i).nombre + "\n";
            }
        }

        return new ResponseEntity<>(var1 + var2,HttpStatus.OK);
    }

    @DeleteMapping("ShoppingCart/{productId}")
    public ResponseEntity<String>removeProduct(@PathVariable int productId){

        String nombreProducto ="";

        for(int i=0;i<cart.size();i++){
            if(productId== cart.getProductosDelCatalogo().get(i).id){
                nombreProducto=cart.getProductosDelCatalogo().get(i).nombre;
            }

        }

        if (cart.getProductosDelCatalogo().size()==0){
            String var = "No hay productos en el carrito";
            return new ResponseEntity<>(var, HttpStatus.NO_CONTENT);

        }
        else{
            cart.removeProduct(productId);
            String var = "Has eliminado el producto " + nombreProducto  + "\n";
            return new ResponseEntity<>(var,HttpStatus.OK);

        }
    }

    @PostMapping("AddShoppingCart/{productId}/{nombre}")
    public ResponseEntity<String>addProduct(@PathVariable int productId,@PathVariable String nombre){
        Producto prueba = new Producto(productId,nombre);
        cart.addProduct(prueba);

            String var = "Has añadido el producto " + nombre  + "\n";
            return new ResponseEntity<>(var,HttpStatus.OK);


    }


}
