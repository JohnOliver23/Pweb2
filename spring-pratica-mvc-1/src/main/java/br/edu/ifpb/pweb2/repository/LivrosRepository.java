package br.edu.ifpb.pweb2.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.ifpb.pweb2.model.Livro;

public class LivrosRepository {
	private static Map<Integer, Livro> data = new HashMap<Integer, Livro>();

	public static Livro store(Livro livro) {
		List ids = new ArrayList(data.keySet());
		Collections.sort(ids);
		Integer max;
		if (ids.size() != 0) {
			max = (Integer) ids.get(ids.size()-1);			
		} else {
			max = 0;
		}
		data.put(++max, livro);
		livro.setId(max);
		return livro;
	}
	
	public static List<Livro> findAll(){
		return new ArrayList(data.values());
	}

}
