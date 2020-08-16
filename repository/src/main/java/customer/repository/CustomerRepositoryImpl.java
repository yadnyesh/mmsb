package customer.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import customer.domain.aggregate.Customer;
import customer.domain.repository.CustomerRepository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository{

	private static final Logger logger = LoggerFactory.getLogger(CustomerRepositoryImpl.class);
	
	@Override
	public Customer getCustomerById(Integer customerId) {
		logger.info("Inside CustomerRepositoryImpl........");
		Customer customer = new Customer(100, "A New Customer");
		// TODO Auto-generated method stub
		return customer;
	}

}
