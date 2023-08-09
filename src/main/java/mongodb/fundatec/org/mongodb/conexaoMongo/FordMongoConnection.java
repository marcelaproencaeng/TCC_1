package mongodb.fundatec.org.mongodb.conexaoMongo;

import com.mongodb.*;
import java.rmi.UnknownHostException;


public class FordMongoConnection {
    DB BaseDados;
    DBCollection colecao;
    BasicDBObject Document = new BasicDBObject();

    public FordMongoConnection() throws UnknownHostException {
        Mongo mongo = new Mongo("localhost", 27017);
        BaseDados = mongo.getDB("Carros");
        colecao = BaseDados.getCollection("Ford");
        System.out.println("Conexão efetuada com sucesso!");
    }

//       try {
//        Mongo mongo = new Mongo("localhost", 27017);
//        BaseDados = mongo.getDB("Carros");
//        colecao = BaseDados.getCollection("Ford");
//        System.out.println("Conexão efetuada com sucesso!");
//    } catch (UnknownHostException e) {
//        Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, e);
//    }
//}

    public Boolean inserir(String Modelo,String Ano,String Valor) {
        Document.put("Modelo", Modelo);
        Document.put("Ano",Ano);
        Document.put("Valor",Valor);
        colecao.insert(Document);
        return true;
    }

    public void mostrar() {
        DBCursor cursor = colecao.find();
        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }
    }

    public Boolean atualizar(String ModeloAntigo, String ModeloNovo) {
        Document.put("Modelo", ModeloAntigo);
        BasicDBObject DocNovo = new BasicDBObject();
        DocNovo.put("Modelo", ModeloNovo);
        colecao.findAndModify(Document, DocNovo);
        return true;
    }

    public Boolean remover(String Modelo) {
        Document.put("Modelo", Modelo);
        colecao.remove(Document);
        return true;
    }


}

