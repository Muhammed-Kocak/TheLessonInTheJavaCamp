package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.ErrorResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service // business'da ki servisimiz demek istiyoruz.
public class ProductManager implements ProductService {

	private ProductDao productDao;

	@Autowired // otomatik dependency yapıyor ve bize instance veriyor.
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(), "Data Listelendi");
	}

	@Override
	public Result add(Product product) {
		var result = this.productDao.findById(product.getId());

		if (result.isEmpty()) {
			return new ErrorResult("Aynı isimde bir ürün mevcut");
		} else {
			this.productDao.save(product);
			return new SuccessResult("Ürün eklendi");
		}
	}

	@Override
	public Result update(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

}
