package com.myftiu.data.structure;

/**
 * @author by ali myftiu on 08/10/14.
 */
public class Products {

	private String attributes;
	private String value;


	public Products() {
	}

	public Products(String attributes, String value)
	{
		this.attributes = attributes;
		this.value = value;
	}

	public String getAttributes()
	{
		return attributes;
	}

	public void setAttributes(String attributes)
	{
		this.attributes = attributes;
	}

	public String getValue()
	{
		return value;
	}

	public void setValue(String value)
	{
		this.value = value;
	}

	@Override
	public String toString()
	{
		return "Products{" +
				"attributes='" + attributes + '\'' +
				", value='" + value + '\'' +
				'}';
	}
}
