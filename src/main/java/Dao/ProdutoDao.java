package Dao;
import java.util.List;

import src.modelo.Produto;

public interface ProdutoDao {
	void insert (Produto obj);
	void update (Produto obj);
	void delteById(Integer id);
	
	Produto findAll(Integer id);
	List<Produto> findAll();

}
