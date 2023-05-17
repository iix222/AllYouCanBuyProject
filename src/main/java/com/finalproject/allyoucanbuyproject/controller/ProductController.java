package com.finalproject.allyoucanbuyproject.controller;

import com.finalproject.allyoucanbuyproject.model.CategoryModel;
import com.finalproject.allyoucanbuyproject.model.ProductModel;
import com.finalproject.allyoucanbuyproject.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String getAllProducts(final ModelMap modelMap) {
        List<ProductModel> products = productService.getAllProducts();
        modelMap.addAttribute("products", products);
        return "main";
    }

    @GetMapping("/products/create")
    public String showCreateProductForm(ModelMap modelMap) {
        ProductModel product = new ProductModel();
        modelMap.addAttribute("product", product);
        return "add_new_product";
    }

    @PostMapping("/products")
    public String createProduct(@ModelAttribute("product") ProductModel productModel) {
        productService.addProduct(productModel);
        return "redirect:/products";
    }

    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable("id") Long id) {
        productService.deleteById(id);
        return "redirect:/products";
    }

    @GetMapping("/electronics")
    public String getElectronicsProducts(Model model) {
        CategoryModel electronicsCategory = new CategoryModel();
        electronicsCategory.setName("Electronics");

        List<ProductModel> electronicsProducts = productService.getProductsByCategory(electronicsCategory);
        model.addAttribute("products", electronicsProducts);
        return "redirect:/electronics.handlebars";
    }

    @GetMapping("/garden")
    public String getGardenProducts(Model model) {
        CategoryModel gardenCategory = new CategoryModel();
        gardenCategory.setName("Garden");

        List<ProductModel> gardenProducts = productService.getProductsByCategory(gardenCategory);
        model.addAttribute("products", gardenProducts);
        return "redirect:/garden.handlebars";
    }

    @GetMapping("/pets")
    public String getPetsProducts(Model model) {
        CategoryModel petsCategory = new CategoryModel();
        petsCategory.setName("Pets");

        List<ProductModel> petsProducts = productService.getProductsByCategory(petsCategory);
        model.addAttribute("products", petsProducts);
        return "redirect:/pets.handlebars";
    }

}


