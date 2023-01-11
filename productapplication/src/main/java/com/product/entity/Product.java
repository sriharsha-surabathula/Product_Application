package com.product.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Product-Details")
public class Product {
	
	@Id
	private String id;
	private String productname;
	private String productcolor;
	private String productprice;
	private String productseller ;
	private String productbrand ;
	private String productquantity;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProductName() {
		return productname;
	}
	public void setProductName(String productname) {
		this.productname = productname;
	}
	public String getProductColor() {
		return productcolor;
	}
	public void setProductColor(String productcolor) {
		this.productcolor = productcolor;
	}
	public String getProductPrice() {
		return productprice;
	}
	public void setProductPrice(String productprice) {
		this.productprice = productprice;
	}
	public String getProductSeller() {
		return productseller;
	}
	public void setProductSeller(String productseller) {
		this.productseller = productseller;
	}
	public String getProductBrand() {
		return productbrand;
	}
	public void setProductBrand(String productbrand) {
		this.productbrand = productbrand;
	}
	public String getProductquantity() {
		return productquantity;
	}
	public void setProductquantity(String productquantity) {
		this.productbrand = productquantity;
	}
	
	public Product(String id, String productname, String productcolor, String productprice, String productseller, String productbrand ,String productquantity) {
		super();
		this.id = id;
		this.productname = productname;
		this.productcolor = productcolor;
		this.productprice = productprice;
		this.productseller = productseller;
		this.productbrand = productbrand;
		this.productquantity = productquantity;
		
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

}