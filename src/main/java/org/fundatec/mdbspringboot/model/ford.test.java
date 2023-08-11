import org.springframework.boot.SpringApplication;

//public class MdbSpringBootApplication {
//
//
//    public static void main(String[] args) {
//        SpringApplication.run(org.fundatec.mdbspringboot.MdbSpringBootApplication.class, args);
//  // Replace the placeholder with your Atlas connection string
////    String uri = "mongodb+srv://marcelaproencaeng:rootrootmongodb@concessionaria.gvoppuo.mongodb.net/?retryWrites=true&w=majority";
//   MongoClientSettings settings = MongoClientSettings.builder()
//            .applyConnectionString(new ConnectionString(uri))
//            .build();
//MongoClient mongoClient = MongoClients.create(settings);
//    MongoDatabase database = mongoClient.getDatabase("Carros");
//    MongoCollection<Document> ford = database.getCollection("FORD");

//    @GetMapping
//    public Document buscarTodos() {
//        ford.getDocumentClass();
//        return null;
//    }


//    @PostMapping("/")
//    public ResponseEntity criarDocumento(@RequestBody Ford ford1) {
//        ford.insertOne(new Document("Modelo", ford1.getModelo())
//                .append("Ano", ford1.getAno())
//                .append("Valor", ford1.getValor()));
//        return new ResponseEntity<>(ford1, HttpStatus.OK);
//    }

//    @GetMapping("/lista")
//    public ResponseEntity<List<Ford>> retornarLista() {
//        List<Ford> documents = new ArrayList<>();
//
//        FindIterable<Document> iterable = ford.find();
//        for (Document doc : iterable) {
//            Ford ford1 = new Ford();
//            ford1.setModelo(doc.getString("Modelo"));
//            ford1.setAno(doc.getInteger("Ano"));
//            ford1.setValor(doc.getDouble("Valor"));
//            documents.add(ford1);
//        }
//        return new ResponseEntity<List<Ford>>(documents, HttpStatus.OK);
//    }
//}

//        #public void createFordItem () {
//            System.out.println("Data creation started...");
//            fordItemRepo.save(new Ford("1", "Fiesta", 2010, 150.000));
//            System.out.println("Data creation complete");
//        }
//        public void showAllFordItems () {
//            fordItemRepo.findAll().forEach(item -> System.out.println(getItemDetails(item)));
//        }
//        public void getFordItemsByModelo (String modelo){
//            System.out.println("Getting item by modelo: " + modelo);
//            Ford item = FordItemRepo.findItemByModelo(modelo);
//            System.out.println(getItemDetails(item));
//        }
//        public String getItemDetails (Ford item){
//
//            System.out.println(
//                    "Item Modelo: " + item.getModelo() +
//                            ", \nAno: " + item.getAno() +
//                            ", \nValor: " + item.getCategory()
//            );
//
//            return "";
//        }
//    }

//#Construct a ServerApi instance using the ServerApi.builder() method
////    ServerApi serverApi = ServerApi.builder()
////            .version(ServerApiVersion.V1)
////            .build();
//
//// #Create a new client and connect to the server
////        try (MongoClient mongoClient = MongoClients.create(settings)) {
////            MongoDatabase database = mongoClient.getDatabase("Carros");
////            MongoCollection<Document> ford = database.getCollection("FORD");
////            try {
////                // Send a ping to confirm a successful connection
////                Bson command = new BsonDocument("ping", new BsonInt64(1));
////                Document commandResult = database.runCommand(command);
////                System.out.println("Pinged your deployment. You successfully connected to MongoDB!");
////            } catch (MongoException me) {
////                System.err.println(me);
////            }
////        }