/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.guillermonicolau.sistema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;


/**
 *
 * //@author programacion
 */
public class FXMLDocumentController implements Initializable {
    
    float valor1, valor2, resultado;
    int op;
    float porcent;

     @FXML private TextField txtpantalla;
     @FXML private Button btnresta;
     @FXML private Button btndivicion;
     @FXML private Button btnsuma;
     @FXML private Button btnmultiplicacion;
     @FXML private Button raiz;
     @FXML private Button nCuadrado;
     @FXML private Button porcentaje;
     @FXML private Button btnuno;
     @FXML private Button btndos;
     @FXML private Button btntres;
     @FXML private Button btncuatro;
     @FXML private Button btncinco;
     @FXML private Button btnseis;
     @FXML private Button btnsiete;
     @FXML private Button btnocho;
     @FXML private Button btnnueve;
     @FXML private Button btncero;
     @FXML private Button btnc;
     @FXML private Button btigual;
     @FXML private Button btnpunto;
     
     
     
     
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(event.getSource() == btnuno)
        txtpantalla.setText(txtpantalla.getText()+"1");
    
        else if(event.getSource() == btndos)
        txtpantalla.setText(txtpantalla.getText()+"2");
        
        else if(event.getSource() == btntres)
        txtpantalla.setText(txtpantalla.getText()+"3");   
         
         else if(event.getSource() == btncuatro)
        txtpantalla.setText(txtpantalla.getText()+"4");
         
         else if(event.getSource() == btncinco)
        txtpantalla.setText(txtpantalla.getText()+"5");
       
        else if(event.getSource() == btnseis)
        txtpantalla.setText(txtpantalla.getText()+"6");
        
        else if(event.getSource() == btnsiete)
        txtpantalla.setText(txtpantalla.getText()+"7");
        
        else if(event.getSource() == btnocho)
        txtpantalla.setText(txtpantalla.getText()+"8");
        
        else if(event.getSource() == btnnueve)
        txtpantalla.setText(txtpantalla.getText()+"9");
        
        else if(event.getSource() == btncero)
        txtpantalla.setText(txtpantalla.getText()+"0");
        
        else if(event.getSource() == btnpunto)
        txtpantalla.setText(txtpantalla.getText()+".");
        
        
        else if(event.getSource()== btnsuma){
        valor1= Float.parseFloat(txtpantalla.getText());
        txtpantalla.setText("");
         op = 1;
        }
        
        else if(event.getSource()== btnresta){
        valor1= Float.parseFloat(txtpantalla.getText());
        txtpantalla.setText("");
         op = 2;
        }
        
        else if(event.getSource()== btndivicion){
        valor1= Float.parseFloat(txtpantalla.getText());
        txtpantalla.setText("");
         op = 3;
        }
        
        else if(event.getSource()== btnmultiplicacion){
        valor1= Float.parseFloat(txtpantalla.getText());
        txtpantalla.setText("");
         op = 4;
         
        }else if(event.getSource()== raiz){
            valor1=Float.parseFloat(txtpantalla.getText());
            txtpantalla.setText("");
            op = 5;
            
        }else if(event.getSource()== porcentaje){
            valor1=Float.parseFloat(txtpantalla.getText());
            txtpantalla.setText("");
            op = 6;
            
        }else if(event.getSource()== nCuadrado){
            valor1=Float.parseFloat(txtpantalla.getText());
            txtpantalla.setText("");
            op = 7;
            
        }else if(event.getSource()== btnc){
            valor1=Float.parseFloat(txtpantalla.getText());
            txtpantalla.setText("");
            op = 8;
    }
        
        else if(event.getSource()== btigual){
        valor2 = Float.parseFloat(txtpantalla.getText());
        txtpantalla.setText("");
        switch (op){
            case 1:
             resultado= valor1+ valor2;
             txtpantalla.setText(String.valueOf(resultado));
             break;
             
             
            case 2:
                resultado = valor1-valor2;
                txtpantalla.setText(String.valueOf(resultado));
             break;
             
             case 3:
                resultado = valor1/valor2;
                txtpantalla.setText(String.valueOf(resultado));
             break;
             
             case 4:
                resultado = valor1*valor2;
                txtpantalla.setText(String.valueOf(resultado));
             break;
               
             case 5:
                resultado = (float)Math.sqrt(valor1);
                    txtpantalla.setText(String.valueOf(resultado));
                    break;
             case 6:
                 porcent = valor1/100;
                   resultado = porcent*valor2;
                    txtpantalla.setText(String.valueOf(resultado));
                    break;
             case 7:
                  resultado = (float) Math.pow (valor1, 2);
                    txtpantalla.setText(String.valueOf(resultado));
                    break;
             case 8:
                 resultado = valor1 %valor2;
                txtpantalla.setText(String.valueOf(resultado));
        }
        }
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    }  


