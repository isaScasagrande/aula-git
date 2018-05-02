/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 05021377205
 */

public class menuController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField txtResultado;
    @FXML
    private Button btnSoma;
    @FXML
    private TextField txtNum1;
    @FXML
    private TextField textNum2;
    @FXML
    private Button btnSubtrai;
    @FXML
    private Button btnDivide;
    @FXML
    private Button btnMultiplica;
    

    
    @FXML
    private void soma(ActionEvent event) {
       Double num1= Double.parseDouble(txtNum1.getText());
        Double num2= Double.parseDouble(textNum2.getText());
        Double resultado = num1+num2;
        
        txtResultado.setText(resultado.toString()) ;
    }
      @FXML
    private void subtrai(ActionEvent event) {
       Double num1= Double.parseDouble(txtNum1.getText());
        Double num2= Double.parseDouble(textNum2.getText());
        Double resultado = num1 - num2;
        
        txtResultado.setText(resultado.toString()) ;
    }   
    @FXML
    private void divide(ActionEvent event) {
       Double num1= Double.parseDouble(txtNum1.getText());
        Double num2= Double.parseDouble(textNum2.getText());
        Double resultado = num1 / num2;
        
        txtResultado.setText(resultado.toString()) ;
    }
        @FXML
    private void multiplica(ActionEvent event) {
       Double num1= Double.parseDouble(txtNum1.getText());
        Double num2= Double.parseDouble(textNum2.getText());
        Double resultado = num1 * num2;
        
        txtResultado.setText(resultado.toString()) ;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
        // TODO
    }    
    
}
