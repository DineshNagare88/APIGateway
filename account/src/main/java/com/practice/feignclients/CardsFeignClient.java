package com.practice.feignclients;

import java.util.List;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.practice.response.Cards;



@FeignClient("cards")
@LoadBalancerClient("cards")
public interface CardsFeignClient 
{
	@GetMapping("api/v1/cards/{id}")
	public List<Cards> getCardDetails(@PathVariable("id") int customerId);
}
