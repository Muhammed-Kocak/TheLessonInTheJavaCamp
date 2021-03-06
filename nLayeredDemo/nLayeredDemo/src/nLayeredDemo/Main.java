package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.adapters.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
//import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class Main {

	public static void main(String[] args) {
		
		//ToDo: Spring IoC ile daha farkl? yaz?lacak.(Refactor)
		ProductService productService = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter(new JLoggerManager()));
		
		productService.add(new Product(1,2,"Elma",12,50));
		
		
	}

}
