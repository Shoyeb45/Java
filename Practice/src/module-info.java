module Practice {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.base;
	requires java.desktop;
	requires javafx.swing;
	
	opens application to javafx.graphics, javafx.fxml;
	exports communicationBetweenControllers;
	opens communicationBetweenControllers to javafx.fxml;
	exports logoutbutton;
	opens logoutbutton to javafx.fxml;
	
	exports imageviewEx;
	opens imageviewEx to javafx.fxml;
	
	exports textfieldEx;
	opens textfieldEx to javafx.fxml;
	
	exports checkbox;
	opens checkbox to javafx.fxml;
	
	exports radiobutton;
	opens radiobutton to javafx.fxml;
	
	exports colorpicker;
	opens colorpicker to javafx.fxml;
	
	exports choicebox;
	opens choicebox to javafx.fxml;
	
	exports slider;
	opens slider to javafx.fxml;
	
	exports progressbar;
	opens progressbar to javafx.fxml;
	
	exports listview;
	opens listview to javafx.fxml;
	
	exports treeview;
	opens treeview to javafx.fxml;
	
	exports menubar;
	opens menubar to javafx.fxml;
	exports keyevent;
	opens keyevent to javafx.fxml;
}
