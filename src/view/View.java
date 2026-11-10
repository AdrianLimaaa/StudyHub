package view;

import model.Material;
import service.MaterialService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    private final MaterialService service;
    private final Scanner sc = new Scanner(System.in);

    public View(MaterialService service) {
        this.service = service;
    }

    public void exibirMenu(){
        System.out.println("========= STUDYHUB =========");
        System.out.println("1 - Cadastrar material");
        System.out.println("2 - Listar todos os materiais");
        System.out.println("3 - Buscar material por ID");
        System.out.println("4 - Buscar material por Tópico");
        System.out.println("5 - Buscar material por Tag");
        System.out.println("6 - Excluir material");
        System.out.println("0 - Sair");
    }

    public void iniciar() {
        int op = -1;
        while (op != 0) {
            exibirMenu();
            System.out.println("Escolha uma opção");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1 -> cadastrarMaterial();
                case 2 -> listarMateriais();
                case 3 -> buscarPorId();
                case 4 -> buscarPorTopico();
                case 5 -> buscarPorTags();
                case 6 -> excluirMaterial();
                case 0 -> System.out.println("Encerrando StudyHub...");
                default -> System.out.println("Opção inválida!");
            }

        }
    }

    private void cadastrarMaterial(){
        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Descrição: ");
        String descricao = sc.nextLine();

        System.out.println("Link: ");
        String link = sc.nextLine();

        System.out.println("Tópico: ");
        String topico = sc.nextLine();

        int tag = -1;
        List<String> tags = new ArrayList<>();
        while (tag != 2) {
            System.out.println("Tags: ");
             tags.add(sc.nextLine());
             System.out.println("Deseja adicionar mais tags? \nPara sim digite 1\nPara não digite 2");
             tag = sc.nextInt();
             sc.nextLine();
        }

        Material material = new Material(nome,descricao,link,topico,tags);

        service.cadastrar(material);
    }

    private void listarMateriais(){
        List<Material> lista = service.listarTodos();
        System.out.println("========= MATERIAIS =========");
       if (lista.isEmpty()) {
           System.out.println("Lista vazia");
       } else  {
           for (Material material : lista) {
               System.out.println("ID: " + material.getId());
               System.out.println("----------------------------");
               System.out.println("Nome: " + material.getNome());
               System.out.println("----------------------------");
               System.out.println("Descrição: " + material.getDescricao());
               System.out.println("----------------------------");
               System.out.println("Link: " + material.getLink());
               System.out.println("----------------------------");
               System.out.println("Tópico: " + material.getTopico());
               System.out.println("----------------------------");
               System.out.println("Tags: " + material.getTags());
               System.out.println("---------------------------- \n");
           }
       }
    }

    private void buscarPorId(){
        System.out.println("Informe o ID do material:");
        Long idMaterial = sc.nextLong();
        sc.nextLine();
        if (idMaterial <= 0) {
            System.out.println("Id invalido!");
            return;
        }
        Material material = service.buscarPorId(idMaterial);
            if (material == null) {
            System.out.println("O material procurado não existe!");
        } else {
            System.out.println("ID: " + material.getId());
            System.out.println("----------------------------");
            System.out.println("Nome: " + material.getNome());
            System.out.println("----------------------------");
            System.out.println("Descrição: " + material.getDescricao());
            System.out.println("----------------------------");
            System.out.println("Link: " + material.getLink());
            System.out.println("----------------------------");
            System.out.println("Tópico: " + material.getTopico());
            System.out.println("----------------------------");
            System.out.println("Tags: " + material.getTags());
                System.out.println("---------------------------- \n");
        }
    }

    private  void buscarPorTopico() {
        System.out.println("Informe o Tópico desejado:");
        String topico = sc.nextLine();
        List<Material> materiais = service.listarPorTopico(topico);
        System.out.println("========= MATERIAIS =========");
        if (materiais.isEmpty()) {
            System.out.println("Nenhum material encontrado!");
        } else  {
            for (Material material : materiais) {
                System.out.println("ID: " + material.getId());
                System.out.println("----------------------------");
                System.out.println("Nome: " + material.getNome());
                System.out.println("----------------------------");
                System.out.println("Descrição: " + material.getDescricao());
                System.out.println("----------------------------");
                System.out.println("Link: " + material.getLink());
                System.out.println("----------------------------");
                System.out.println("Tópico: " + material.getTopico());
                System.out.println("----------------------------");
                System.out.println("Tags: " + material.getTags());
                System.out.println("---------------------------- \n");
            }
        }

    }

    private void buscarPorTags() {
        System.out.println("Informe a Tag desejada:");
        String tag = sc.nextLine();
        List<Material> materiais = service.listarPorTag(tag);
        System.out.println("========= MATERIAIS =========");
        if (materiais.isEmpty()) {
            System.out.println("Nenhum material encontrado!");
        } else  {
            for (Material material : materiais) {
                System.out.println("ID: " + material.getId());
                System.out.println("----------------------------");
                System.out.println("Nome: " + material.getNome());
                System.out.println("----------------------------");
                System.out.println("Descrição: " + material.getDescricao());
                System.out.println("----------------------------");
                System.out.println("Link: " + material.getLink());
                System.out.println("----------------------------");
                System.out.println("Tópico: " + material.getTopico());
                System.out.println("----------------------------");
                System.out.println("Tags: " + material.getTags());
                System.out.println("---------------------------- \n");
            }
        }

    }

    private void excluirMaterial(){
        System.out.println("Informe o id do material: ");
        Long idMaterial = sc.nextLong();
        sc.nextLine();
        if (idMaterial <= 0 ) {
            System.out.println("Id invalido!");
            return;
        }
        boolean excluido = service.excluir(idMaterial);

        if ( excluido) {
            System.out.println("Material excluído com sucesso!");
        } else {
            System.out.println("Material não encontrado!");
        }
    }
}
