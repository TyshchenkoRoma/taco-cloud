package sia.tacocloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {

    @GetMapping
    public String showDesignTacoController(Model model) {
        List<Ingredient> ingredients = Arrays.asList(
                new Ingredient ("FLTO", "Flour Tortilla", Type.WRAP),
                new Ingredient ("FLTO", "Flour Tortilla", Type.WRAP),
                new Ingredient ("FLTO", "Flour Tortilla", Type.WRAP),
                new Ingredient ("FLTO", "Flour Tortilla", Type.WRAP),
                new Ingredient ("FLTO", "Flour Tortilla", Type.WRAP),
                new Ingredient ("FLTO", "Flour Tortilla", Type.WRAP),
                new Ingredient ("FLTO", "Flour Tortilla", Type.WRAP),
                new Ingredient ("FLTO", "Flour Tortilla", Type.WRAP),
                new Ingredient ("FLTO", "Flour Tortilla", Type.WRAP),
                new Ingredient ("FLTO", "Flour Tortilla", Type.WRAP)
        );

        Type [] types = Ingredient.Type.values();
        for ( Type types: types) {
            model.addAttribute(type.ToString().toLowerCase().filterByType (ingredients, type));
        }
        model.addAttribute("design", new Taco());
        return "design";

    }
}
