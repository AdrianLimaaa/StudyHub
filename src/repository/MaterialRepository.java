package repository;

import model.Material;

import java.util.ArrayList;
import java.util.List;

public class MaterialRepository {
    private List<Material> materiais = new ArrayList<>();
    private long proximoId = 1;

    public void adicionar (Material material) {
        if (material.getId()!= null){
            System.out.println("O material já possui um ID");
        } else {
        material.setId(proximoId);
        materiais.add(material);
        proximoId += 1;
        }
    }

    public List <Material> listarTodos(){
        return new ArrayList<>(materiais);
    }

    public Material buscarPorId(Long id){
        for (Material material : materiais) {
            if (material.getId().equals(id)){
                return material;
            }
        } return null;
    }

    public List<Material> buscarPorTopico(String topico){
        List<Material> buscar = new ArrayList<>();
        for (Material material :materiais) {
            if (material.getTopico().equals(topico)){
                buscar.add(material);
            }
        } return buscar;
    }

    public List<Material> buscarPorTag(String tag){
            List<Material> buscar = new ArrayList<>();
        for (Material material :materiais) {
            if (material.getTags().contains(tag)){
                buscar.add(material);
            }
        } return buscar;
    }

    public boolean excluir(Long id){
        Material material = buscarPorId(id);
        if (material != null) {
            return materiais.remove(material);
        } return false;
        }
    }

