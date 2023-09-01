package com.example.demo.controller;

import com.example.demo.domain.DemoObject;
import com.example.demo.repository.DemoRepository;
import com.example.demo.service.DemoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequiredArgsConstructor
public class DemoController {
    @Autowired
    private final DemoService demoService;

    @GetMapping(value = {"/", "/index"})
    public String handleDemoRedirect() {
        return "redirect:index.html";
    }

    @GetMapping("/demo-object-list")
    public List<DemoObject> getDemoObjects() {
        return demoService.getAllDemoObjects();
    }

    @PostMapping("/demo-object-submit")
    public DemoObject demoObjectSubmit(DemoObject.DemoObjectBuilder demoObjectBuilder) {
        return demoService.saveDemoObject(demoObjectBuilder.buildDemoObject());
    }
}
