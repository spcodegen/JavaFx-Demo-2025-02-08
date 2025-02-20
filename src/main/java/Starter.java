import com.google.inject.Guice;
import com.google.inject.Injector;
import config.AppModule;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;

public class Starter extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

//        List<String> customerList = Arrays.asList("Sandeep", "Saman", "Kamal", "Sunil");
//        customerList.forEach(customer -> {
//            System.out.println(customer);
//        });
//        System.out.println("------------------------------------------------");
//        customerList.forEach(System.out::println);

        Injector injector = Guice.createInjector(new AppModule());
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/customer_manage.fxml"));
        fxmlLoader.setControllerFactory(injector::getInstance);
        stage.setScene(new Scene(fxmlLoader.load()));
        stage.show();
    }
}
