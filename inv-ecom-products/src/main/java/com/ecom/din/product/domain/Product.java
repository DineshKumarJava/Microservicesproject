package com.ecom.din.product.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "productManagement")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int product_id;
	private String productName;
	private double unitprice;
	private int categoryid;
	private double taxpercent;
	private boolean activeforSale;
	@Temporal(TemporalType.DATE)
	private Date productEntrydate;

	public Product(String productName, double unitprice, int categoryid, double taxpercent, boolean activeforSale,
			Date productEntrydate) {

		super();
		this.productName = productName;
		this.unitprice = unitprice;
		this.categoryid = categoryid;
		this.taxpercent = taxpercent;
		this.activeforSale = activeforSale;
		this.productEntrydate = productEntrydate;
	}

	public Product() {
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public double getTaxpercent() {
		return taxpercent;
	}

	public void setTaxpercent(double taxpercent) {
		this.taxpercent = taxpercent;
	}

	public boolean isActiveforSale() {
		return activeforSale;
	}

	public void setActiveforSale(boolean activeforSale) {
		this.activeforSale = activeforSale;
	}

	public Date getProductEntrydate() {
		return productEntrydate;
	}

	public void setProductEntrydate(Date productEntrydate) {
		this.productEntrydate = productEntrydate;
	}

}
