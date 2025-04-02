package view.components;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javax.swing.*;

public class Sidebar extends VBox {
    public Button btnFornecedor = new Button("Fornecedor");
    public Button btnProdutos = new Button("Produtos");
    public Button btnCliente = new Button("Cliente");
    public Button btnPedidos = new Button("Pedidos");

    // construtor para inicializar o componente com um objeto o componente em outras janelas
    public Sidebar() {
        Image imgIconFornecedor = new Image(getClass().getResourceAsStream("/view/img/iconFornecedor.png"));
        Image imgIconCliente = new Image(getClass().getResourceAsStream("/view/img/iconCliente.png"));
        Image imgIconProduto = new Image(getClass().getResourceAsStream("/view/img/iconProduto.png"));
        Image imgIconPedidos = new Image(getClass().getResourceAsStream("/view/img/iconPedido.png"));

        ImageView imgFornecedor = new ImageView(imgIconFornecedor);
        imgFornecedor.setFitHeight(25);
        imgFornecedor.setFitWidth(25);
        btnFornecedor.setGraphic(imgFornecedor);

        ImageView imgCliente = new ImageView(imgIconCliente);
        imgCliente.setFitHeight(25);
        imgCliente.setFitWidth(25);
        btnCliente.setGraphic(imgCliente);

        ImageView imgProduto = new ImageView(imgIconProduto);
        imgProduto.setFitHeight(25);
        imgProduto.setFitWidth(25);
        btnProdutos.setGraphic(imgProduto);

        ImageView imgPedidos = new ImageView(imgIconPedidos);
        imgPedidos.setFitHeight(25);
        imgPedidos.setFitWidth(25);
        btnPedidos.setGraphic(imgPedidos);

        // Estilo personalizado para o botão
        String styleButton = "-fx-background-color: transparent;" +
                "-fx-border-color: white;" +
                "-fx-font-size: 16px;" +
                "-fx-padding: 10px;" +
                "-fx-border-color: transparent;" +
                "-fx-border-radius: 5px;" +
                "-fx-background-radius: 5px;";

        btnFornecedor.setStyle(styleButton);
        btnProdutos.setStyle(styleButton);
        btnCliente.setStyle(styleButton);
        btnPedidos.setStyle(styleButton);
    }
}