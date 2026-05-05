package edu.ban7.e3chatbotback.controller;

import edu.ban7.e3chatbotback.dao.ProductDao;
import edu.ban7.e3chatbotback.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

    private final ProductDao productDao;

    public ProductController(ProductDao productDao) {
        this.productDao = productDao;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productDao.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        return productDao.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(
            @RequestBody @Validated(Product.OnCreate.class) Product product
    ) {
        product.setId(null);
        Product savedProduct = productDao.save(product);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(
            @PathVariable Long id,
            @RequestBody @Validated(Product.OnUpdate.class) Product product
    ) {
        if (!productDao.existsById(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        product.setId(id);
        Product updatedProduct = productDao.save(product);

        return ResponseEntity.ok(updatedProduct);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        if (!productDao.existsById(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        productDao.deleteById(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}