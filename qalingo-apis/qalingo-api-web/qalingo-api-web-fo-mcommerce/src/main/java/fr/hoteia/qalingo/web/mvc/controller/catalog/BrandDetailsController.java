/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.7.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2013
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package fr.hoteia.qalingo.web.mvc.controller.catalog;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.hoteia.qalingo.core.Constants;
import fr.hoteia.qalingo.core.domain.MarketArea;
import fr.hoteia.qalingo.core.domain.ProductBrand;
import fr.hoteia.qalingo.core.service.ProductBrandService;
import fr.hoteia.qalingo.core.web.servlet.ModelAndViewThemeDevice;
import fr.hoteia.qalingo.web.mvc.controller.AbstractMCommerceFrontofficeController;

/**
 * 
 */
@Controller
public class BrandDetailsController extends AbstractMCommerceFrontofficeController {

	@Autowired
	protected ProductBrandService productBrandService;
	
	@RequestMapping("/brand-details.html*")
	public ModelAndView brandDetails(final HttpServletRequest request, final HttpServletResponse response) throws Exception {
		ModelAndViewThemeDevice modelAndView = new ModelAndViewThemeDevice(getCurrentVelocityPath(request), "catalog/brand-details");

		final MarketArea currentMarketArea = requestUtil.getCurrentMarketArea(request);
		final String brandCode = request.getParameter(Constants.REQUEST_PARAM_BRAND_CODE);
		final ProductBrand productBrand = productBrandService.getProductBrandByCode(currentMarketArea.getId(), brandCode);
		
		// "brand.details";
		modelAndViewFactory.initPageBrandDetails(request, response, modelAndView, productBrand, "");
		
        return modelAndView;
	}

}