package customer.domain.repository;

import customer.domain.aggregate.Customer;

public interface CustomerRepository {
	public Customer getCustomerById(Integer customerId);
}
