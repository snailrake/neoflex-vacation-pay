package org.neoflex.holidaypay.controller;

import lombok.RequiredArgsConstructor;
import org.neoflex.holidaypay.dto.ResponseDto;
import org.neoflex.holidaypay.service.VacationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class VacationController {

    private final VacationService vacationService;

    @GetMapping("/calculate")
    public ResponseDto calculate(@RequestHeader("avgSalary") double avgSalary, @RequestHeader("days") int days) {
        return vacationService.calculate(avgSalary, days);
    }
}
