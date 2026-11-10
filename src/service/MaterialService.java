package service;

import model.Material;
import repository.MaterialRepository;

import java.util.List;

public class MaterialService {
    private final MaterialRepository repository;

    public MaterialService(MaterialRepository repository) {
        this.repository = repository;
    }

    public void cadastrar(Material material){
        repository.adicionar(material);
    }

    public List<Material> listarTodos(){
        return repository.listarTodos();
    }

    public Material buscarPorId(Long id){
        return repository.buscarPorId(id);
    }

    public List<Material> listarPorTopico(String topico){
        return repository.buscarPorTopico(topico);
    }

    public List<Material> listarPorTag(String tag){
        return repository.buscarPorTag(tag);
    }

    public boolean excluir(Long id){
        return repository.excluir(id);
    }

}
