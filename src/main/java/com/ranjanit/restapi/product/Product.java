package com.ranjanit.restapi.product;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Product {
	@Id
	private Integer pid;
	private String pname;
	private Double  price;
	

}
