package edu.escuelaing.arsw.ASE.app;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * Global exception handler for the application.
 * This class captures and handles specific exceptions thrown by any controller.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Method to handle arithmetic exceptions.
     * This method will be invoked automatically whenever an ArithmeticException is thrown by any controller.
     *
     * @param ex The ArithmeticException that was thrown.
     * @return A ModelAndView object representing the error view with an appropriate error message.
     */
    @ExceptionHandler(ArithmeticException.class)
    public ModelAndView handleArithmeticException(ArithmeticException ex) {
        // Create a new ModelAndView object and set the view name to "error"
        ModelAndView modelAndView = new ModelAndView("error");

        // Add the error message from the exception to the model
        modelAndView.addObject("errorMessage", ex.getMessage());

        // Return the ModelAndView object, which will render the "error" view with the provided error message
        return modelAndView;
    }
}
