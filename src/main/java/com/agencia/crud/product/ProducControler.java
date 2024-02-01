package com.agencia.crud.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@RestController
@RequestMapping (path = "api/v1/products")
public class ProducControler {
    private final ProductService productService;

    @Autowired //put a class into constructor.
    public ProducControler (ProductService productService){
        this.productService = productService;
    }

    @GetMapping //this for connect with te GET
    public List<Product> getProducts(){
        return this.productService.getProducts();
    }
}



