package edu.escuelaing.arsw.ASE.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Controller that handles HTTP requests for the calculator.
 */
@Controller
public class CalculadoraController {

    private Calculadora calculadora = new Calculadora();

    /**
     * Handles GET requests for the main page.
     * @param model Model for the view.
     * @return View name.
     */
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("resultado", calculadora.getResultado());
        return "index";
    }

    /**
     * Handles POST requests to perform calculations.
     * @param valor Value to use in the operation.
     * @param accion Action to perform (sumar, restar, multiplicar, dividir).
     * @param model Model for the view.
     * @return Redirect to the main page.
     */
    @PostMapping("/")
    public String calcular(@RequestParam("valor") double valor,
                           @RequestParam("accion") String accion,
                           Model model) {
        try {
            switch (accion) {
                case "sumar":
                    calculadora.sumar(valor);
                    break;
                case "restar":
                    calculadora.restar(valor);
                    break;
                case "multiplicar":
                    calculadora.multiplicar(valor);
                    break;
                case "dividir":
                    calculadora.dividir(valor);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid action: " + accion);
            }
        } catch (ArithmeticException e) {
            model.addAttribute("error", e.getMessage());
        }
        return "redirect:/";
    }

    /**
     * Handles POST requests to reset the calculator.
     * @return Redirect to the main page.
     */
    @PostMapping("/clear")
    public String clear() {
        calculadora.clear();
        return "redirect:/";
    }
}
