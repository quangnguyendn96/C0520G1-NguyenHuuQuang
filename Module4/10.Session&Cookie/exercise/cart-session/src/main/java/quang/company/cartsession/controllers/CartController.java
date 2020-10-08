package quang.company.cartsession.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import quang.company.cartsession.model.Cart;
import quang.company.cartsession.model.CdProduct;
import quang.company.cartsession.service.CdProductService;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    public String getCartPage(@RequestParam("id") long id, HttpSession session, Model model) {
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
        model.addAttribute("cart", new Cart());
        session.setAttribute("myCart", cartItems);
        session.setAttribute("myCartTotal", totalCart(cartItems));
        return "cart/payment";
    }

    @GetMapping("update/")
    public String getUpdateCart(@RequestParam("id") long id, HttpSession session, Cart cart, Model model) {
        Map<Long, Cart> cartItems = (HashMap<Long, Cart>) session.getAttribute("myCart");
        if (cartItems == null) {
            cartItems = new HashMap<>();
        }
        CdProduct cdProduct = cdProductService.findById(id);
        if (cdProduct != null) {
            if (cartItems.containsKey(id)) {
                cart.setQuantity(cart.getQuantity());
                cart.setCdProduct(cdProduct);
                cartItems.put(id, cart);

            }
        }
        model.addAttribute("cart", new Cart());
        session.setAttribute("myCart", cartItems);
        session.setAttribute("myCartTotal", totalCart(cartItems));
        return "cart/payment";
    }

    @GetMapping(value = "remove/{id}")
    public String viewRemove(HttpSession session, @PathVariable("id") long productId) {
        Map<Long, Cart> cartItems = (HashMap<Long, Cart>) session.getAttribute("myCart");
        if (cartItems == null) {
            cartItems = new HashMap<>();
        }
        if (cartItems.containsKey(productId)) {
            cartItems.remove(productId);
        }
        session.setAttribute("myCart", cartItems);
        session.setAttribute("myCartTotal", totalCart(cartItems));
        return "cart/payment";
    }

    @GetMapping("updateSelect")
    public String deleteSelect(@RequestParam("quantity") int[] quantity, Long[] id, HttpSession session, Model model) {

        Map<Long, Cart> cartItems = (HashMap<Long, Cart>) session.getAttribute("myCart");

        List<Integer> listQuantity = new ArrayList<>();
        for (Integer quantityEach : quantity) {
            listQuantity.add(quantityEach);
        }

        List<Long> listId = new ArrayList<>();
        for (Long longs : id) {
            listId.add(longs);
        }

        if (cartItems == null) {
            cartItems = new HashMap<>();
        }

        for (int i = 0; i < listId.size(); i++) {
            CdProduct cdProduct = cdProductService.findById(listId.get(i));
            if (cdProduct != null) {
                if (cartItems.containsKey(listId.get(i))) {
                    Cart cart = cartItems.get(listId.get(i));
                    cart.setQuantity(listQuantity.get(i));
                    cart.setCdProduct(cdProduct);
                    cartItems.put(listId.get(i), cart);
                }
            }
        }
        model.addAttribute("cart", new Cart());
        session.setAttribute("myCart", cartItems);
        session.setAttribute("myCartTotal", totalCart(cartItems));
        return "cart/payment";


    }
}
