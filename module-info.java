module FastFoodOrder {
    requires javafx.controls;
    requires javafx.fxml;
	requires java.sql;
	requires FinalFastFood;
	requires javafx.base;
	requires java.desktop;

    exports application;
    exports controllers;
    opens controllers to javafx.fxml;
}
