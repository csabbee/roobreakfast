package com.acme.karcsi.controller;
import com.acme.karcsi.domain.Food;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/foods")
@Controller
@RooWebScaffold(path = "foods", formBackingObject = Food.class)
public class FoodController {
}
