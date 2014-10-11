package com.myftiu.data.structure;

import java.util.List;
import java.util.Map;

/**
 * @author by ali myftiu on 08/10/14.
 */
public class Products {

    private int id;
	private Map attributes;


	public Products() {
	}

	public Products(int id, Map attributes)
	{
		this.id = id;
        this.attributes = attributes;

	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map getAttributes() {
        return attributes;
    }

    public void setAttributes(Map attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", attributes=" + attributes +
                '}';
    }
}

