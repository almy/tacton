package com.myftiu.data.structure;

import java.util.LinkedList;
import java.util.List;

/**
 * @author by ali myftiu on 08/10/14.
 */
public class ShoppingCart {

	private int id;
	private Client client;
	private List<Products> products;



	public ShoppingCart(Client client)
	{
		this.client = client;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public Client getClient()
	{
		return client;
	}

	public void setClient(Client client)
	{
		this.client = client;
	}

	public List<Products> getProducts()
	{
		return products;
	}

	public void setProducts(List<Products> products)
	{
		this.products = products;
	}

	@Override
	public String toString()
	{
		return "ShoppingCart{" +
				"id=" + id +
				", client=" + client +
				", products=" + products +
				'}';
	}
}
