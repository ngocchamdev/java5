package com.example.asm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class index {
    @GetMapping("home")
    public String index(){
    return "index";
    }
    @GetMapping("contact-us")
    public String contact(){
    return "contact-us";
    }
    @GetMapping("about")
    public String about(){
        return "about";
 
    }
    @GetMapping("shop")
    public String shop(){
        return "shop";
    }
    @GetMapping("shop-detail")
    public String shopDetail(){
        return "shop-detail";
    }
    @GetMapping("cart")
    public String cart(){
        return "cart";
    }
    @GetMapping("checkout")
    public String checkout(){
        return "checkout";
    }
    @GetMapping("gallery")
    public String gallery(){
        return "gallery";
    }
    @GetMapping("my-account")
    public String myAccount(){
        return "my-account";
    }
    @GetMapping("wishlist")
    public String wishlist(){
        return "wishlist";
    }

}
