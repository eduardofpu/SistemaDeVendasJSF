package br.com.Vendas.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.Vendas.DAO.FuncionariosDAO;
import br.com.Vendas.domain.Funcionario;

public class FuncionarioDAOTest {
	@Test
	@Ignore
	public void salvar(){
		
		
		Funcionario f1 = new Funcionario();
		
			f1.setNome("Luciana");
			f1.setCpf("044.458.756-00");// CPF incorreto
			f1.setSenha("12345");
			f1.setFuncao("Funcionário");
		
		
		
		
		FuncionariosDAO dao = new FuncionariosDAO();
		dao.salvar(f1);
	}
	
	@Test
	@Ignore
	public void listar(){
		FuncionariosDAO dao = new FuncionariosDAO();
		List<Funcionario> funcionarios = dao.listar();
		
		for(Funcionario funcionario : funcionarios){
			System.out.println(funcionario);
		}
	}
	
	@Test
	@Ignore
	public void buscarPorCodigo(){
		FuncionariosDAO dao = new FuncionariosDAO();
		Funcionario f1 = dao.buscarPorCodigo(3L);
		
		
			System.out.println(f1);
			
	}
	
	@Test
	@Ignore
	public void excluir(){
		FuncionariosDAO dao = new FuncionariosDAO();
		
		Funcionario funcionario = dao.buscarPorCodigo(1L);
		
		
		dao.excluir(funcionario);
		
		
			
	}
	
	
	
	@Test
	@Ignore
	public void editar(){
		
		FuncionariosDAO dao = new FuncionariosDAO();
		
		Funcionario funcionario = dao.buscarPorCodigo(1L);
		funcionario.setNome("Paula Campos");
		funcionario.setSenha("456");
		funcionario.setCpf("0646454");
		funcionario.setFuncao("Gerente");
		
		dao.editar(funcionario);
		
			
	}
	
}
