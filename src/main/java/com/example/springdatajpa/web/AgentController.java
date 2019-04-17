package com.example.springdatajpa.web;

import com.example.springdatajpa.repository.primary.AgentRepository;
import com.example.springdatajpa.repository.secondary.SubscriberRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("agent")
@RestController
public class AgentController {
    @Resource
    private AgentRepository agentRepository;
    @Resource
    private SubscriberRepository subscriberRepository;

    @GetMapping("{id}")
    public Object findById(@PathVariable Long id) {
        return agentRepository.findById(id);
    }

    @GetMapping("2/{id}")
    public Object getOutboundLine(@PathVariable Long id) {
        return subscriberRepository.findById(id);
    }

}
