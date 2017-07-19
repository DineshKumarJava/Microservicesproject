package com.ecom.din.product.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product_Category")
public class ProductCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cat_Id;
	private String cat_Name;
	private String cat_Displayname;
	private int subCatId;

	public ProductCategory(String cat_Name, String cat_Displayname, int subCatId) {
		super();
		this.cat_Name = cat_Name;
		this.cat_Displayname = cat_Displayname;
		this.subCatId = subCatId;
	}

	public ProductCategory() {

	}

	

	public int getSubCatId() {
		return subCatId;
	}

	public void setSubCatId(int subCatId) {
		this.subCatId = subCatId;
	}

	public int getCat_Id() {
		return cat_Id;
	}

	public void setCat_Id(int cat_Id) {
		this.cat_Id = cat_Id;
	}

	public String getCat_Name() {
		return cat_Name;
	}

	public void setCat_Name(String cat_Name) {
		this.cat_Name = cat_Name;
	}

	public String getCat_Displayname() {
		return cat_Displayname;
	}

	public void setCat_Displayname(String cat_Displayname) {
		this.cat_Displayname = cat_Displayname;
	}

}
