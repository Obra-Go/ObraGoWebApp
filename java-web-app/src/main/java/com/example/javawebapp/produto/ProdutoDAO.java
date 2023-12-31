package com.example.javawebapp.produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.example.javawebapp.db.Conexao;


// DAO = Data Access Object
public class ProdutoDAO {
    public static Produto cadastrar(String nomeProduto, String categoria, String descricao, String preco, String imagem) {
        Produto produto = null;
        
        String sql = "INSERT INTO produtos (nomeProduto, categoria, fichaTecnica, preco, imagem) VALUES (?, ?, ?, ?, ?);";
        
        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection
                .prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ) {
            statement.setString(1, nomeProduto);
            statement.setString(2, categoria);
            statement.setString(3, descricao);
            statement.setString(4, preco);
            statement.setString(5, imagem);
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            if(rs.next()) {
                produto = new Produto(rs.getInt(1), nomeProduto, preco, categoria, descricao, imagem);
            }

            rs.close();

            return produto;  
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<Produto> listarTodos() {
        String sql = "SELECT * FROM produtos;";
        List<Produto> produtos = new ArrayList<>();

        try (
            Connection connection = Conexao.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
        ) {
            while(rs.next()) {
                produtos.add(
                    new Produto(
                        rs.getInt("id"), 
                        rs.getString("nomeProduto"), 
                        rs.getString("categoria"), 
                        rs.getString("fichaTecnica"),
                        rs.getString("preco"),
                        rs.getString("imagem")
                    )
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
            return produtos;
        } 

        return produtos;
        
    }

    public static Produto buscarPorId(Integer id) {
      String sql = "SELECT * FROM produtos WHERE id = ?;";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                return new Produto(
                    rs.getInt("lojaId"),
                    rs.getString("nomeProduto"),
                    rs.getString("preco"),
                    rs.getString("categoria"),
                    rs.getString("descricao"),
                    rs.getString("imagem")
                );
            }

            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return null;
    }

    // public static Usuario atualizarUsuario(Integer id, String nome, String email, String dataNascimento) {
    //     Usuario usuario = null;
    //     String sql = "UPDATE usuarios SET nome = ?, email = ?, dataNascimento = ? WHERE id = ?;";
        
    //     try (
    //         Connection connection = Conexao.getConnection();
    //         PreparedStatement statement = connection.prepareStatement(sql);
    //     ) {
    //         statement.setString(1, nome);
    //         statement.setString(2, email);
    //         statement.setString(3, dataNascimento);
    //         statement.setInt(4, id);
    //         int linhasAfetadas = statement.executeUpdate();
    
    //         if (linhasAfetadas > 0) {
    //             usuario = new Usuario(id, nome, email, dataNascimento);
    //         }
    
    //         return usuario;  
    //     } catch (SQLException e) {
    //         e.printStackTrace();
    //         return null;
    //     }
    // }
    
    
}

