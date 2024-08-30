package treeview;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller implements Initializable {
	
	@FXML
	private TreeView<String> myTreeView;
	@SuppressWarnings("unchecked")
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		TreeItem<String> files = new TreeItem<>("Files", new ImageView(new Image("folder.png")));
		
		
		TreeItem<String> pictures = new TreeItem<>("Pictures", new ImageView(new Image("picture.png")));
		TreeItem<String> musics = new TreeItem<>("Musics", new ImageView(new Image("music.png")));
		TreeItem<String> videos = new TreeItem<>("Videos", new ImageView(new Image("video.png")));
		
		files.getChildren().addAll(pictures, musics, videos);
		
		TreeItem<String> video1 = new TreeItem<>("Video1");
		TreeItem<String> video2 = new TreeItem<>("Video2");
		videos.getChildren().addAll(video1, video2);
		
		TreeItem<String> music1 = new TreeItem<>("Music1");
		TreeItem<String> music2 = new TreeItem<>("Music2");
		musics.getChildren().addAll(music1, music2);
		
		TreeItem<String> picture1 = new TreeItem<>("Picture1");
		TreeItem<String> picture2 = new TreeItem<>("Picture2");
		pictures.getChildren().addAll(picture1, picture2);
		myTreeView.setRoot(files);
	}
	
	public void selectItem() {
		TreeItem<String> item = myTreeView.getSelectionModel().getSelectedItem();
		if(item != null) {
			System.out.println(item.getValue());
		}
	}
}
