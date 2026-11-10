import repository.MaterialRepository;
import service.MaterialService;
import view.View;

public class Main {

    public static void main(String[] args) {

        MaterialRepository repository = new MaterialRepository();
        MaterialService service = new MaterialService(repository);
        View view = new View(service);

        view.iniciar();

    }
}