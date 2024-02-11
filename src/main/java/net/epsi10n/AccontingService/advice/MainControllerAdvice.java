package net.epsi10n.AccontingService.advice;

import net.epsi10n.AccontingService.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.io.IOException;
import java.util.List;

@RestControllerAdvice
public class MainControllerAdvice {
    @ExceptionHandler(value = {NotFoundException.class})
    public void commence(HttpServletRequest r, HttpServletResponse response, NotFoundException ex) throws IOException {
        response.sendError(HttpServletResponse.SC_NOT_FOUND, "Not found: " + ex.getMessage());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ConstraintViolationException.class)
    public List<String> handleValidationExceptions(ConstraintViolationException ex) {
        return ex.getConstraintViolations().stream()
                .map(ConstraintViolation::getMessage).toList();
    }
}
