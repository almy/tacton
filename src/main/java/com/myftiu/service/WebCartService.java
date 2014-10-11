package com.myftiu.service;

import com.myftiu.data.structure.Client;
import com.myftiu.data.structure.Organisation;
import com.myftiu.data.structure.Products;
import com.myftiu.data.structure.ShoppingCart;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author by ali myftiu on 09/10/14.
 */

@Service
public class WebCartService {

	private Client client;
	private ShoppingCart shoppingCart;
	private Products products;
	private Organisation organisation;

	private Organisation createOrganisation() {

		Organisation<String> root = new Organisation<String>("Root Org");
		{
			Organisation<String> node1 = root.addChild("Sub Org 1");
			Organisation<String> node2 = root.addChild("Sub Org 2");
			Organisation<String> node21 = node2.addChild("Sub Org 3");
			Organisation<String> node22 = node2.addChild("Sub Org 4");
		}

		return root;
	}


	private ShoppingCart createShoppingCart() {
		int index = 0;
		ShoppingCart shoppingCart = new ShoppingCart(client);
		shoppingCart.setId(12345);
		List<Products> products = new LinkedList<Products>();
		while (index < 3) {
            Products createdProduct = createProducts();
            createdProduct.setId(index);
			products.add(createdProduct);
			index++;
		}
		shoppingCart.setProducts(products);
		shoppingCart.setClient(createClient());
		return shoppingCart;
	}


	private Products createProducts() {
		Products products = new Products();
        Map attributes = new HashMap<Integer, Integer>();
        int index = 0;
        while (index < 4) {
            attributes.put(Math.random(), Math.random());
            index++;
        }
        products.setAttributes(attributes);
		return products;
	}

	private Client createClient() {
		client = new Client();
		client.setAddress("Smart Street 1122");
		return client;
	}


	public Client getClient()
	{
		return createClient();
	}

	public ShoppingCart getShoppingCart()
	{
		return createShoppingCart();
	}

	public Products getProducts()
	{
		return createProducts();
	}

	public Organisation getOrganisation()
	{
		return createOrganisation();
	}
}
