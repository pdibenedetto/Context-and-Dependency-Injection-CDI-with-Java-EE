package com.readlearncode.introduction.dependecyinjection;

import javax.inject.Inject;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class ProductService {

    @Inject
    private CodeGenerator codeGenerator;

//    ProductService(CodeGenerator
//                      codeGenerator){
//        this.codeGenerator = codeGenerator;
//    }

    public Product generateCode(Product product) {
        String barcode =
                codeGenerator.generateCode();
        product.setCode(barcode);
        return product;
    }

}