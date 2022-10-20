package com.sample;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;
@JacksonXmlRootElement
@Data
public class Order {
	private int id;
	private String name;
	private double price;
}
