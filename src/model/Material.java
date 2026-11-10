package model;

import java.util.ArrayList;
import java.util.List;

public class Material {
    private Long id;
    private String nome;
    private String descricao;
    private String link;
    private String topico;
    private List<String> tags;

    public Material (String nome,String descricao,String link, String topico, List<String> tags){
        this.nome = nome;
        this.descricao =descricao;
        this.link = link;
        this.topico = topico;
        this.tags = new ArrayList<>(tags);
    }

    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getDescricao(){
        return descricao;
    }
    public String getLink() {
        return link;
    }
    public String getTopico() {
        return topico;
    }
    public List<String> getTags() {
        return new ArrayList<>(this.tags);
    }


    public void setId(long id){this.id = id;}
    public void setNome (String nome) {
        this.nome = nome;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public void setTopico(String topico) {
        this.topico = topico;
    }
    public void adicionarTag(String tag) {
        if (!tags.contains(tag)){
            tags.add(tag);
        }
    }
    public void removerTag(String tag) {
        tags.remove(tag);
    }



}
