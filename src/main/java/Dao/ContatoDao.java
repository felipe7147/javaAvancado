package Dao;
import java.util.List;

import src.modelo.Contato;

public interface ContatoDao {
	void insert (Contato obj);
	void update (Contato obj);
	void deleById (Integer id);
	
	Contato findById (Integer id);
	List<Contato> findAll();

}
