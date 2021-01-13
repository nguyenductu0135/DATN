package edu.poly.spring.form;

import org.springframework.web.multipart.MultipartFile;

import edu.poly.spring.entity.Category;
import edu.poly.spring.entity.Product;
 
public class ProductForm {
    
	

	private String code;
    private String name;
    private double price;
  
    private boolean newProduct = false;
 
    // Upload file.
    private MultipartFile fileData;
    
    private String categoryCode;
    
    public ProductForm() {
        this.newProduct= true;
    }
 
    public ProductForm(Product product) {
        this.code = product.getCode();
        this.name = product.getName();
        this.price = product.getPrice();
        this.categoryCode = product.getCategoryCode();
    }
 
    public String getCode() {
        return code;
    }
 
    public void setCode(String code) {
        this.code = code;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }
 
    public MultipartFile getFileData() {
        return fileData;
    }
 
    public void setFileData(MultipartFile fileData) {
        this.fileData = fileData;
    }
 
    public boolean isNewProduct() {
        return newProduct;
    }
 
    public void setNewProduct(boolean newProduct) {
        this.newProduct = newProduct;
    }
    public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
   
}