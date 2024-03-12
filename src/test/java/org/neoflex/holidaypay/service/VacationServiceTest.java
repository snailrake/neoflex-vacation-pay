package org.neoflex.holidaypay.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.neoflex.holidaypay.dto.ResponseDto;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class VacationServiceTest {

    @InjectMocks
    private VacationService vacationService;

    @Test
    void calculate_ValidVacation_ReturnsValidPay() {
        double avgSalary = 100_000;
        int days = 28;
        ResponseDto expected = ResponseDto.builder()
                .vacationPay(BigDecimal.valueOf(95_563.14))
                .build();

        ResponseDto actual = vacationService.calculate(avgSalary, days);

        assertEquals(expected, actual);
    }
}
