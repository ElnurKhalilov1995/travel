package com.travel.demo.controller;

import com.travel.demo.service.BookingParamService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {
    private BookingParamService bookingParamService;

    public BookController(BookingParamService bookingParamService) {
        this.bookingParamService = bookingParamService;
    }

    @GetMapping({"", "/"})
    public String title(Model model) {
        model.addAttribute("params", bookingParamService.getBookingParams());
        return "home";
    }
}
