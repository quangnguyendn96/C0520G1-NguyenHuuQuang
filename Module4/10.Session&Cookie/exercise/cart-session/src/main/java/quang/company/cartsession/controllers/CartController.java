package quang.company.cartsession.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import quang.company.cartsession.model.Cart;
import quang.company.cartsession.model.CdProduct;
import quang.company.cartsession.service.CdProductService;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    CdProductService cdProductService;

    @GetMapping
    public ModelAndView showPage(HttpSession session) {
        ModelAndView modelAndView = new ModelAndView("cart/payment");
        Map<Long, Cart> cartMap = (HashMap<Long, Cart>) session.getAttribute("myCart");
        if (cartMap == null) {
            cartMap = new HashMap<>();
        }
        session.setAttribute("myCart", cartMap);
        session.setAttribute("totalMyCart", totalCart(cartMap));
        return modelAndView;
    }

    public double totalCart(Map<Long, Cart> cart) {
        long totalPrice = 0;
        for (Map.Entry<Long, Cart> list : cart.entrySet()) {
            totalPrice += list.getValue().getCdProduct().getPrice() * (100 - list.getValue().getCdProduct().getDiscount()) / 100 * list.getValue().getQuantity();
        }
        return totalPrice;
    }

    @PostMapping("add")
    public String getCartPage(@RequestParam("id") long id, HttpSession session) {
        Map<Long, Cart> cartItems = (HashMap<Long, Cart>) session.getAttribute("myCart");
        if (cartItems == null) {
            cartItems = new HashMap<>();
        }

        CdProduct cdProduct = cdProductService.findById(id);
        if (cdProduct != null) {
            if (cartItems.containsKey(id)) {
                Cart cart = cartItems.get(id);
                cart.setQuantity(cart.getQuantity() + 1);
                cart.setCdProduct(cdProduct);
                cartItems.put(id, cart);
            } else {
                Cart cart = new Cart();
                cart.setQuantity(1);
                cart.setCdProduct(cdProduct);
                cartItems.put(id, cart);
            }
        }
        session.setAttribute("myCart", cartItems);
        session.setAttribute("myCartTotal", totalCart(cartItems));
        return "cart/payment";
    }

}
