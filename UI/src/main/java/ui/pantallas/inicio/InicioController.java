package ui.pantallas.inicio;

import game.demiurge.DemiurgeHomeManager;
import game.demiurge.exceptions.GoDungeonException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import ui.pantallas.common.BasePantallaController;

import java.util.RandomAccess;

public class InicioController extends BasePantallaController {

//    @FXML
//    private ImageView imagenView;
DemiurgeHomeManager homeManager;

    public void initialize() {
//        double nuevoAncho = 800; // ajusta el valor según tus necesidades
//        double nuevoAlto = 750;
//        // Puedes cargar una imagen en la inicialización del controlador
//        Image imagen = new Image(getClass().getResource("/images/sala.jpeg").toExternalForm(), nuevoAncho, nuevoAlto, true, true);
//        imagenView.setImage(imagen);
    }

    public void exit(ActionEvent actionEvent) {
        getPrincipalController().exit(actionEvent);
    }

    public void goToDungeon(ActionEvent actionEvent) throws GoDungeonException {
        throw new GoDungeonException();
    }

    public void sleep(ActionEvent actionEvent) {
getPrincipalController().showConfirmationAlert("Zzz...");
    }

    public void recoverLifePoints(ActionEvent actionEvent) {
    }

    public void mergeCrystals(ActionEvent actionEvent) {
    }

    public void upgradeChracteristics(ActionEvent actionEvent) {
    }

    public void manageSpells(ActionEvent actionEvent) {
    }

    public void manageStorage(ActionEvent actionEvent) {
    }
}
