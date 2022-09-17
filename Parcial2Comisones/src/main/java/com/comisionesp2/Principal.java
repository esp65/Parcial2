/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.comisionesp2;

import java.sql.*;

/**
 *
 * @author USUARIO
 */
public class Principal {
    
    public static void ej1(){
        
    //paso 1 creamos la conexion a la base de datos
        String url = "jdbc:mysql://localhost:3306/dbcomisiones?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            //paso 2 creamos el objeto conexion
            Connection conexion = DriverManager.getConnection(url,"root","Estefani5768");
            //paso 3 creamos el objeto statement
            Statement sentencia = conexion.createStatement();
            //paso 4 creamos la instruccion
            String sql = "SELECT * FROM dbcomisiones.tbcomisiones";
            
            // paso 5 ejecutamos el query
            ResultSet resultado = sentencia.executeQuery(sql);
            // paso 6. procesar el resultado
            // explicar como se maneja al siguiente registro
            while(resultado.next()){
                System.out.println("niv ="+resultado.getInt(1));
                System.out.println("nombre ="+resultado.getString(2));
                System.out.println("Enero ="+resultado.getInt(3));
                System.out.println("Febrero ="+resultado.getInt(4));
                System.out.println("Marzo ="+resultado.getInt(5));
                System.out.println("Abril ="+resultado.getInt(6));
                System.out.println("Mayo ="+resultado.getInt(7));
                System.out.println("Junio ="+resultado.getInt(8));
            }
             
         
                 
                 
        } catch (SQLException ex) {
            System.out.println("Tiene problema="+ex.getMessage());
            
        }     
          
}
    
 
    
           public static void niv(int niv){
        String url = "jdbc:mysql://localhost:3306/dbcomisiones?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            //paso 2 creamos el objeto conexion
            Connection conexion = DriverManager.getConnection(url,"root","Estefani5768");
            //paso 3 creamos el objeto statement
            Statement sentencia = conexion.createStatement();
            //paso 4 creamos la instruccion
            String sql = "select * from tbcomisiones where niv ="+ niv ;
             ResultSet resultado = sentencia.executeQuery(sql);
             while(resultado.next()){
                System.out.println("niv ="+resultado.getInt(1));
                System.out.println("Nombre = "+resultado.getString(2));
                System.out.println("Enero ="+resultado.getInt(3));
                System.out.println("Febrero ="+resultado.getInt(4));
                System.out.println("Marzo ="+resultado.getInt(5));
                System.out.println("Abril ="+resultado.getInt(6));
                System.out.println("Mayo ="+resultado.getInt(7));
                System.out.println("Junio ="+resultado.getInt(8));
                
                int tm  = resultado.getInt(3)+resultado.getInt(4)+resultado.getInt(5)+resultado.getInt(6)+resultado.getInt(7)+resultado.getInt(8);
                 System.out.println("el total es  ="+tm);       
             }
        } catch (SQLException ex) {
            System.out.println("Tenemos prolema:"+ex.getMessage());
        }
} 
          
    
   public static void eliminar_Datos(int iv){
       
    //paso 1 creamos la conexion a la base de datos
        String url = "jdbc:mysql://localhost:3306/dbcomisiones?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            Connection conexion = DriverManager.getConnection(url,"root","Estefani5768");
            Statement sentencia = conexion.createStatement();
            String sql = "DELETE FROM tbcomisiones where niv ="+ iv +";";
             System.out.println("Has eliminado un empleado");
              String sqll = " ALTER TABLE tbcomisiones AUTO_INCREMENT = 1;";
            sentencia.execute(sql);
            sentencia.execute(sqll);
        } catch (SQLException ex) {
            System.out.println("Tenemos problemas!!!:"+ex.getMessage());
        }
     }
   
   
   public static void Datos(int niv,String nue){
    
        String url = "jdbc:mysql://localhost:3306/dbcomisiones?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            Connection conexion = DriverManager.getConnection(url,"root","Estefani5768");
            Statement sentencia = conexion.createStatement();
            String sql = "Update tbcomisiones set nombre='" +nue+ "' where niv= "+niv+";";
             System.out.println("Grabamos el ingreso");
            sentencia.execute(sql);
           
        } catch (SQLException ex) {
            System.out.println("Tenemos problema:"+ex.getMessage());
        }
   }

    public static void meses(int niv, int ms1, int ms2,int ms3,int ms4,int ms5,int ms6){
        
        String url = "jdbc:mysql://localhost:3306/dbcomisiones?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            Connection conexion = DriverManager.getConnection(url,"root","Estefani5768");
            Statement sentencia = conexion.createStatement();
            String sql = "update tbcomisiones set enero='"+ms1+ "', febrero='" +ms2+ "', marzo='" +ms3+ "', abril='" +ms4+"', mayo='" +ms5+"', junio='" +ms6+"' where niv="+niv+";";
             System.out.println("Ya se realizo");
            sentencia.execute(sql);
           
        } catch (SQLException ex) {
            System.out.println("Tenemos probelam!!!:"+ex.getMessage());
        }
}
    
            public static void empleados(){
        String url = "jdbc:mysql://localhost:3306/dbcomisiones?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            Connection conexion = DriverManager.getConnection(url,"root","Estefani5768");
            Statement sentencia = conexion.createStatement();
            String sql = "SELECT * FROM dbcomisiones.tbcomisiones";
            ResultSet resultado = sentencia.executeQuery(sql);
            while(resultado.next()){
                System.out.println("niv ="+resultado.getInt(1));
                System.out.println("nombre = "+resultado.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println("Tuvimos problema:"+ex.getMessage());
        }
     }
    
    
      public static void total_meses(){
        String url = "jdbc:mysql://localhost:3306/dbcomisiones?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            Connection conexion = DriverManager.getConnection(url,"root","Estefani5768");
            Statement sentencia = conexion.createStatement();
            
            
            String sql = "SELECT sum(enero) as mes1, sum(febrero) as mes2, sum(marzo) as mes3, sum(abril) as mes4, sum(mayo) as mes5, sum(junio) as mes6 FROM dbcomisiones.tbcomisiones";
            
            ResultSet resultado = sentencia.executeQuery(sql);
            while(resultado.next()){
                
             System.out.println("el total de Enero es ="+resultado.getInt(1));
             System.out.println("el total de Febrero es ="+resultado.getInt(2));
             System.out.println("el total de Marzo es ="+resultado.getInt(3));
             System.out.println("el total de Abril es ="+resultado.getInt(4));
             System.out.println("el total de Mayo es ="+resultado.getInt(5));
             System.out.println("el total de Junio es ="+resultado.getInt(6));
            }
             
        } catch (SQLException ex) {
            System.out.println("Volvimos a tener problema:"+ex.getMessage());
        }
}
    
    
    
    
 
      public static void main(String[]args){
         ej1();

      }

   

   
}
    

