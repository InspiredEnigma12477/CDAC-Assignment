package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import com.app.dto.ProductSearchRequest;
import com.app.pojos.Product;

@SpringBootTest
class TestCriteriaQuery {
	@Autowired
	private EntityManager mgr;

	@Test
	void testProductCriteriaQuery() {
		assertNotNull(mgr);
		ProductSearchRequest request = new ProductSearchRequest();
		request.setName("p2");
	//	request.setExpiresOn(LocalDate.of(2022, 7, 11));
	//	request.setPrice(200);
		CriteriaBuilder criteriaBuilder = mgr.getCriteriaBuilder();
		CriteriaQuery<Product> criteriaQuery = criteriaBuilder.createQuery(Product.class);
		Root<Product> root = criteriaQuery.from(Product.class);
		// Adding search criteria's for query using CriteriaBuilder
		List<Predicate> searchCriterias = new ArrayList<>();
		if (StringUtils.hasLength(request.getName()))
			searchCriterias.add(criteriaBuilder.equal(root.get("name"), request.getName()));
		//price based search : if price is chosen as search criteria
		if (request.getPrice() != 0)
			searchCriterias.add(criteriaBuilder.greaterThan(root.get("price"), request.getPrice()));
	//similarly if expiry date is chosen as search criteria from the front end --add that here.
		if (request.getExpiresOn() != null)
			searchCriterias.add(criteriaBuilder.lessThan(root.get("expiresOn"), request.getExpiresOn()));
	
		criteriaQuery.select(root)
				.where(criteriaBuilder.and(searchCriterias.toArray(new Predicate[searchCriterias.size()])));
		 assertEquals(2,mgr.createQuery(criteriaQuery).getSingleResult().getProductId());

	}

}
