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
    public static Produto cadastrar(String nome, Double preco, String categoria, String descricao, String Imagem) {
        Produto produto = null;
        
        String sql = "INSERT INTO produtos (nome, preco, categoria, descricao, imagem) VALUES (?, ?, ?, ?. ?);";
        
        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection
                .prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ) {
            statement.setString(1, nome);
            statement.setDouble(2, preco);
            statement.setString(3, categoria);
            statement.setString(4, descricao);
            statement.setString(5, Imagem);
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            if(rs.next()) {
                produto = new Produto(rs.getInt(1), nome, preco, categoria, descricao, Imagem);
            }

            rs.close();

            return produto;  
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    // public static List<Usuario> listarTodos() {
    //     String sql = "SELECT * FROM usuarios;";
    //     List<Usuario> alunos = new ArrayList<>();

    //     try (
    //         Connection connection = Conexao.getConnection();
    //         Statement statement = connection.createStatement();
    //         ResultSet rs = statement.executeQuery(sql);
    //     ) {
    //         while(rs.next()) {
    //             alunos.add(
    //                 new Usuario(
    //                     rs.getInt("id"), 
    //                     rs.getString("nome"), 
    //                     rs.getString("email"), 
    //                     rs.getString("senha"),
    //                     rs.getString("dataNascimento")
    //                 )
    //             );
    //         }
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //         return alunos;
    //     } 

    //     return alunos;
        
    // }

    // public static Usuario buscarPorId(Integer id) {
    //     String sql = "SELECT * FROM usuarios WHERE id = ?;";

    //     try (
    //         Connection connection = Conexao.getConnection();
    //         PreparedStatement statement = connection.prepareStatement(sql);
    //     ) {
    //         statement.setInt(1, id);
    //         ResultSet rs = statement.executeQuery();

    //         if (rs.next()) {
    //             return new Usuario(
    //                 rs.getInt("id"),
    //                 rs.getString("nome"),
    //                 rs.getString("email"),
    //                 rs.getString("senha"),
    //                 rs.getString("dataNascimento")
    //             );
    //         }

    //         rs.close();

    //     } catch (Exception e) {
    //         e.printStackTrace();
    //         return null;
    //     }

    //     return null;
    // }

    // public static Usuario buscarPorEmail(String email) {
    //     String sql = "SELECT * FROM usuarios WHERE email = ?;";

    //     try (
    //         Connection connection = Conexao.getConnection();
    //         PreparedStatement statement = connection.prepareStatement(sql);
    //     ) {
    //         statement.setString(1, email);
    //         ResultSet rs = statement.executeQuery();

    //         if (rs.next()) {
    //             return new Usuario(
    //                 rs.getInt("id"),
    //                 rs.getString("nome"),
    //                 rs.getString("email"),
    //                 rs.getString("senha"),
    //                 rs.getString("dataNascimento")
    //             );
    //         }

    //         rs.close();

    //     } catch (Exception e) {
    //         e.printStackTrace();
    //         return null;
    //     }

    //     return null;
    // }

    // public static Boolean login(String email, String senha) {
    //     Usuario usuario = buscarPorEmail(email);
    //     if (usuario != null) {
    //         BCrypt.Result result = BCrypt.verifyer().verify(senha.toCharArray(), usuario.getSenha());
    //         return result.verified;
    //     }
    //     return false;
    // }

    // public static Boolean existeComEmail(String email) {
    //     return buscarPorEmail(email) != null;
    // }



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
