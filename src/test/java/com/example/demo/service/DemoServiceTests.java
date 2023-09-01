package com.example.demo.service;

import com.example.demo.repository.DemoRepository;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DemoServiceTests {
    @Mock
    private DemoRepository demoRepository;

    private DemoService demoService;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        demoService = new DemoService(demoRepository);
    }

    @Test
    void checkDemoRepository() {
        assertThat(demoService.getAllDemoObjects().size()).isEqualTo(2);
    }
}
