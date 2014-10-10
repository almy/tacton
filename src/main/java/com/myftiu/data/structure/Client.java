package com.myftiu.data.structure;

import java.util.LinkedList;
import java.util.List;

/**
 * @author by ali myftiu on 08/10/14.
 */
public class Client {

	private String name;
	private String address;
	private Organisation organisation;
	private List<ShoppingCart> shoppingCart;

	public Client(){
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public Organisation getOrganisation()
	{
		return organisation;
	}

	public void setOrganisation(Organisation organisation)
	{
		this.organisation = organisation;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public List<ShoppingCart> getShoppingCart()
	{
		return shoppingCart;
	}

	public List<ShoppingCart> createShoppingCart() {
		return new LinkedList();
	}

	@Override
	public String toString()
	{
		return "Client{" +
				"name='" + name + '\'' +
				", address='" + address + '\'' +
				", organisation=" + organisation +
				'}';
	}
}
