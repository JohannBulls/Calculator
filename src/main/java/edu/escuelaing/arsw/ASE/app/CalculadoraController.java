package edu.escuelaing.arsw.ASE.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculadoraController {

    private Calculadora calculadora = new Calculadora();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("resultado", calculadora.getResultado());
        return "index";
    }

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
                    throw new IllegalArgumentException("Acción no válida: " + accion);
            }
        } catch (ArithmeticException e) {
            model.addAttribute("error", e.getMessage());
        }
        return "redirect:/";
    }

    @PostMapping("/clear")
    public String clear() {
        calculadora.clear();
        return "redirect:/";
    }
}
