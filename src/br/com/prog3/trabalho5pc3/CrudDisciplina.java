package br.com.prog3.trabalho5pc3.jeronimo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CrudDisciplina {

	private static Map<Integer, Disciplina> mapaDisciplina;

	public CrudDisciplina() {
		if (mapaDisciplina == null) {
			Disciplina d1 = new Disciplina(1, "PC3", 72);
			Disciplina d2 = new Disciplina(2, "BD1", 50);
			mapaDisciplina = new HashMap<>();
			mapaDisciplina.put(d1.getCodigo(), d1);
			mapaDisciplina.put(d2.getCodigo(), d2);
		}
	}

	public List<Disciplina> listarTodos() {
		return new ArrayList<>(mapaDisciplina.values());
	}

	public Disciplina buscarPeloCodigo(Integer codigo) {
		return mapaDisciplina.get(codigo);
	}

	public boolean inserir(Disciplina disciplina) {
		if (mapaDisciplina.containsKey(disciplina.getCodigo()))
			return false;
		mapaDisciplina.put(disciplina.getCodigo(), disciplina);
		return true;
	}

	public boolean excluir(Integer codigoDisicplina) {
		if (!mapaDisciplina.containsKey(codigoDisicplina))
			return false;
		mapaDisciplina.remove(codigoDisicplina);
		return true;
	}

	public void alterar(Disciplina disciplina) {
		if (mapaDisciplina.containsKey(disciplina.getCodigo()))
			mapaDisciplina.replace(disciplina.getCodigo(), disciplina);
		else
			mapaDisciplina.put(disciplina.getCodigo(), disciplina);
	}
}
