package com.ecom.din.product.init;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ecom.din.product.dao.ProductCategoryRepository;
import com.ecom.din.product.dao.ProductRepository;
import com.ecom.din.product.domain.Product;
import com.ecom.din.product.domain.ProductCategory;

@Component
public class IntializeData {

	@Autowired
	private ProductCategoryRepository pcr;
	@Autowired
	private ProductRepository pr;

	public void intializeProductcategory() {
		int parentId=pcr.save(new ProductCategory("Cloth", "Cloth", 0)).getCat_Id();
		int subpid=pcr.save(new ProductCategory("Formal Cloth", "Formal Cloth", parentId)).getCat_Id();
		pr.save(new Product("Tshirt", 1500.0, subpid, 2.5, true, new Date()));
		pr.save(new Product("Formal paint", 1500.0, subpid, 2.5, true, new Date()));
		pr.save(new Product("Formal Tshirt", 1500.0, subpid, 2.5, true, new Date()));
		
		int subcaspid=pcr.save(new ProductCategory("Casual Cloth", "Casual Cloth", parentId)).getCat_Id();
		
		pr.save(new Product("Tshirt", 799.0, subcaspid, 2.5, true, new Date()));
		pr.save(new Product("casual paint", 2000.0, subcaspid, 2.5, true, new Date()));
		pr.save(new Product("casual Tshirt", 1800.0, subcaspid, 2.5, true, new Date()));
		
		int parentbookId=pcr.save(new ProductCategory("Shoes", "Shoes", 0)).getCat_Id();
		int shoepid=pcr.save(new ProductCategory("Formal shoes", "Formal shoes", parentbookId)).getCat_Id();
		
		pr.save(new Product("Lether shoe", 799.0, shoepid, 2.5, true, new Date()));
		pr.save(new Product("casual shoe", 2000.0, shoepid, 2.5, true, new Date()));
		pr.save(new Product("BATA shoe", 1800.0, shoepid, 2.5, true, new Date()));
		
		int csPId=pcr.save(new ProductCategory("casual shoes", "Formal shoes", parentbookId)).getCat_Id();
		
		pr.save(new Product("Levis shoe", 799.0, csPId, 2.5, true, new Date()));
		pr.save(new Product("Uspolo shoe", 2000.0, csPId, 2.5, true, new Date()));
		pr.save(new Product("woodland shoe", 1800.0, csPId, 2.5, true, new Date()));

	}

	public void intializeProduct() {

	}
}
