module exercisesmod {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens edu.howeda.exercises00 to javafx.fxml;

    exports edu.howeda.exercises00;
}
