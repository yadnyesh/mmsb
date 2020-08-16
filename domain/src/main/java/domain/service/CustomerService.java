package domain.service;

import customer.domain.aggregate.Customer;

public interface CustomerService {
	
	public Customer getCustomerById(Integer customerId);

}
