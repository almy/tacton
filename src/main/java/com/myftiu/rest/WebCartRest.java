package com.myftiu.rest;

import com.myftiu.data.structure.Organisation;
import com.myftiu.data.structure.ShoppingCart;
import com.myftiu.service.NumbersService;
import com.myftiu.service.WebCartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by ali myftiu on 09/10/14.
 */

@RestController
@RequestMapping("/v1/cart")
public class WebCartRest
{

	private static final Logger log = LoggerFactory.getLogger(WebCartRest.class);

	@Autowired
	private WebCartService webCartService;

    @Autowired
    private NumbersService numbersService;


	@RequestMapping(value = "/print/webcart/{id}", method = RequestMethod.GET, produces = "application/json")
	public ShoppingCart getTransaction(@PathVariable("id") int cartId)
	{
		log.info("retrieving web card with id {}" , cartId);
		return webCartService.getShoppingCart();
	}


	@RequestMapping(value = "/print/organisation", method = RequestMethod.GET, produces = "application/json")
	public Organisation getTransaction()
	{
		log.info("getting all information for the organisation");
		return webCartService.getOrganisation();
	}

    @RequestMapping(value = "/print/numbers/{number}", method = RequestMethod.GET, produces = "application/json")
    public int getNumber(@PathVariable("number") int number)
    {
        log.info("retrieving number with index {}" , number);
        return numbersService.calculateNumber(number);
    }




}
