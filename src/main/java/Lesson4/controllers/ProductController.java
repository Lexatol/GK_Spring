package Lesson4.controllers;


import Lesson_2.entites.Product;
import Lesson_2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/shop")

public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }


    @RequestMapping("/showProduct")
    public String showProduct(Model uiModel) {
        uiModel.addAttribute("products", productService.getProducts());
        return "products";
    }


    @RequestMapping(path = "/ProductById", method = RequestMethod.GET)
    @ResponseBody
    public Product ProductById(Model Model, @RequestParam int id) {
        Product product = productService.getProductId(id);
        return product;
    }


    @RequestMapping("/showAddForm")
    public String showAddForm(Model uiModel, @ModelAttribute("product") Product product) {
        Product newProduct = new Product();
        uiModel.addAttribute("newProduct", newProduct);
        return "productForm";
    }

    @RequestMapping("/formAdd")
    public String processForm(@ModelAttribute("product") Product product) {
        productService.addProducts(product);
        return "formAddToList";
    }


}
