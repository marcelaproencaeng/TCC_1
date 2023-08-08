package mongodb.fundatec.org.mongodb;


import mongodb.fundatec.org.mongodb.conexaoMongo.FordMongoConnection;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.rmi.UnknownHostException;


@SpringBootApplication
//@RestController
public class Principal {

    public static void main(String[] args) throws UnknownHostException {

//        SpringApplication.run(Principal.class, args);
//    }
        FordMongoConnection conexao = new FordMongoConnection();
        conexao.inserir("Ranger","2010","10000");
        conexao.mostrar();
//        conexao.atualizar("Ranger", "Maverick");
//        conexao.remover("Maverick");


    }
}


//    String uri = "mongodb+srv://marcelaproencaeng:rootrootroot@concessionaria.gvoppuo.mongodb.net/?retryWrites=true&w=majority";
//
//    MongoClientSettings settings = MongoClientSettings.builder()
//            .applyConnectionString(new ConnectionString(uri))
//            .build();
//    MongoClient mongoClient = MongoClients.create(settings);
//
//    MongoDatabase database = mongoClient.getDatabase("Carros");
//    MongoCollection<Document> volkswagen = database.getCollection("VOLKSWAGEN");
//    // Construct a ServerApi instance using the ServerApi.builder() method
//
//    @GetMapping("/")
//    public Document encontrarPrimeiro() {
//        return volkswagen.find().first();
//    }
////    @GetMapping("/carros")
////    public List<Carro> buscarCarros() {
////        Query query = new Query();
////        query.addCriteria(Criteria.where("marca").id("VOLKSWAGEN").and("modelo").is("Fiesta").and("valor")
////                .lte(150.000));
////        return carroRepository.find(query);
////
////    }
//
//    @PostMapping("/")
//    public ResponseEntity criarDoc(@RequestBody Carro carro) {
//
//        volkswagen.insertOne(new Document("Modelo", carro.getModelo())
//                .append("Ano", carro.getAno())
//                .append("Valor", carro.getValor()));
//
//        return new ResponseEntity<>(carro, HttpStatus.OK);
//    }
//
//    @GetMapping("/lista")
//    public ResponseEntity<List<Carro>> encontrarLista() {
//        FindIterable<Document> iterable = volkswagen.find();
//        List<Carro> documentos = new ArrayList<>();
//
//
//        for (Document doc : iterable) {
//            Carro carro = new Carro();
//            carro.setModelo(doc.getString("Fiesta"));
//            carro.setAno(doc.getString("Ano"));
//            carro.setValor(doc.getString("Valor"));
//            documentos.add(carro);
//        }
//        return new ResponseEntity<>(documentos,HttpStatus.OK);
//    }
//}
//
//
//
//
////    @GetMapping("/carros") {
////        public List<carro> buscarCarros () {
////            Query query = new Query();
////            query.addCriteria(Criteria.where("marca").is("FORD")
////                    .and("modelo").is("Fiesta")
////                    .and("valor").lte(30000));
////            return carroRepository.find(query);
////        }
////        return new ResponseEntity<>(documents, HttpStatus.OK);
////    }
//
//
//
//
//
//
//
//
//
