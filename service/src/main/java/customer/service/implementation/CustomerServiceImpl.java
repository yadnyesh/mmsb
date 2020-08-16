package customer.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import customer.domain.aggregate.Customer;
import customer.domain.repository.CustomerRepository;
import domain.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class CustomerServiceImpl implements CustomerService{

	private static final Logger logger = LoggerFactory.getLogger(CustomerService.class);
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public Customer getCustomerById(Integer customerId) {
		logger.info("Inside CustomerServiceImpl........");
		Customer customer = customerRepository.getCustomerById(customerId);
		return customer;
	}

}
