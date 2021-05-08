package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service //business'da ki servisimiz demek istiyoruz.
public class ProductManager implements ProductService {

	private ProductDao productDao;
	
	@Autowired //otomatik dependency yapıyor ve bize instance veriyor.
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		return productDao.findAll();
	}

}
