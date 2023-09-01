package com.example.demo.service;

import com.example.demo.domain.DemoObject;
import com.example.demo.repository.DemoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class DemoService {
    @Autowired
    private final DemoRepository demoRepository;

    public List<DemoObject> getAllDemoObjects() {
        return demoRepository.getDemoObjects().stream()
                .sorted(Comparator.comparing(DemoObject::getName))
                .collect(Collectors.toList());
    }

    public DemoObject saveDemoObject(DemoObject demoObject) {
        return demoRepository.save(demoObject);
    }
}
