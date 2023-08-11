package org.fundatec.mdbspringboot.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("Ford")
//@Data
public class Ford {
    @Id
    private String id;
    private String modelo;
    private Integer ano;
    private Double valor;

    public Ford() {

    }

    public Ford(String id, String modelo, Integer ano, Double valor) {
        super();
        this.id = id;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;

    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    //    DB BaseDados;
//    DBCollection colecao;
//    BasicDBObject Document = new BasicDBObject();
//
//    public FordConnection() throws UnknownHostException {
//        Mongo mongo = new Mongo("localhost", 27017);
//        BaseDados = mongo.getDB("Carros");
//        colecao = BaseDados.getCollection("Ford");
//        System.out.println("Conexão efetuada com sucesso!");
}

