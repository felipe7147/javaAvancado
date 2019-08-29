package Dao;
import java.util.List;

import src.modelo.Fornecedor;

public interface FornecedorDao {
	void insert (Fornecedor obj);
	void update (Fornecedor obj);
	void deleteById (Integer id);
	
	Fornecedor findById(Integer id);
	List<Fornecedor> findAll();

}
