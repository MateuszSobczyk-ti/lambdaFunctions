package com.sobczyk.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/account")
@CrossOrigin(origins = "*")
public class RestController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<SampleDataResponse> getSampleData() {
        return List.of(new SampleDataResponse("Rodrygo", 10000F, 100F, 12050F),
                new SampleDataResponse("Rafao", 7000F, 0F, 9034F),
                new SampleDataResponse("Eder", 15000F, 3000F, 11160F));
    }
}
