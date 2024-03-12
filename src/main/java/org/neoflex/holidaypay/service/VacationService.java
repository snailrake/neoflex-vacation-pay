package org.neoflex.holidaypay.service;

import org.neoflex.holidaypay.dto.ResponseDto;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class VacationService {

    private static final double AVG_MONTH_DAYS = 29.3;

    public ResponseDto calculate(double avgSalary, int days) {
        return ResponseDto.builder()
                .vacationPay(BigDecimal.valueOf(avgSalary / AVG_MONTH_DAYS * days).setScale(2, RoundingMode.HALF_EVEN))
                .build();
    }
}
